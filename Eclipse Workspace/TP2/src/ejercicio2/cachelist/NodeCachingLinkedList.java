/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ejercicio2.cachelist;

import java.util.Set;
import java.util.HashSet;
import java.io.Serializable;

import korat.finitization.IFinitization;

import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

/**
 * A <code>List</code> implementation that stores a cache of internal Node objects
 * in an effort to reduce wasteful object creation.
 * <p>
 * A linked list creates one Node for each item of data added. This can result in
 * a lot of object creation and garbage collection. This implementation seeks to
 * avoid that by maintaining a store of cached nodes.
 * <p>
 * This implementation is suitable for long-lived lists where both add and remove
 * are used. Short-lived lists, or lists which only grow will have worse performance
 * using this class.
 * <p>
 * <b>Note that this implementation is not synchronized.</b>
 * 
 * @since Commons Collections 3.0
 * @version $Revision: 1.1 $ $Date: 2010/05/10 18:19:40 $
 * 
 * @author Jeff Varszegi
 * @author Rich Dougherty
 * @author Phil Steitz
 * @author Stephen Colebourne
 */

public class NodeCachingLinkedList implements Serializable {
	private static final long serialVersionUID = 1L;

	private  LinkedListNode header;
	private  int size;
	@SuppressWarnings("unused")
	private  int modCount;

	/**
	 * The default value for {@link #maximumCacheSize}.
	 */
	protected /*static*/ final int DEFAULT_MAXIMUM_CACHE_SIZE = 20;

	/**
	 * The first cached node, or <code>null</code> if no nodes are cached.
	 * Cached nodes are stored in a singly-linked list with
	 * <code>next</code> pointing to the next element.
	 */
	protected /*@ nullable @*/ LinkedListNode firstCachedNode;

	/**
	 * The size of the cache.
	 */
	protected  int cacheSize;

	/**
	 * The maximum size of the cache.
	 */
	protected int maximumCacheSize;

	//-----------------------------------------------------------------------
	protected LinkedListNode createHeaderNode() {
		return new LinkedListNode();
	}

	//-----------------------------------------------------------------------
	/**
	 * Constructor that creates.
	 */
	/*
	public NodeCachingLinkedList() {
		header = createHeaderNode();
		size = 0;
		cacheSize = 0;
		firstCachedNode = null;
		//DEFAULT_MAXIMUM_CACHE_SIZE = 20;
		maximumCacheSize = DEFAULT_MAXIMUM_CACHE_SIZE;
	}*/
	

	//-----------------------------------------------------------------------
	/**
	 * Gets the maximum size of the cache.
	 * 
	 * @return the maximum cache size
	 */
	protected int getMaximumCacheSize() {
		return maximumCacheSize;
	}

	/**
	 * Sets the maximum size of the cache.
	 * 
	 * @param maximumCacheSize  the new maximum cache size
	 */
	protected void setMaximumCacheSize(int maximumCacheSize) {
		this.maximumCacheSize = maximumCacheSize;
		shrinkCacheToMaximumSize();
	}

	/**
	 * Reduce the size of the cache to the maximum, if necessary.
	 */
	protected void shrinkCacheToMaximumSize() {
		// Rich Dougherty: This could be more efficient.
		while (cacheSize > maximumCacheSize) {
			getNodeFromCache();
		}
	}

	/**
	 * Gets a node from the cache. If a node is returned, then the value of
	 * {@link #cacheSize} is decreased accordingly. The node that is returned
	 * will have <code>null</code> values for next, previous and element.
	 *
	 * @return a node, or <code>null</code> if there are no nodes in the cache.
	 */
	protected LinkedListNode getNodeFromCache() {
		if (cacheSize == 0) {
			return null;
		}
		LinkedListNode cachedNode = firstCachedNode;
		firstCachedNode = cachedNode.next;
		cachedNode.next = null; // This should be changed anyway, but defensively
		// set it to null.                    
		cacheSize--;
		return cachedNode;
	}

	/**
	 * Checks whether the cache is full.
	 * 
	 * @return true if the cache is full
	 */
	protected boolean isCacheFull() {
		return cacheSize >= maximumCacheSize;
	}

	/**
	 * Adds a node to the cache, if the cache isn't full.
	 * The node's contents are cleared to so they can be garbage collected.
	 * 
	 * @param node  the node to add to the cache
	 */
	protected void addNodeToCache(LinkedListNode node) {
		if (isCacheFull()) {
			// don't cache the node.
			return;
		}
		// clear the node's contents and add it to the cache.
		LinkedListNode nextCachedNode = firstCachedNode;
		node.previous = null;
		node.next = nextCachedNode;
		node.setValue(null);
		firstCachedNode = node;
		cacheSize++;
	}

	//-----------------------------------------------------------------------    
	/**
	 * Creates a new node, either by reusing one from the cache or creating
	 * a new one.
	 * 
	 * @param value  value of the new node
	 * @return the newly created node
	 */
	protected LinkedListNode createNode(Object value) {
		LinkedListNode cachedNode = getNodeFromCache();
		if (cachedNode == null) {
			return super_createNode(value);
		} else {
			cachedNode.setValue(value);
			return cachedNode;
		}
	}

	/**
	 * Removes the specified node from the list.
	 *
	 * @param node  the node to remove
	 * @throws NullPointerException if <code>node</code> is null
	 */
	private void super_removeNode(LinkedListNode node) {
		node.previous.next = node.next;
		node.next.previous = node.previous;
		size--;
		modCount++;
	}

	/**
	 * Removes the node from the list, storing it in the cache for reuse
	 * if the cache is not yet full.
	 * 
	 * @param node  the node to remove
	 */
	protected void removeNode(LinkedListNode node) {
		super_removeNode(node);
		addNodeToCache(node);
	}

	/**
	 * Removes all the nodes from the list, storing as many as required in the
	 * cache for reuse.
	 * 
	 */
	protected void removeAllNodes() {
		// Add the removed nodes to the cache, then remove the rest.
		// We can add them to the cache before removing them, since
		// {@link AbstractLinkedList.removeAllNodes()} removes the
		// nodes by removing references directly from {@link #header}.
		int numberOfNodesToCache = Math_min(size, maximumCacheSize - cacheSize);
		LinkedListNode node = header.next;
		for (int currentIndex = 0; currentIndex < numberOfNodesToCache; currentIndex++) {
			LinkedListNode oldNode = node;
			node = node.next;
			addNodeToCache(oldNode);
		}
		super_removeAllNodes();
	}

	private int Math_min(int left, int right) {
		return left < right ? left : right;
	}

	//-----------------------------------------------------------------------    

	private LinkedListNode super_createNode(Object value) {
		return new LinkedListNode(value);
	}

	//-----------------------------------------------------------------------    

	private void super_removeAllNodes() {
		header.next = header;
		header.previous = header;
		size = 0;
		modCount++;
	}

	//-----------------------------------------------------------------------    

	public boolean remove(/*@ nullable @*/Object value) {
		for (LinkedListNode node = header.next; node != header; node = node.next) {
			if (isEqualValue(node.getValue(), value)) {
				removeNode(node);
				return true;
			}
		}
		return false;
	}

	//-----------------------------------------------------------------------    

	protected/*@ pure @*/boolean isEqualValue(Object value1, Object value2) {
		return (value1 == value2 || (value1 == null ? false : value1.equals(value2)));
	}

	//-----------------------------------------------------------------------    

	public boolean add(Object value) {
		addLast(value);
		return true;
	}

	//-----------------------------------------------------------------------    

	/**
	 * @Modifies_Everything
	 * 
	 * @Ensures return==true; 
	 */
	public boolean addLast(/*@ nullable @*/Object o) {
		addNodeBefore(header, o);
		return true;
	}

	//-----------------------------------------------------------------------    

	protected void addNodeBefore(LinkedListNode node, Object value) {
		LinkedListNode newNode = createNode(value);
		addNode(newNode, node);
	}

	//-----------------------------------------------------------------------    

	protected void addNode(LinkedListNode nodeToInsert,
			LinkedListNode insertBeforeNode) {
		nodeToInsert.next = insertBeforeNode;
		nodeToInsert.previous = insertBeforeNode.previous;
		insertBeforeNode.previous.next = nodeToInsert;
		insertBeforeNode.previous = nodeToInsert;
		size++;
		modCount++;
	}

	//-----------------------------------------------------------------------    

	/**
	 * @Modifies_Everything
	 * 
	 * @Ensures (some i: int | ( 0<=i && i<#(this.myseq) && this.myseq[i].value=arg ) )  
	 *          <=>  return==true ;
     *
	 */
	public boolean contains(/*@ nullable @*/Object arg) {
		return indexOf(arg) != -1;
	}

	//-----------------------------------------------------------------------    

	public/*@ pure @*/int indexOf(Object value) {
		int i = 0;
		for (LinkedListNode node = header.next; node != header; node = node.next) {
			if (isEqualValue(node.getValue(), value)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	//-----------------------------------------------------------------------

	/**
	 * @NormalBehavior
	 *   @Requires index >=0 && index<this.size ;
	 *   @Modifies_Everything
	 *   @Ensures
  	 *		  ( #(this.myseq)=#(@old(this.myseq))-1 )  &&
	 *		  ( all i: int | ( 0<=i && i<#(this.myseq) ) => (
	 *				 (  i < index => this.myseq[i]=@old(this.myseq[i])   ) && 
	 *				 (  i>= index => this.myseq[i]=@old(this.myseq)[i+1] ) 
	 *				));
	 *
	 * @ExceptionalBehavior
	 *   @Requires index<0 || index>=this.size ;
	 *   @Ensures throw in IndexOutOfBoundsException ;
	 */
	public/*@ nullable @*/Object removeIndex(int index) {
		LinkedListNode node = getNode(index, false);
		Object oldValue = node.getValue();
		removeNode(node);
		return oldValue;
	}

	//-----------------------------------------------------------------------
	protected LinkedListNode getNode(int index, boolean endMarkerAllowed)
			throws RuntimeException {
		// Check the index is within the bounds
		if (index < 0) {
			throw new RuntimeException("Couldn't get the node: "
					+ "index (" + index + ") less than zero.");
		}
		if (!endMarkerAllowed && index == size) {
			throw new RuntimeException("Couldn't get the node: "
					+ "index (" + index + ") is the size of the list.");
		}
		if (index > size) {
			throw new IndexOutOfBoundsException("Couldn't get the node: "
					+ "index (" + index + ") greater than the size of the "
					+ "list (" + size + ").");
		}
		// Search the list and get the node
		LinkedListNode node;
		if (index < (size / 2)) {
			// Search forwards
			node = header.next;
			for (int currentIndex = 0; currentIndex < index; currentIndex++) {
				node = node.next;
			}
		} else {
			// Search backwards
			node = header;
			for (int currentIndex = size; currentIndex > index; currentIndex--) {
				node = node.previous;
			}
		}
		return node;
	}
	
	public boolean repOK() {
		return checkLinkedList() && checkCache();
	}
	
	public boolean checkLinkedList() {
		//repOk de la lista doblemente encadenada
		//es una lista doblemente encadenada circular con elemento fixticio
		//if (header == null || header.previous==null || header.next==null) {

		if (header == null || header.previous==null || header.next==null || header.value!=null) {
			System.out.println("entro");
			return false;
		}
		LinkedListNode nodeBefore = header;
		//LinkedListNode node;
        Set<LinkedListNode> visited = new HashSet<LinkedListNode>();
		visited.add(header);
		int total = 0;
		for (LinkedListNode node = nodeBefore.next; node != header; node = node.next) {	
			if (node.previous == null || node.next == null) {
				return false;
			}

			if (node.previous != nodeBefore || !visited.add(node) || node.next==null)
				return false;
			total++;
			nodeBefore = node;
		}
		if (header.previous != nodeBefore || nodeBefore.next != header) {
			return false;
		}
		if (total != size) {
			return false;
		}
		return true;
	}
	
	public boolean checkCache() {
		if (maximumCacheSize < cacheSize)
			return false;
		  LinkedListNode auxCacheNode = firstCachedNode;
		  int total = cacheSize;
		  while(auxCacheNode !=null && total > 0) {

			  if (auxCacheNode.previous!=null ||  auxCacheNode.value!=null) {
				  return false;
			  }
			  auxCacheNode = auxCacheNode.next;
			  total--;
		  }
		  if (total!=0 || auxCacheNode!=null) {

			  return false;
		  }
		return true;
	}

	public static IFinitization finNodeCachingLinkedList(int numElem, int numCach) {
		IFinitization f = FinitizationFactory.create(NodeCachingLinkedList.class);
		//creo nodos lo usos para la lista principal y la cache
		IObjSet elements = f.createObjSet(LinkedListNode.class, numCach + numElem +1 , true);
		IIntSet aux1 = f.createIntSet(0, numElem);
		IIntSet aux2 = f.createIntSet(0, numCach);
		IIntSet aux3 = f.createIntSet(numCach, numCach);
		/*
		//Esto me atrasa mucho la generacion
		IObjSet values = f.createObjSet(IntObject.class, (rangeMax - rangeMin) +1, true);
		IIntSet vals = f.createIntSet(numMin, numMax);
		f.set("IntObject.i", vals);
		f.set("LinkedListNode.value", values);
		*/
		f.set("size", aux1);
		f.set("cacheSize", aux2);
		f.set("maximumCacheSize", aux3);
		f.set("header", elements);
		f.set("firstCachedNode", elements);
		f.set("LinkedListNode.next", elements);
		f.set("LinkedListNode.previous", elements);
		f.set("modCount", f.createIntSet(0, 0));
		//ver si hace falta ponerle algo a value:
		return f;
	}

	//-----------------------------------------------------------------------

}
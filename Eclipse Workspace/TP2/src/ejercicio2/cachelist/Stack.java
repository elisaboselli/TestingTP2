package ejercicio2.cachelist;

import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

public class Stack {

  public static class Node {
    Node next;
  }

  Node head;
  int size;

  public boolean repOK() {
    Node corr = this.head;
    int tamanho = this.size;
    while (corr != null && tamanho > 0) {
      corr = corr.next;
      tamanho--;
    }
    return (tamanho == 0 && corr == null);
  }

  public static IFinitization finStack(int minSize, int maxSize, int numNodes) {
    IFinitization f = FinitizationFactory.create(Stack.class);
    IObjSet entries = f.createObjSet(Node.class, numNodes, true);
    IIntSet sizes = f.createIntSet(minSize, maxSize);
    f.set("head", entries);
    f.set("size", sizes);
    f.set("Node.next", entries);
    return f;
  }

  public static IFinitization finStack(int nodes) {
    return finStack(0, nodes, nodes);
  }

}
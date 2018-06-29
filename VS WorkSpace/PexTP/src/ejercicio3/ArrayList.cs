using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics.Contracts;
using System.Collections;

namespace ArrayListProject
{
    public class ArrayList
    {
        private static int maxSize = 10;
        private Object[] items;
        private int last = -1;

        public ArrayList()
        {
            items = new Object[maxSize];
            last = -1;
        }

        public ArrayList(ICollection newItems)
        {
            if (items == null)
                items = new Object[maxSize];

            IEnumerator e = newItems.GetEnumerator();
            int i = 0;
            while ((e.MoveNext()) && (i < 10))
            {
                if (e.Current != null)
                    items[i] = e.Current;
                i++;
            }
            this.last = i - 1;
        }

        public int getLast()
        {
            return last;
        }

        // FIX: Ahora retorna maxSize en lugar de last
        public int getMaxSize()
        {
            return maxSize;
        }

        public void add(Object item, int position)
        {
            if (last + 1 == maxSize)
                throw new InsufficientMemoryException();

            int aux = last;
            while (aux >= position)
            {
                items[aux + 1] = items[aux];
                aux--;
            }
            items[position] = item;
            last++;   
        }

        public void remove(int position)
        {
            int aux = last;
            while (aux < position)
            {
                items[aux] = items[aux + 1];
                aux++;
            }
            last--;
        }
    }
}

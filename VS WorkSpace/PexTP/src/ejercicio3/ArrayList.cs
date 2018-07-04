using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics.Contracts;
using System.Collections;
using static PexTP.src.Utils.ArrayAuditor;

namespace ArrayListProject
{
    public class ArrayList : IEnumerable
    {
        private static int maxSize = 10;
        private Object[] items;
        private int last = -1;
        internal object[] getItem;

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

        [Pure]
        public int getLast()
        {
            return last;
        }

        [Pure]
        public int getMaxSize()
        {
            return maxSize;
        }

        [Pure]
        public object get(int index)
        {
            return items[index];
        }

        public void add(Object item, int position)
        {
            Contract.Requires((getLast() == -1 && position == 0) || (position >= 0 && position <= getLast()));
            Contract.Ensures(getLast() == (Contract.OldValue<int>(getLast()) + 1));
            Contract.Ensures(item == items[position]);
            Contract.Ensures(countItems(this, item) > Contract.OldValue<int>(countItems(this, item)));

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
            Contract.Requires(getLast() != -1);
            Contract.Requires(position >= 0 && position <= getLast());
            Contract.Ensures(getLast() == Contract.OldValue<int>(getLast()) - 1);
            Contract.Ensures(Contract.OldValue<int>(countItems(this,get(position))) > countItems(this, Contract.OldValue<object>(get(position))));

            int aux = position;
            while (aux < last)
            {
                items[aux] = items[aux + 1];
                aux++;
            }
            last--;

        }

        // Invariante de representación de ArrayList
        [ContractInvariantMethod]
        private void RepOk()
        {
            Contract.Invariant(last >= -1 && last < getMaxSize() && items != null);
        }

        public IEnumerator GetEnumerator()
        {
            for(int i = 0;i <= last; i++)
            {
                yield return items[i];
            }
        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ArrayListProject;
using System.Diagnostics.Contracts;

namespace PexTP.src.Utils
{
    public static class ArrayAuditor
    {
        [Pure]
        public static int countItems(object[] target,object item,int inclusiveBoundary)
        {
            int counter = 0;
            for(int i=0;i<= inclusiveBoundary; i++)
            {
                if (target[i] == null)
                    counter += item == null ? 1 : 0;
                else
                    counter += target[i].Equals(item)? 1 : 0;
            }
            return counter;
        }

        [Pure]
        public static int countItems(ArrayList list, object item)
        {
            int counter = 0;
            foreach(object o in list)
            {
                if (o == null)
                    counter += item == null ? 1 : 0;
                else
                    counter += o.Equals(item) ? 1 : 0;
            }
            return counter;
        }
    }
}

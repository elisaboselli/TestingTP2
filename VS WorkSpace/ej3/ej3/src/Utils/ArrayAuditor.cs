using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ArrayListProject;

namespace PexTP.src.Utils
{
    public static class ArrayAuditor
    {
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

      
    }
}

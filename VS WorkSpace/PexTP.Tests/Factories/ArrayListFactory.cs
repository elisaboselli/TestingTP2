using ArrayListProject;
using System;
using Microsoft.Pex.Framework;

namespace ArrayListProject
{
    /// <summary>A factory for ArrayListProject.ArrayList instances</summary>
    public static partial class ArrayListFactory
    {
        /// <summary>A factory for ArrayListProject.ArrayList instances</summary>
        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList Create()
        {
            object[] items = { 1, "test", 0, null, new DateTime() };
            ArrayList arrayList = new ArrayList(items);
            return arrayList;
        }

        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList creatEmpty()
        {
            ArrayList arrayList = new ArrayList();
            return arrayList;
        }

        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList createFull()
        {
            ArrayList arrayList = new ArrayList();
            for(int i = 0; i < arrayList.getMaxSize(); i++)
            {
                arrayList.add(i, 0);
            }
            return arrayList;
        }

    }
}

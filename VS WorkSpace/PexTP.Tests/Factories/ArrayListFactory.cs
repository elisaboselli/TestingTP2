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
            ArrayList arrayList = new ArrayList();
            return arrayList;

            // TODO: Edit factory method of ArrayList
            // This method should be able to configure the object in all possible ways.
            // Add as many parameters as needed,
            // and assign their values to each field by using the API.
        }
    }
}

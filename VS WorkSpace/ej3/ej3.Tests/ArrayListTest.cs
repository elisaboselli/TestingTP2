using System;
using ArrayListProject;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ArrayListProject.Tests
{
    /// <summary>This class contains parameterized unit tests for ArrayList</summary>
    [PexClass(typeof(ArrayList))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [TestClass]
    public partial class ArrayListTest
    {
        /// <summary>Test stub for add(Object, Int32)</summary>
        [PexMethod]
        [PexAllowedException(typeof(InsufficientMemoryException))]
        public void addTest(
            [PexAssumeUnderTest]ArrayList target,
            object item,
            int position
        )
        {
            target.add(item, position);
            // TODO: add assertions to method ArrayListTest.addTest(ArrayList, Object, Int32)
        }
    }
}

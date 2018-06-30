using System.Collections;
using System;
using ArrayListProject;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ArrayListProject.Tests
{
    /// <summary>This class contains parameterized unit tests for ArrayList</summary>
    [TestClass]
    [PexClass(typeof(ArrayList))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    public partial class ArrayListTest
    {

        /// <summary>Test stub for add(Object, Int32)</summary>
        [PexMethod(MaxRunsWithoutNewTests = 200)]
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

        /// <summary>Test stub for remove(Int32)</summary>
        [PexMethod]
        public void removeTest([PexAssumeUnderTest]ArrayList target, int position)
        {
            target.remove(position);
            // TODO: add assertions to method ArrayListTest.removeTest(ArrayList, Int32)
        }
    }
}

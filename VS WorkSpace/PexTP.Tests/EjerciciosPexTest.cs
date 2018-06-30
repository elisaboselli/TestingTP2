using System;
using EjerciciosPex;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace EjerciciosPex.Tests
{
    /// <summary>This class contains parameterized unit tests for EjerciciosPex</summary>
    [PexClass(typeof(global::EjerciciosPex.EjerciciosPex))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [TestClass]
    public partial class EjerciciosPexTest
    {
        /// <summary>Test stub for cal(Int32, Int32, Int32, Int32, Int32)</summary>
        [PexMethod]
        public int calTest(
            int month1,
            int day1,
            int month2,
            int day2,
            int year
        )
        {
            int result
               = global::EjerciciosPex.EjerciciosPex.cal(month1, day1, month2, day2, year);
            return result;
        }

        private static Boolean leapYear(int year)
        {
            int m4 = year % 4;
            int m100 = year % 100;
            int m400 = year % 400;
            if ((m4 != 0) || ((m100 == 0) && (m400 != 0)))
                return false;
            return true;
        }

        /// <summary>Test stub for patternIndex(String, String)</summary>
        [PexMethod(MaxRunsWithoutNewTests = 300, MaxBranches = 20000)]
        public int patternIndexTest(string subject, string pattern)
        {
            int result = global::EjerciciosPex.EjerciciosPex.patternIndex(subject, pattern);
            return result;
            // TODO: add assertions to method EjerciciosPexTest.patternIndexTest(String, String)
        }
    }
}

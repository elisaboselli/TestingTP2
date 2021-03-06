using System;
using EjerciciosPex;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Text.RegularExpressions;

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
        [PexMethod(MaxRunsWithoutNewTests = 200)]
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


        /// <summary>Test stub for patternIndex(String, String)</summary>
        [PexMethod(MaxRunsWithoutNewTests = 300, MaxBranches = 20000)]
        [PexAllowedException(typeof(ArgumentNullException))]
        public int patternIndexTest(string subject, string pattern)
        {
            // Formar cadenas sin el caracter de escape '\'
            PexAssume.IsTrue(subject != null && pattern != null);
            PexAssume.IsTrue(Regex.IsMatch(subject, "^[a-zA-Z0-9]*$"));
            PexAssume.IsTrue(Regex.IsMatch(pattern, "^[a-zA-Z0-9]*$"));
            int result = global::EjerciciosPex.EjerciciosPex.patternIndex(subject, pattern);
            return result;
        }

    }
}

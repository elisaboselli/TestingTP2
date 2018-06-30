using System;
using System.Collections.Generic;
using System.Linq;
using System.Diagnostics.Contracts;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosPex 
{
    public class EjerciciosPex
    {
        static void Main(string[] args)
        {
        }

        public static int patternIndex(String subject, String pattern)
        {
	    // Post: if pattern is not a substring of subject, return -1
	    //      else return (zero-based) index where the pattern (first)
	    //      starts in subject 
            int NOTFOUND = -1;
            int iSub = 0, rtnIndex = NOTFOUND;
            bool isPat = false;
            int subjectLen = subject.Length;
            int patternLen = pattern.Length;

            while (isPat == false && iSub + patternLen - 1 < subjectLen)
            {
                if (subject.ElementAt(iSub) == pattern.ElementAt(0))
                {
                    rtnIndex = iSub; // Starting at zero
                    isPat = true;
                    for (int iPat = 1; iPat < patternLen; iPat++)
                    {
                        if (subject.ElementAt(iSub + iPat) != pattern.ElementAt(iPat))
                        {
                            rtnIndex = NOTFOUND;
                            isPat = false;
                            break;  // out of for loop
                        }
                    }
                }
                iSub++;
            }
            return (rtnIndex);
        }


        public static int cal(int month1, int day1, int month2,
            int day2, int year)
        {
            Contract.Requires(month1 <= month2);
            Contract.Requires(1 <= month1 && month1 <= 12,"Mes 1 en rango");
            Contract.Requires(1 <= month2 && month2 <= 12,"Mes 2 en rango");
            Contract.Requires(1 <= day1 && day1 <= 31,"Dia 1 en rango");
            Contract.Requires(1 <= day2 && day2 <= 31,"Dia 2 en rango");
            Contract.Requires(1 <= year && year <= 10000,"Año valido");
            Contract.Ensures(Contract.Result<int>() <= 366 && 0 <= Contract.Result<int>(),"Distancia en dias entre fechas valida");
            //***********************************************************
            // Calculate the number of Days between the two given days in
            // the same year.
            // preconditions : day1 and day2 must be in same year
            //               1 <= month1, month2 <= 12
            //               1 <= day1, day2 <= 31
            //               month1 <= month2
            //               The range for year: 1 ... 10000
            //***********************************************************
            int numDays;

            if (month2 == month1) // in the same month
                numDays = day2 - day1;
            else
            {
                // Skip month 0.
                int[] daysIn = new int[] { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                // Are we in a leap year?
                int m4 = year % 4;
                int m100 = year % 100;
                int m400 = year % 400;
                if ((m4 != 0) || ((m100 == 0) && (m400 != 0)))
                    daysIn[2] = 28;
                else
                    daysIn[2] = 29;

                // start with days in the two months
                numDays = day2 + (daysIn[month1] - day1);

                // add the days in the intervening months
                for (int i = month1 + 1; i <= month2 - 1; i++)
                    numDays = daysIn[i] + numDays;
            }
            return (numDays);
        }

    }
}

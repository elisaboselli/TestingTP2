using System;
using System.Diagnostics.Contracts;

namespace Utils
{
    public static class DateValidator
    {
        [Pure]
        public static Boolean verifyDate(int day,int month,int year)
        {
            String date = month.ToString() + '-' + day.ToString() + '-' + year.ToString();
            DateTime dateTime;
            return DateTime.TryParse(date, out dateTime);
        }
    }
}

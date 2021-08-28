using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    public class Extreme
    {

        public static List<T> Smallest<T>(T[] values) where T : IComparable
        {
            if (values.Length == 0)
            {
                throw new Exception("input array is empty");
            }
            List<T> min = new List<T>();
            int compareValue;
            foreach (var value in values)
            {
                if (min.Any())
                {
                    compareValue = value.CompareTo(min.ElementAt(0));
                    if (compareValue < 0)
                    {
                        min.Clear();
                        min.Add(value);
                    }
                    else if (compareValue == 0)
                    {
                        min.Add(value);
                    }
                }
                else
                {
                    min.Add(value);
                }
            }
            return min;
        }

        public static List<T> Biggest<T>(T[] values) where T : IComparable
        {
            if (values.Length == 0)
            {
                throw new Exception("input array is empty");
            }
            List<T> max = new List<T>();
            int compareValue;
            foreach (var value in values)
            {
                if (max.Any())
                {
                    compareValue = value.CompareTo(max.ElementAt(0));
                    if (compareValue > 0)
                    {
                        max.Clear();
                        max.Add(value);
                    }
                    else if (compareValue == 0)
                    {
                        max.Add(value);
                    }
                }
                else
                {
                    max.Add(value);
                }
            }
            return max;
        }
    }
}

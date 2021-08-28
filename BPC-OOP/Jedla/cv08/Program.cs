using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv08
{
    class Program
    {
        static void Main(string[] args)
        {
            List<double> temperaturesFory09 = new List<double>();
            temperaturesFory09.AddRange(new double[] { -2, 8, 5, -7, 1, 11, 7, 13, 18, 10, 9, 2 });
            YearTemperature y09 = new YearTemperature(2009, temperaturesFory09);
         
            Console.WriteLine("Archive logic");
            TemperatureArchive t = new TemperatureArchive();
            t.Load();
            Console.WriteLine(t.PrintTemperature());
            t.Calibration(0.1);
            Console.WriteLine("After calibration");
            Console.WriteLine(t.PrintTemperature());
            Console.WriteLine(t.findYearTemperature(2010));
            Console.WriteLine(t.AverageYearTemperature());
            Console.WriteLine(t.AverageMonthlyTemperature());
            Console.WriteLine("add new year");
            t.AddToArchive(y09);
            Console.WriteLine(t.PrintTemperature());
            t.Save();
            Console.WriteLine();
            Console.WriteLine("One year operation");
            Console.WriteLine("Max temp: {0}   min temp: {1}   average temp: {2}", y09.MaxTemperature, y09.MinTemperature, y09.AverageTemperature);
            Console.WriteLine(String.Join(" ", y09.MonthTemperature.Select(r => string.Format("{0:N1}", r))));
            Console.ReadLine();


        }
    }
}

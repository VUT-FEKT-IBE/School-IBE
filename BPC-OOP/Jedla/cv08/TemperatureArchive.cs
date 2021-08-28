using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv08
{
    public class TemperatureArchive
    {
        private SortedDictionary<int, YearTemperature> _archive = new SortedDictionary<int, YearTemperature>();

        private const string MainDirectory = "C:\\Users\\Jakub\\Desktop\\vut_fekt\\school_2020_2021\\OOP\\cvika\\BPC-OOP\\cv08";
        private const string InputFile = "inputTemperature.txt";
        private const string OutputFile = "outputTemperature.txt";

        public void AddToArchive(YearTemperature yearTemperature)
        {
            _archive.Add(yearTemperature.Year, yearTemperature);
        }

        public void Load()
        {
            try
            {
                String path = Path.Combine(MainDirectory, InputFile);
                StreamReader sr = new StreamReader(path);

                String line = sr.ReadLine();
                while (line != null)
                {
                    List<double> temperature = new List<double>();
                    line.Replace(" ", "");
                    string[] splitter = line.Split(new Char[] { ':', ';' });
                    for (int i = 1; i < splitter.Length; i++)
                    {
                        temperature.Add(Convert.ToDouble(splitter[i]));
                    }
                    _archive.Add(Convert.ToInt32(splitter[0]), new YearTemperature(Convert.ToInt32(splitter[0]), temperature));

                    line = sr.ReadLine();
                }
                sr.Close();

            }
            catch (Exception e)
            {
                throw new Exception("{0}", e);
            }
        }

        public void Save()
        {
            try
            {
                String path = Path.Combine(MainDirectory, OutputFile);
                StreamWriter sw = new StreamWriter(path); // append: true

                SortedDictionary<int, YearTemperature>.ValueCollection valueColl =
                _archive.Values;

                foreach (YearTemperature s in valueColl)
                {
                    sw.Write(String.Format("{0}: " + String.Join("; ", s.MonthTemperature.Select(r => string.Format("{0:N1}", r))) + "\n", s.Year));
                }
                sw.Close();

            }
            catch (Exception e)
            {
                throw new Exception("{0}", e);
            }
        }

        public YearTemperature findYearTemperature(int year)
        {
            if (_archive.TryGetValue(year, out YearTemperature value))
            {
                return value;
            }
            else
            {
                return null;
            }
        }

        public void Calibration(double calibrationValue)
        {
            SortedDictionary<int, YearTemperature>.ValueCollection valueColl =
            _archive.Values;
            foreach (YearTemperature s in valueColl)
            {
                s.Calibration(calibrationValue);
            }
        }

        public string AverageYearTemperature()
        {
            StringBuilder ret = new StringBuilder();
            SortedDictionary<int, YearTemperature>.ValueCollection valueColl = _archive.Values;
            foreach (var s in valueColl)
            {
                ret = ret.AppendLine(String.Format("{0}:    {1:N1}", s.Year, s.AverageTemperature));
            }

            return ret.ToString();
        }

        public string AverageMonthlyTemperature()
        {
            StringBuilder ret = new StringBuilder();
            SortedDictionary<int, YearTemperature>.ValueCollection valueColl = _archive.Values;
            List<double> averageMonthTemperature = new List<double>();
            double monthAverage;
            int counter = 0;
            for (int i = 0; i < _archive.FirstOrDefault().Value.MonthTemperature.Count(); i++)
            {
                monthAverage = 0;
                counter = 0;
                foreach (var s in valueColl)
                {
                    monthAverage += s.MonthTemperature[i];
                    counter++;
                }
                averageMonthTemperature.Add(monthAverage/counter);
            }
            ret = ret.AppendLine(String.Format("Average: " + String.Join(" ", averageMonthTemperature.Select(r => string.Format("{0:N1}", r)))));
            return ret.ToString();
        }
        public string PrintTemperature()
        {
            StringBuilder ret = new StringBuilder();
            SortedDictionary<int, YearTemperature>.ValueCollection valueColl = _archive.Values;
            foreach (var s in valueColl)
            {
                ret = ret.AppendLine(String.Format("{0}", s));
                //Console.WriteLine("Value = {0}", s);
            }

            return ret.ToString();
        }

    }
}

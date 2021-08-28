using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv08
{
    public class YearTemperature
    {
        private List<double> monthTemperature;

        public List<double> MonthTemperature
        {
            get
            {
                return monthTemperature;
            }
            private set
            {
                monthTemperature = value;
            }
        }
        public int Year { get; set; }

        public double MaxTemperature { get; private set; }

        public double MinTemperature { get; private set; }

        public double AverageTemperature { get; private set; }

        public YearTemperature(int year, List<double> monthTemperature = null)
        {
            if (monthTemperature != null)
            {
                this.MonthTemperature = monthTemperature;
                SetMinMaxAverage();
            }
            else
            {
                this.MonthTemperature = new List<double>();
            }
            Year = year;
        }

        public void AddMonthTemeperature(double temperature)
        {
            monthTemperature.Add(temperature);
            SetMinMaxAverage();
        }

        public void Calibration(double CalibrationValue)
        {
            for (int i = 0; i < monthTemperature.Count(); i++)
            {
                monthTemperature[i] = monthTemperature.ElementAt(i) + CalibrationValue;
            }
        }

        private void ComputeAverageTemperature()
        {
            double sumOfTemperature = 0;
            foreach (var temperature in monthTemperature)
            {
                sumOfTemperature += temperature;
            }
            AverageTemperature = sumOfTemperature / monthTemperature.Count();
        }

        private void SetMinMaxAverage()
        {
            List<double> sortHelp = monthTemperature.ToList();
            sortHelp.Sort();
            MinTemperature = sortHelp.ElementAt(0);
            MaxTemperature = sortHelp.Last();
            ComputeAverageTemperature();
        }

        public override string ToString()
        {
            return String.Format("Year {0}: " + String.Join(" ", monthTemperature.Select(r => string.Format("{0:N1}", r)) ), Year);
        }

    }
}

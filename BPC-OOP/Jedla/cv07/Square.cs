using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Square : Object2D
    {
        private double lenght;
        public double Lenght
        {
            get
            {
                return lenght;
            }
            set
            {
                lenght = value;
                this.Area = ComputeArea();
            }
        }

        public Square(double lenght)
        {
            this.lenght = lenght;
            this.Area = this.ComputeArea();
        }

        public override double ComputeArea()
        {
            return lenght * lenght;
        }

        public override string ToString()
        {
            return String.Format("{0} with area of {1:F4}. Lenght = {2}", this.GetType().Name, this.Area, lenght);
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Rectangle : Object2D
    {
        private double lenght;
        private double width;
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
        public double Width {
            get
            {
                return width;
            }
            set
            {
                width = value;
                this.Area = ComputeArea();
            }
        }

        public Rectangle(double lenght, double width)
        {
            this.lenght = lenght;
            this.width = width;
            this.Area = this.ComputeArea();
        }
        public override double ComputeArea()
        {
            return lenght * width;
        }

        public override string ToString()
        {
            return String.Format("{0} with area of {1:F4}. Lenght = {2} and width = {3}", this.GetType().Name, this.Area, lenght, width);
        }
    }
}

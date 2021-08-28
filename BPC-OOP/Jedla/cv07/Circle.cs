using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Circle : Object2D
    {
        private double radius;
        public double Radius
        {
            get
            {
                return radius;
            }
            set
            {
                radius = value;
                this.Area = ComputeArea();
            }
        }

        public Circle(double radius)
        {
            this.radius = radius;
            this.Area = this.ComputeArea();
        }
        public override double ComputeArea()
        {
            return Math.PI * radius * radius;
        }

        public override string ToString()
        {
            return String.Format("{0} with area of {1:F4}. Radius = {2}", this.GetType().Name, this.Area, radius);
        }
    }
}

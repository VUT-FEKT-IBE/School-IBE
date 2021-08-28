using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Ellipse : Object2D
    {
        private double radiusA;
        private double radiusB;
        public double RadiusA
        {
            get
            {
                return radiusA;
            }
            set
            {
                radiusA = value;
                this.Area = ComputeArea();
            }
        }
        public double RadiusB
        {
            get
            {
                return radiusB;
            }
            set
            {
                radiusB = value;
                this.Area = ComputeArea();
            }
        }

        public Ellipse(double radiusA, double radiusB)
        {
            this.radiusA = radiusA;
            this.radiusB = radiusB;
            this.Area = this.ComputeArea();
        }
        public override double ComputeArea()
        {
            return Math.PI * radiusA * radiusA;
        }

        public override string ToString()
        {
            return String.Format("{0} with area of {1:F4}. RadiusA = {2} and RadiusB = {3}", this.GetType().Name, this.Area, radiusA, radiusB);
        }
    }
}

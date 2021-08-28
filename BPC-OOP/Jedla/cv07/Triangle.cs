using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Triangle : Object2D
    {
        private double sideA;
        private double sideB;
        private double sideC;
        public double SideA
        {
            get
            {
                return sideA;
            }
            set
            {
                sideA = value;
                this.Area = ComputeArea();
            }
        }
        public double SideB
        {
            get
            {
                return sideB;
            }
            set
            {
                sideB = value;
                this.Area = ComputeArea();
            }
        }
        public double SideC
        {
            get
            {
                return sideC;
            }
            set
            {
                sideC = value;
                this.Area = ComputeArea();
            }
        }

        public Triangle(double sideA, double sideB, double sideC)
        {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.Area = this.ComputeArea();
        }
        public override double ComputeArea()
        {
            //heron algoritmus
            double s = (sideA + sideB + sideC) / 2;
            return Math.Sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

        public override string ToString()
        {
            return String.Format("{0} with area of {1:F4}. Side a = {2}, side b = {3} and side c = {4}", this.GetType().Name, this.Area, sideA, sideB, sideC);
        }
    }
}

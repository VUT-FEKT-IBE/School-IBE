using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Triangle : Object2D
    {
        public double SideA { get; set; }
        public double SideB { get; set; }
        public double SideC { get; set; }
        
        public Triangle(double sideA, double sideB, double sideC)
        {
            this.SideA = sideA;
            this.SideB = sideB;
            this.SideC = sideC;
        }
        public override double ComputeArea()
        {
            //heron algoritmus
            double s = (SideA + SideB + SideC)/2;
            return Math.Sqrt(s * (s - SideA) * (s - SideB) * (s - SideC));
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (sideA = {1}, sideB = {2}, sideC = {3})", this.GetType().Name, SideA, SideB, SideC);
        }
    }
}

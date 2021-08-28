using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Circle : Object2D
    {

        public double Radius { get; set; }
        
        public Circle(double radius)
        {
            this.Radius = radius;
        }
        public override double ComputeArea()
        {
            return Math.PI * Radius * Radius;
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (radius = {1})", this.GetType().Name, Radius);
        }
    }
}

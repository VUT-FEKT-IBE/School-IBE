using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Sphere : Object3D
    {
        public double Radius { get; set; }

        public Sphere(double radius)
        {
            this.Radius = radius;
        }
        public override double ComputeSurface()
        {
            return 4 * Math.PI * Radius * Radius;
        }

        public override double ComputeVolume()
        {
            return 4 / 3 * Math.PI * Radius * Radius * Radius;
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (radius = {1})", this.GetType().Name, Radius);
        }
    }
}

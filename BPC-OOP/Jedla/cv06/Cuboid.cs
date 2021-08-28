using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Cuboid : Object3D
    {

        public double Lenght { get; set; }
        public double Width { get; set; }
        public double Height { get; set; }

        public Cuboid(double lenght, double width, double height)
        {
            this.Lenght = lenght;
            this.Width = width;
            this.Height = height;
        }

        public override double ComputeSurface()
        {
            return 2 * (Lenght + Width + Height);
        }

        public override double ComputeVolume()
        {
            return Lenght * Width * Height;
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (lenght = {1}, width = {2}, height = {3})", this.GetType().Name, Lenght, Width, Height);
        }
    }
}

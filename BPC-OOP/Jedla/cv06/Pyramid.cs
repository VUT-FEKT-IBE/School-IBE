using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Pyramid : Object3D
    {
        public double Lenght { get; set; }
        public double Width { get; set; }
        public double Height { get; set; }

        public Pyramid(double lenght, double width, double height)
        {
            this.Lenght = lenght;
            this.Width = width;
            this.Height = height;
        }
        public override double ComputeSurface()
        {
            double widthTriangle = Width * Math.Sqrt(Math.Pow(Lenght / 2, 2) + Height * Height);

            double lenghtTriangle = Lenght * Math.Sqrt(Math.Pow(Width / 2, 2) + Height * Height);

            return Lenght * Width + lenghtTriangle + widthTriangle;

        }

        public override double ComputeVolume()
        {
            return (Lenght * Width * Height) / 3;
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (lenght = {1}, width = {2}, height = {3})", this.GetType().Name, Lenght, Width, Height);
        }
    }
}

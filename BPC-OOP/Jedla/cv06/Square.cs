using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Square : Object2D
    {
        public double Lenght { get; set; }

        public Square(double lenght)
        {
            this.Lenght = lenght;
        }

        public override double ComputeArea()
        {
            return Lenght * Lenght;
        }

        public override void Draw()
        {
            Console.WriteLine("{0} (side = {1})", this.GetType().Name, Lenght);
        }
    }
}

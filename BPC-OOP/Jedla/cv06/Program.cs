using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public class Program
    {
        static void Main(string[] args)
        {
            double totalArea = 0;
            double totalSurface = 0;
            double totalVolume = 0;
            Circle circle = new Circle(2);
            Rectangle rectangle = new Rectangle(2, 4);
            Square square = new Square(2);
            Ellipse ellipse = new Ellipse(2, 3);
            Triangle triangle = new Triangle(3, 2, 2);
            Cuboid cuboid = new Cuboid(2, 3, 4);
            Cylinder cylinder = new Cylinder(2, 5);
            Sphere sphere = new Sphere(2);
            Pyramid pyramid = new Pyramid(2, 3, 5);

            List<GroupOfObjects> objects = new List<GroupOfObjects>() {
                circle, rectangle, square, ellipse, triangle,
                cuboid, cylinder, sphere, pyramid
            };

            foreach (var item in objects)
            {
                item.Draw();
                if (item is Object2D)
                {
                    totalArea += ((Object2D)item).ComputeArea();
                }
                else if (item is Object3D)
                {
                    totalSurface += ((Object3D)item).ComputeSurface();
                    totalVolume += ((Object3D)item).ComputeVolume();
                }
                else
                {
                    Console.WriteLine("not 2D or 3D object");
                }
            }

            Console.WriteLine("Total area of 2D objects is {0:F4}.\nTotal volume of 3D objects is {1:F2}.\n" +
                "Total volume of 3D objects is {2:F2}.", totalArea, totalSurface, totalVolume);
            Console.ReadLine();

        }
    }
}

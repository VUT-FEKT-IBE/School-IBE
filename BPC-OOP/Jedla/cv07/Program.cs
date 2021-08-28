using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv07
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 1, 3, 5, 7, 9 };
            Circle[] circleArr = new Circle[] { new Circle(4), new Circle(5), new Circle(1) };
            Ellipse[] ellipseArr = new Ellipse[] { new Ellipse(5, 1), new Ellipse(7, 5), new Ellipse(5, 6), new Ellipse(2, 8) };
            Rectangle[] rectangleArr = new Rectangle[] { new Rectangle(5, 6), new Rectangle(2, 1), new Rectangle(1, 5) };
            Square[] squareArr = new Square[] { new Square(5), new Square(17), new Square(12), new Square(8) };
            Triangle[] triangleArr = new Triangle[] { new Triangle(11, 4, 8), new Triangle(5, 6, 11), new Triangle(6, 4, 7) };
            Object2D[] object2DArr = new Object2D[] { new Circle(5), new Ellipse(5, 1), new Rectangle(5, 6), new Square(5), new Triangle(11, 4, 8), };

            Console.WriteLine("Biggest and smallest circles");
            Console.WriteLine(ArrToString(Extreme.Biggest(circleArr).ToArray()));
            Console.WriteLine(ArrToString(Extreme.Smallest(circleArr).ToArray()));

            Console.WriteLine("\nBiggest and smallest ellipses");
            Console.WriteLine(ArrToString(Extreme.Biggest(ellipseArr).ToArray()));
            Console.WriteLine(ArrToString(Extreme.Smallest(ellipseArr).ToArray()));

            Console.WriteLine("\nBiggest and smallest rectangles");
            Console.WriteLine(ArrToString(Extreme.Biggest(rectangleArr).ToArray()));
            Console.WriteLine(ArrToString(Extreme.Smallest(rectangleArr).ToArray()));

            Console.WriteLine("\nBiggest and smallest squares");
            Console.WriteLine(ArrToString(Extreme.Biggest(squareArr).ToArray()));
            Console.WriteLine(ArrToString(Extreme.Smallest(squareArr).ToArray()));

            Console.WriteLine("\nBiggest and smallest trinagles");
            Console.WriteLine(ArrToString(Extreme.Biggest(triangleArr).ToArray()));
            Console.WriteLine(ArrToString(Extreme.Smallest(triangleArr).ToArray()));

            Console.WriteLine("\nBiggest and smallest objects");
            Console.WriteLine(ArrToString(Extreme.Biggest(object2DArr).ToArray()));
            Console.WriteLine(String.Join("\n", Extreme.Smallest(object2DArr)));

            Console.WriteLine("\nBiggest and smallest integer");
            Console.WriteLine(ArrToString(Extreme.Biggest(arr).ToArray()));
            Console.WriteLine(String.Join("\n",Extreme.Smallest(arr).ToArray()));

            // https://stackoverflow.com/questions/1912128/filter-an-array-in-c-sharp
            Console.WriteLine("Filtered values");
            Console.WriteLine(ArrToString(arr.Where(e => e > 4 && e <8).ToArray()));
            Console.ReadLine();
        }
        // help method for return string with array
        public static String ArrToString(Array list)
        {
            String ret = "";

            foreach (var item in list)
            {
                if (ret.Equals(""))
                {
                    ret = ret + item.ToString();
                }
                else
                {
                    ret = ret + "\n" + item.ToString();
                }
            }

            return ret;
        }
    }
}

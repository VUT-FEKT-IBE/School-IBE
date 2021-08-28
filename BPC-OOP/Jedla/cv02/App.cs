using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv02
{
    public class App
    {
        static void Main(string[] args)
        {
            // use C# docs for System.numerics and https://www.hackmath.net/cz/kalkulacka/komplexni-cisla for testing
            Complex c = new Complex(5.1, -8.6);
            Complex c2 = new Complex(5.1, -8.6);
            TestComplex.Test(new Complex(2.1,3.8) + new Complex(1,4), new Complex(3.1,7.8), "test +");
            TestComplex.Test(new Complex(2.1, 3.8) - new Complex(1, 4), new Complex(1.1, 0.2), "test -");
            TestComplex.Test(new Complex(2.1, 3.8) * new Complex(1, 4), new Complex(-13.1, 12.2), "test *");
            TestComplex.Test(new Complex(2.1, 3.8) / new Complex(1, 4), new Complex(1.0176471, 0.2705882), "test /");
            TestComplex.Test(-new Complex(2.1, 3.8), new Complex(-2.1, -3.8), "test u-");
            TestComplex.Test(new Complex(2.1, 3.8).Conjugate(), new Complex(2.1, -3.8), "test conjugate");
            // next test fail for testing purpose
            TestComplex.Test(new Complex(2.1, 3.8).Conjugate(), new Complex(-2.1, -3.8), "test conjugate");
            Console.WriteLine("only printing");
            Console.WriteLine("is {0} == {1} : {2}",c , c2, c == c2);
            Console.WriteLine("is {0} != {1} : {2}",c, c2, c != c2);
            Console.WriteLine("modul of {0} is {1}",c2, c2.Modul());
            Console.WriteLine("argument of {0} is {1}", c2, c2.Argument());
            Console.ReadLine();


        }
    }
}

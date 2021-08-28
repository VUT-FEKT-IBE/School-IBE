using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv02
{
    public class TestComplex
    {
        public const double Epsilon = 0.000001;
        public static void Test(Complex actual, Complex expected, string name)
        {
            double helpReal = Math.Abs(actual.Real) - Math.Abs(expected.Real);
            double helpImaginary = Math.Abs(actual.Imaginary) - Math.Abs(expected.Imaginary);
            if (helpReal <= Epsilon && helpReal >= -Epsilon && helpImaginary <= Epsilon && helpImaginary >= -Epsilon)
            {
                Console.WriteLine("Test {0}: OK", name);
            }
            else
            {
                Console.WriteLine("Test {0}: Failed", name);
                Console.WriteLine("Expected value: {0}", expected);
                Console.WriteLine("Actual value: {0}", actual);
                Console.WriteLine("Differs by {0} in real part and {1} in imaginary part.", helpReal, helpImaginary);
            }
        }
    }
}

using System;
namespace cv02
{
    public class Complex
    {
        private double real;
        private double imaginary;

        public Complex(double real = 0, double imaginary = 0)
        {
            this.real = real;
            this.imaginary = imaginary;
        }

        // add two complex number 
        public static Complex operator +(Complex a, Complex b)
        {
            return new Complex(a.real + b.real, a.imaginary + b.imaginary);
        }

        // substract two complex number 
        public static Complex operator -(Complex a, Complex b)
        {
            return new Complex(a.real - b.real, a.imaginary - b.imaginary);
        }

        // multiply two complex number 
        public static Complex operator *(Complex a, Complex b)
        {
            return new Complex(a.real*b.real-a.imaginary*b.imaginary, a.real*b.imaginary+a.imaginary*b.real);
        }

        // divide two complex number 
        public static Complex operator /(Complex a, Complex b)
        { // a + b    c + d
            return new Complex((a.real*b.real + b.imaginary*a.imaginary)/(b.real*b.real + b.imaginary * b.imaginary), 
                (b.real*a.imaginary-a.real*b.imaginary)/(b.imaginary*b.imaginary + b.real * b.real)
                );
        }

        // unary- /real and imaginary component multiplied by -1.
        public static Complex operator -(Complex a)
        {
            return new Complex(-a.real, -a.imaginary);
        }

        // real and imaginary component is equal if are equal return true and otherwise
        public static bool operator ==(Complex a, Complex b)
        {
            return (a.real == b.real) && (a.imaginary == b.imaginary);
        }

        // real and imaginary component is not equal. if not equal return true and otherwise
        public static bool operator !=(Complex a, Complex b)
        {
            return !(a.real == b.real) && !(a.imaginary == b.imaginary);
        }

        // do complex conjugate
        public Complex Conjugate()
        {
            return new Complex(real, -imaginary);
        }

        // do modul of complex number
        public double Modul()
        {
            return Math.Sqrt(real*real+imaginary*imaginary);
        }

        // Do argument of complex number. 
        public double Argument()
        {
            return Math.Atan2(imaginary, real);
        }

        public override string ToString()
        {
            if (imaginary >= 0)
            {
                return string.Format("{0}+{1}j", real, imaginary);
            }
            else
            {
                return string.Format("{0}-{1}j", real, -imaginary);
            }

        }        

        public double Real
        {
            get { return real; }
            set { real = value; }
        }
        public double Imaginary
        {
            get { return imaginary; }
            set { imaginary = value; }
        }
    }
}

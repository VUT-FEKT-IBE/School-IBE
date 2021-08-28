using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv03
{
    public class Matrix
    {
        private double[,] matrixArr;

        public Matrix(double[,] matrixArr)
        {
            this.matrixArr = matrixArr;
        }

        // when error is find return null matrix and throw exception
        public static Matrix operator +(Matrix a, Matrix b)
        {
            try
            {
                if (a.matrixArr.GetLength(0) == b.matrixArr.GetLength(0) && a.matrixArr.GetLength(1) == b.matrixArr.GetLength(1))
                {
                    Matrix m = new Matrix(new double[a.matrixArr.GetLength(0), a.matrixArr.GetLength(1)]);

                    for (int i = 0; i < a.matrixArr.GetLength(0); i++)
                    {
                        for (int j = 0; j < a.matrixArr.GetLength(1); j++)
                        {
                            m.matrixArr[i, j] = a.matrixArr[i, j] + b.matrixArr[i, j];
                        }
                    }
                    return m;
                }
                else
                {
                    throw new ArgumentException("Matrix are not same size");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with addition of matrix. Err msg: " + e);
            }
            return null;
        }

        // when error is find return null matrix and throw exception
        public static Matrix operator -(Matrix a, Matrix b)
        {
            try
            {
                if (a.matrixArr.GetLength(0) == b.matrixArr.GetLength(0) && a.matrixArr.GetLength(1) == b.matrixArr.GetLength(1))
                {
                    Matrix m = new Matrix(new double[a.matrixArr.GetLength(0), a.matrixArr.GetLength(1)]);

                    for (int i = 0; i < a.matrixArr.GetLength(0); i++)
                    {
                        for (int j = 0; j < a.matrixArr.GetLength(1); j++)
                        {
                            m.matrixArr[i, j] = a.matrixArr[i, j] - b.matrixArr[i, j];
                        }
                    }
                    return m;
                }
                else
                {
                    throw new ArgumentException("Matrix are not same size");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with subtraction of matrix. Err msg: " + e);
            }
            return null;

        }

        // https://www.tutorialspoint.com/chash-program-to-multiply-two-matrices use algorithm
        // when error is find return null matrix and throw exception
        public static Matrix operator *(Matrix a, Matrix b)
        {
            try
            {
                if (a.matrixArr.GetLength(1) == b.matrixArr.GetLength(0))
                {
                    Matrix m = new Matrix(new double[a.matrixArr.GetLength(0), b.matrixArr.GetLength(1)]);
                    for (int i = 0; i < a.matrixArr.GetLength(0); i++)
                    {
                        for (int j = 0; j < b.matrixArr.GetLength(1); j++)
                        {
                            for (int k = 0; k < b.matrixArr.GetLength(1); k++)
                            {
                                m.matrixArr[i, j] += a.matrixArr[i, k] * b.matrixArr[k, j];
                            }
                        }
                    }
                    return m;
                }
                else
                {
                    throw new ArgumentException("Matrix doesn't meets requirements for multiplication ");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with multiplication of matrix. Err msg: " + e);
            }
            return null;

        }

        // when error is find return null matrix and catch build in exception
        public static Matrix operator -(Matrix a)
        {
            try
            {
                Matrix m = new Matrix(new double[a.matrixArr.GetLength(0), a.matrixArr.GetLength(1)]);
                for (int i = 0; i < a.matrixArr.GetLength(0); i++)
                {
                    for (int j = 0; j < a.matrixArr.GetLength(1); j++)
                    {
                        m.matrixArr[i, j] = (-1) * a.matrixArr[i, j];
                    }
                }
                return m;
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with unary- of matrix. Err msg: " + e);
            }
            return null;

        }
        
        // when matrix a row and collumn != matrix b row and collumn return false
        // when element on position [x,y] != to element on other matrix on [x,y] return false
        // when exception is catch return false and print exception
        public static bool operator ==(Matrix a, Matrix b)
        {
            try
            {
                if (a.matrixArr.GetLength(0) == b.matrixArr.GetLength(0) && a.matrixArr.GetLength(1) == b.matrixArr.GetLength(1))
                {
                    for (int i = 0; i < a.matrixArr.GetLength(0); i++)
                    {
                        for (int j = 0; j < a.matrixArr.GetLength(1); j++)
                        {
                            if (a.matrixArr[i, j] != b.matrixArr[i, j])
                            {
                                return false;
                            }
                        }
                    }
                }
                else
                {
                    return false;
                }

            }
            catch (Exception e)
            {
                Console.WriteLine("Error with comparing matrix. Err msg: " + e);
                return false;
            }
            return true;

        }
        
        // when a == b negate output and retun it other time is not same so retur true;
        public static bool operator !=(Matrix a, Matrix b)
        {
            try
            {
                if (a == b)
                {
                    return false;
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with comparing matrix. Err msg: " + e);
                return true;
            }
            return true;

        }

        // return value for matrix 1x1 2x2 3x3
        // for other throw exception and return NaN
        public double Determinant()
        {
            try
            {
                if (matrixArr.GetLength(0) == matrixArr.GetLength(1))
                {
                    switch (matrixArr.GetLength(0))
                    {
                        case 1:
                            return matrixArr[0, 0];
                        case 2:
                            return matrixArr[0, 0] * matrixArr[1, 1] - matrixArr[0, 1] * matrixArr[1, 0];
                        case 3:
                            // a1 = a11,a12
                            double a1 = matrixArr[0, 0] * matrixArr[1, 1] * matrixArr[2, 2] - matrixArr[0, 2] * matrixArr[1, 1] * matrixArr[2, 0];
                            double a2 = matrixArr[1, 0] * matrixArr[2, 1] * matrixArr[0, 2] - matrixArr[1, 2] * matrixArr[2, 1] * matrixArr[0, 0];
                            double a3 = matrixArr[2, 0] * matrixArr[0, 1] * matrixArr[1, 2] - matrixArr[1, 0] * matrixArr[0, 1] * matrixArr[2, 2];
                            return a1 + a2 + a3;
                        default:
                            throw new ArgumentException("Matrix is bigger than 3x3.");
                    }

                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error with addition of matrix. Err msg: " + e);
            }
            return Double.NaN;
        }

        public override string ToString()
        {
            String ret = "";
            for (int i = 0; i < matrixArr.GetLength(0); i++)
            {
                for (int j = 0; j < matrixArr.GetLength(1); j++)
                {
                    if (j == 0)
                    {
                        ret = ret + matrixArr[i, j];
                    }
                    else
                    {
                        ret = ret + " " + matrixArr[i, j];
                    }
                }
                ret = ret + "\n";
            }
            return ret;
        }

        public double[,] MatrixArr
        {
            get { return matrixArr; }
            set { matrixArr = value; }
        }

    }
}

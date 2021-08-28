using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace cv12WCF
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select Service1.svc or Service1.svc.cs at the Solution Explorer and start debugging.
    public class Service1 : IService1
    {

        public double Compute(double value1, double value2, string operand)
        {
            if (operand == "+")
            {
                return value1 + value2;
            }
            else if (operand == "-")
            {
                return value1 - value2;
            }
            else if (operand == "*")
            {
                return value1 * value2;
            }
            else if (operand == "/")
            {
                if (value2 == 0)
                {
                    return Double.NaN;
                }
                else
                {
                    return value1 / value2;
                }
            }

            return 0;

        }

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }
    }
}

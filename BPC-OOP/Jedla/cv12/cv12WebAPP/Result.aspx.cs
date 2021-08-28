using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace cv12WebAPP
{
    public partial class Result : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string num1 = Request.QueryString["num1"];
            string num2 = Request.QueryString["num2"];
            string oper = Request.QueryString["op"];
            if (num1 != null && num2 != null && oper != null)
            {
                if (oper == "plus")
                {
                    Response.Write(String.Format("{0} {1} {2} = {3}", num1, "+", num2, Compute(num1, num2, oper)));
                }
                else
                {
                    Response.Write(String.Format("{0} {1} {2} = {3}", num1, oper, num2, Compute(num1, num2, oper)));
                }
            }

        }
        private string Compute(string num1, string num2, string oper)
        {

            ServiceReference1.Service1Client service = new ServiceReference1.Service1Client();
            double number1;
            double number2;
            double res;
            try
            {
                number1 = Convert.ToDouble(num1);
                number2 = Convert.ToDouble(num2);
                if (oper == "plus")
                {
                    res = service.Compute(number1, number2, "+");
                }
                else if (oper != "")
                {
                    res = service.Compute(number1, number2, oper);
                }
                else
                {
                    res = Double.NaN;
                }
            }
            catch (Exception)
            {
                res = Double.NaN;
            }
            return res.ToString();

        }

    }
}
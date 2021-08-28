using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace cv12WebAPP
{
    public partial class Calc : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void compute_Click(object sender, EventArgs e)
        {
            Response.Redirect(String.Format("Result.aspx?num1={0}&num2={1}&op={2}",
                TextBox1.Text, TextBox2.Text, DropDownList1.SelectedValue));
        }
    }
}
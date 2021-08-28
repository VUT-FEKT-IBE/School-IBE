using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace cv12WPF
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            ServiceReference1.Service1Client service = new ServiceReference1.Service1Client();
            string oper = operation.Text;
            double num1;
            double num2;
            double res;
            try
            {
                num1 = Convert.ToDouble(number1.Text);
                num2 = Convert.ToDouble(number2.Text);
                if (oper != "")
                {
                    res = service.Compute(Convert.ToDouble(num1), Convert.ToDouble(num2), oper);
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
            result.Text = res.ToString();

        }

        
    }
}

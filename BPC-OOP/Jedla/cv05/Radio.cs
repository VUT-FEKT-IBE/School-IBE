using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv05
{
    internal class Radio
    {
        private Dictionary<int, double> preset = new Dictionary<int, double>();

        public double Frequency { get; set; }

        public bool TurnOn { get; set; }

        public Radio(double frequency = 107.00)
        {
            Frequency = frequency;
            TurnOn = false;
        }

        public void AddToPreset(int index, double frequency)
        {
            if (!preset.ContainsKey(index))
            {
                this.preset.Add(index, frequency);
            }
            else
            {
                this.preset.Remove(index);
                this.preset.Add(index, frequency);
            }
        }

        public void TuneRadioFromPreset(int index)
        {
            //bool includeKey = preset.TryGetValue(index, out double value);
            if (preset.TryGetValue(index, out double value))
            {
                this.Frequency = value;
            }
            else
            {
                throw new Exception("Not in preset");
            }
        }

        public override string ToString()
        {
            if (TurnOn == false)
            {
                return "Radio is off";
            }
            else
            {
                return String.Format("Radio frequency is {0, 0:N2}", Frequency);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv05
{
    abstract public class Car
    {

        private Radio radio = new Radio();

        public double SizeOfTank { get; protected set; }

        public double StateOfTank { get; set; }

        public TypeOfFuel Fuel { get; set; }


        public enum TypeOfFuel
        {
            petrol, diesel
        }

        public Car(double sizeOfTank, TypeOfFuel fuel, double stateOfTank = 0)
        {
            SizeOfTank = sizeOfTank;
            StateOfTank = stateOfTank;
            Fuel = fuel;
        }

        public void Refuel(TypeOfFuel fuel, double amount)
        {
            if (fuel != Fuel)
            {
                throw new Exception("Not same type of fuel");
            }
            if (amount + StateOfTank > SizeOfTank)
            {
                throw new Exception("Tank was over floaded");
            }
            else
            {
                StateOfTank = StateOfTank + amount;
            }
        }

        //radio section

        public double GetRadioFrequency()
        {
            return radio.Frequency;
        }

        public bool RadioIsTurnOn()
        {
            return radio.TurnOn;
        }

        public void TurnRadio(bool onOff)
        {
            radio.TurnOn = onOff;
        }

        public void SetElementOfPreset(int index, double frequency)
        {
            radio.AddToPreset(index, frequency);
        }

        public void RetuneByIndex(int index)
        {
            radio.TuneRadioFromPreset(index);
        }

        public void RetuneByHand(double frequency)
        {
            radio.Frequency = frequency;
        }

        // end of radio section

        public override string ToString()
        {
            return String.Format("Status of tank is {0} out of {1}. Type of fuel {2}. {3}. ", StateOfTank, SizeOfTank, Fuel, radio.ToString());
        }
    }
};

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv05
{
    public class PassengerCar : Car
    {
        private int transportedPersons;
        public int MaxPersons { get; private set; }

        public int TransportedPersons
        {
            get { return this.transportedPersons; }
            set
            {
                this.transportedPersons = this.CheckTransportedPersons(value);
            }
        }

        public PassengerCar(double sizeOfTank, TypeOfFuel fuel, int maxPersons, double stateOfTank = 0, int transportedPersons = 0)
            : base(sizeOfTank, fuel, stateOfTank)
        {
            MaxPersons = maxPersons;
            TransportedPersons = transportedPersons;
        }

        private int CheckTransportedPersons(int numberOfPersons)
        {
            if (numberOfPersons <= this.MaxPersons)
            {
                return numberOfPersons;
            }
            else
            {
                throw new ArgumentOutOfRangeException("Persons out of limit");
            }
        }

        public override string ToString()
        {
            return String.Format("{0}We playing for {1} people.",base.ToString(), TransportedPersons);
        }
    }
}

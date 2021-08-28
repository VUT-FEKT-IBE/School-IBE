using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv05
{
    public class Lorry : Car
    {
        private double transportedLoad;

        public double MaxLoad { get; private set; }

        public double TransportedLoad {
            get { return this.transportedLoad; }
            set
            {
                this.transportedLoad = this.CheckTransportedLoad(value);
            }
        }

        public Lorry(double sizeOfTank, TypeOfFuel fuel , double maxLoad, double stateOfTank = 0, double transportedLoad = 0) 
            : base(sizeOfTank,fuel, stateOfTank)
        {
            MaxLoad = maxLoad;
            TransportedLoad = transportedLoad;
        }
        private double CheckTransportedLoad(double load)
        {
            if (load <= this.MaxLoad)
            {
                return load;
            }
            else
            {
                throw new ArgumentOutOfRangeException("Over limit load");
            }
        }

        public override string ToString()
        {
            return String.Format("{0}Actual transported load is {1}.", base.ToString(), TransportedLoad);
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv05
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                PassengerCar pc = new PassengerCar(35, Car.TypeOfFuel.petrol, 5, 18, 7);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            PassengerCar p = new PassengerCar(35, Car.TypeOfFuel.petrol, 5, 18);
            Lorry l = new Lorry(100, Car.TypeOfFuel.diesel, 50);
            Console.WriteLine(p);
            Console.WriteLine(l);
            p.TurnRadio(true);
            l.TurnRadio(true);
            Console.WriteLine(p);
            Console.WriteLine(l);
            p.SetElementOfPreset(2, 88.3);
            l.SetElementOfPreset(1, 105.85);
            p.SetElementOfPreset(1, 88.3);
            l.SetElementOfPreset(2, 105.85);
            l.SetElementOfPreset(1, 101.5);
            p.RetuneByIndex(2);
            l.RetuneByIndex(1);
            try
            {
                l.RetuneByIndex(3);
            }
            catch (Exception e)
            {

                Console.WriteLine(e.Message);
            }
            Console.WriteLine(p);
            Console.WriteLine(l);
            p.RetuneByHand(85.3);
            Console.WriteLine(p);
            p.TurnRadio(false);
            l.TurnRadio(false);
            Console.WriteLine(p);
            Console.WriteLine(l);
            Console.WriteLine();
            p.refuel(Car.TypeOfFuel.petrol, 5.87);
            try
            {
                l.refuel(Car.TypeOfFuel.petrol, 80);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                p.refuel(Car.TypeOfFuel.petrol, 50);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine(p);
            Console.WriteLine(l);
            Console.WriteLine();
            l.refuel(Car.TypeOfFuel.diesel, 100);

            try
            {
                p.TransportedPersons = 20;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                l.TransportedLoad = 70;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            p.TransportedPersons = 2;
            l.TransportedLoad = 40;
            Console.WriteLine(p);
            Console.WriteLine(l);






            Console.ReadLine();

        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv09
{
    public class Calculator
    {
        public String Display { get; set; }
        public String Memory { get; set; }
        private enum State
        {
            FirstNum,
            Operation,
            SecondNum,
            Result
        };
        private State _state;
        private enum Operation
        {
            Plus,
            Minus,
            Multiply,
            Divide,
            Power
        };
        private Operation _operation;

        private string firstNum;
        private string secondNum;
        private string result;


        public Calculator()
        {
            firstNum = "0";
            secondNum = "0";
            result = "0";
            _state = State.FirstNum;
            Display = "0";
            Memory = "M";

        }

        public void Button(string button)
        {
            string number = "";

            switch (button)
            {
                case "+":
                    _state = State.Operation;
                    _operation = Operation.Plus;
                    break;
                case "-":
                    _state = State.Operation;
                    _operation = Operation.Minus;
                    break;
                case "*":
                    _state = State.Operation;
                    _operation = Operation.Multiply;
                    break;
                case "/":
                    _state = State.Operation;
                    _operation = Operation.Divide;
                    break;
                case "x^2":
                    _state = State.Result;
                    _operation = Operation.Power;
                    Result();
                    Reset();
                    break;
                case "=":
                    _state = State.Result;
                    Result();
                    Reset();
                    break;
                case "+/-":
                    ChangeSign();
                    break;

                case ",":
                    number = button;
                    break;
                case "C":
                    _state = State.FirstNum;
                    Memory = Display;
                    Display = "0";
                    firstNum = "0";
                    secondNum = "0";
                    result = "0";
                    break;
                case "M":
                    if (_state == State.FirstNum)
                    {
                        if(Memory == "M")
                        {
                            firstNum = Double.NaN.ToString();
                        }
                        else
                        {
                            firstNum = Memory;
                        }
                    }
                    else if (_state == State.SecondNum)
                    {
                        if (Memory == "M")
                        {
                            secondNum = Double.NaN.ToString();
                        }
                        else
                        {
                            secondNum = Memory;
                        }
                    }
                    break;

                default:
                    if (_state == State.FirstNum)
                    {
                        if (firstNum == "0" || firstNum == "NaN")
                        {
                            firstNum = "";
                            number = button;
                        }
                        else
                        {
                            number = button;
                        }
                    }
                    else if (_state == State.SecondNum)
                    {
                        if (secondNum == "0" || firstNum == "NaN")
                        {
                            secondNum = "";
                            number = button;
                        }
                        else
                        {
                            number = button;
                        }
                    }
                    break;

            }

            switch (_state)
            {
                case State.FirstNum:
                    firstNum += number;
                    Display = firstNum;
                    break;
                case State.SecondNum:
                    secondNum += number;
                    Display = secondNum;
                    break;
                case State.Operation:
                    _state = State.SecondNum;
                    break;
                case State.Result:
                    _state = State.FirstNum;
                    firstNum = Display;
                    break;
            }
        }

        // reset after C
        private void Reset()
        {
            Display = result;
            Memory = result;
            firstNum = "0";
            secondNum = "0";
            result = "0";
        }

        // change sign after 
        private void ChangeSign()
        {
            if (_state == State.FirstNum)
            {
                double reverse = Convert.ToDouble(firstNum) * -1;
                firstNum = "" + reverse;
            }
            else if (_state == State.SecondNum)
            {
                double reverse = Convert.ToDouble(secondNum) * -1;
                secondNum = "" + reverse;
            }
        }
        // compute result of two operations
        private void Result()
        {
            double firstNumber = 0;
            double secondNumber = 0;
            double res = 0;
            // case for power to convert only first number for power or both
            switch (_operation)
            {

                case Operation.Power:
                    try
                    {
                        firstNumber = Convert.ToDouble(firstNum);
                    }
                    catch (Exception)
                    {
                        firstNumber = 0;
                    }
                    break;
                default:
                    try
                    {
                        firstNumber = Convert.ToDouble(firstNum);
                        secondNumber = Convert.ToDouble(secondNum);
                    }
                    catch (Exception)
                    {
                        firstNumber = 0;
                        secondNumber = 0;
                    }
                    break;

            }

            switch (_operation)
            {
                case Operation.Plus:
                    res = firstNumber + secondNumber;
                    break;
                case Operation.Minus:
                    res = firstNumber - secondNumber;
                    break;
                case Operation.Multiply:
                    res = firstNumber * secondNumber;
                    break;
                case Operation.Divide:
                    if (secondNumber == 0)
                    {
                        res = Double.NaN;
                    }
                    else
                    {
                        res = firstNumber / secondNumber;
                    }
                    break;
                case Operation.Power:
                    res = firstNumber * firstNumber;
                    break;
            }

            this.result = "" + res;
        }
    }

}

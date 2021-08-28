using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace cv04
{
    public class StringStatistics
    {
        public string Text { get; set; }

        public StringStatistics(string text)
        {
            this.Text = text;
        }

        /// <returns>Returns Integrer with number of words.</returns>
        public int NumberOfWords()
        {
            char[] delimiterChars = { ' ', '\n' };
            int words = Text.Split(delimiterChars).Length;
            return words;
        }

        /// <returns>Returns Integer with number of row.</returns>
        public int NumberOfRow()
        {
            int row = Text.Split('\n').Length;
            return row;
        }

        /// <returns>Returns Integer number of sentences.</returns>
        public int NumberOfSentences()
        {
            char[] delimiterChars = { '.', '?', '!' };
            string text = Text.Replace("\n", "").Replace(" ", "");
            string[] row = text.Split(delimiterChars);
            int counter = 0;
            for (int i = 0; i < row.Length - 2; i++)
            {
                if (i == 0 && Char.IsUpper(row[i][0]))
                {
                    counter++;
                }
                if (Char.IsUpper(row[i + 1][0]))
                {
                    counter++;
                }
            }
            return counter;
        }

        /// <returns>Returns arrayList of longest words.</returns>
        public ArrayList LongestWords()
        {
            ArrayList longestWords = new ArrayList();
            string text = Text.Replace("\n", " ").Replace("!", "").Replace("?", "").Replace(",", "").Replace(".", "").Replace("(", "").Replace(")", "");
            string[] words = text.Split(' ');
            int biggestLenght = 0;

            foreach (var word in words)
            {
                if (word.Length > biggestLenght)
                {
                    biggestLenght = word.Length;
                    longestWords.Clear();
                    longestWords.Add(word);
                }
                else if (word.Length == biggestLenght)
                {
                    longestWords.Add(word);
                }
            }

            return longestWords;
        }

        /// <returns>Returns arrayList of shortest words.</returns>
        public ArrayList ShortestWords()
        {
            ArrayList longestWords = new ArrayList();
            string text = Text.Replace("\n", " ").Replace("!", "").Replace("?", "").Replace(",", "").Replace(".", "").Replace("(", "").Replace(")", "");
            string[] words = text.Split(' ');
            int shortestLenght = int.MaxValue;

            foreach (var word in words)
            {
                if (word.Length < shortestLenght)
                {
                    shortestLenght = word.Length;
                    longestWords.Clear();
                    longestWords.Add(word);
                }
                else if (word.Length == shortestLenght)
                {
                    longestWords.Add(word);
                }
            }

            return longestWords;
        }

        // using dictionary something like hashmap and every occurrence add value by 1 and after finding biggest value
        /// <returns>Returns arrayList of most common word.</returns>
        public ArrayList MostCommonWords()
        {
            var dict = new Dictionary<string, int>();
            ArrayList commonWords = new ArrayList();
            string text = Text.Replace("\n", " ").Replace("!", "").Replace("?", "").Replace(",", "").Replace(".", "").Replace("(", "").Replace(")", "");
            string[] words = text.Split(' ');
            int ocurencies = 0;
            foreach (var item in words)
            {
                if (dict.ContainsKey(item))
                {
                    dict[item]++;
                }
                else
                {
                    dict.Add(item, 1);
                }
            }

            foreach (var key in dict)
            {
                if (key.Value > ocurencies)
                {
                    ocurencies = key.Value;
                    commonWords.Clear();
                    commonWords.Add(key.Key);
                }
                else if (key.Value == ocurencies)
                {
                    commonWords.Add(key.Key);
                }
            }

            return commonWords;
        }

        /// <returns>Returns sorted arrayList of words.</returns>
        public ArrayList SortedArray()
        {
            ArrayList wordList = new ArrayList();
            string text = Text.Replace("\n", " ").Replace("!", "").Replace("?", "").Replace(",", "").Replace(".", "").Replace("(", "").Replace(")", "");
            string[] words = text.Split(' ');
            foreach (var item in words)
            {
                wordList.Add(item);
            }
            wordList.Sort();
            return wordList;
        }

        public bool IsInfected()
        {
            if (Text.ToLower().Contains("covid"))
            {
                return true;
            }
            else if (Text.ToLower().Contains("covid-19"))
            {
                return true;
            }
            else if (Text.ToLower().Contains("sars-cov-2"))
            {
                return true;
            }
            else
            {
            return false;
            }
        }

        /// <returns>Returns StringBuilder with items from arraylist and every word is divided by comma.</returns>
        public StringBuilder PrintArrayList(ArrayList arrlist)
        {
            StringBuilder text = new StringBuilder();
            if (arrlist.Count == 1)
            {
                text.Append(arrlist[0]);
            }
            else
            {
                foreach (var item in arrlist)
                {
                    text.Append(item).Append(", ");
                }
            }
            return text;
        }



        public override string ToString()
        {
            return this.Text;
        }

    }
}

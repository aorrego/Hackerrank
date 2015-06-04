using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UtopianTree
{
    class Program
    {
        static void Main(string[] args)
        {
            int noTestCases = Convert.ToInt16( Console.ReadLine() );
            int[] testCases = new int[noTestCases];
            for (int i = 0; i < noTestCases; i++)
            {
                testCases[i] = Convert.ToInt16( Console.ReadLine() );
            }

            int[] results = GetTreeHeight(testCases);
            for (int result = 0; result < results.Length; result++)
            {
                Console.WriteLine(results[result]);
            }
            Console.ReadKey();
        }

        public static int[] GetTreeHeight(int[] testCases) {

            int[] heights = new int[testCases.Length];

            for (int testCase = 0; testCase < testCases.Length; testCase++)
            {
                int height = 1;

                for (int cycle = 1; cycle <= testCases[testCase]; cycle++)
                {
                    if ((cycle % 2) != 0)
                    {
                        height *= 2;
                    }
                    else
                        height++;
                }

                heights[testCase] = height;
            }
            
            return heights;           
        }
    }
}

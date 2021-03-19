using System;

namespace algoritimo_licao
{
    class Program
    {
        static void Main(string[] args)
        {
            double n1;
            double n2;

            n1 = double.Parse(Console.ReadLine());
            n2 = double.Parse(Console.ReadLine());

            double sum = n1 + n2;
            System.Console.WriteLine($"Resultado da soma: {sum}");
        
            double multiplication = sum * n1;
            System.Console.WriteLine("Resultado da multiplicação: " +multiplication);
        }
    }
}


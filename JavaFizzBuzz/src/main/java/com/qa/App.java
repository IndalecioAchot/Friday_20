package com.qa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         buzzFuzz();
    }

    public static void buzzFuzz()
    {
        Scanner arrayNum = new Scanner(System.in);

        System.out.println("Please, how long would you want the array to be? Enter a single integer");
        String inputNums = arrayNum.nextLine();
        int num = Integer.parseInt(inputNums);

        for (int i = 0; i <= num; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

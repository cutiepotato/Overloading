package com.company;

public class Main {

            private static int computesum(int num1, int num2)
            {
                return num1 + num2;
            }

            private static int computesum(int num1, int num2, int num3)
            {
                return num1 + num2 + num3;
            }
            public static int greaterthan(int a, int b)
            {
                if(a>b)
                {
                    return a;
                }
                else
                {
                    return b;
                }
            }
            public static double greaterthan(double a, double b)
            {
                if(a>b)
                {
                    return a;
                }
                else
                {
                    return b;
                }
            }
            public static void main(String[] args) throws Exception {
                System.out.println("Hello, World!");
                System.out.println("Greater Number " + computesum(25,100));
                System.out.println("Greater Number " + computesum(25, 50, 100));
                System.out.println("The greater value between 45 and 100 is " + greaterthan(45,100));
                System.out.println("The greater value between 3.14 and 9.8 is " + greaterthan(3.14,9.8));
            }
        }

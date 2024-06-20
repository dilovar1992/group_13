package Dariga.week3;

public class PrimeNumbers {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
//A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.


//has to be divisible only by 1 and by itself
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
//When a prime number is divided by any other number, the result will be a fraction or have a remainder => not prime number anymore.
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int num = 6;

            if (isPrime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }


/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not

2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */


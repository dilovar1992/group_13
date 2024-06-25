package amine.week3;

public class W3_Number_Prime {
    /*
     Write a method that can check if a number is prime or not
  */
    public static void main(String[] args) {

        System.out.println(isPrime(7));

    }

    //return true if prime, false if number is not prime
    public static boolean isPrime(int number) {
        int factors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors++;
            }
        }
        return factors == 2; //prime numbers have only 2 factors, 1 and the prime number itself
    }


}



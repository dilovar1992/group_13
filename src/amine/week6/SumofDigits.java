package amine.week6;

public class SumofDigits {
    public static void main(String[] args) {

        System.out.println(sumOfDigits("29"));
    }

    public static int sumOfDigits(String num) {

        int n = Integer.parseInt(num);

        int sum = 0; // to contain sum of digits

        while (n != 0) { // loop over until n is 0, when n=0 loop stops
            sum += n % 10; // n % 10 gives the last digit
            n /= 10; //moves the decimal place to the left, updating n
            System.out.println("n = " + n);
        }
        return sum;
    }
}

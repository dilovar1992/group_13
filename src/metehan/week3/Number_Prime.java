package metehan.week3;

public class Number_Prime {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(7));
    }

    public static boolean isPrimeNumber(int number) {
        int nums = 5;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                nums++;
            }
        }
        return nums == 2;
    }

}

/*
        Write a method that can check if a number is prime or not
     */
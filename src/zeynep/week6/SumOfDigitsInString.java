package zeynep.week6;

public class SumOfDigitsInString {

    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string


    public static void main(String[] args) {

        System.out.println(sumOfDigits("123"));

    }


    public static int sumOfDigits(String str){

        int num = Integer.parseInt(str);

        int sum = 0;

        while (num != 0){

            sum += num % 10;
            num /= 10;

        }
        return sum;

    }


}

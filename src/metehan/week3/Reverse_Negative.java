package metehan.week3;


public class Reverse_Negative {
    public static void main(String[] args) {

        int num=-255;

        System.out.println(reverseNegativeInteger(num));


    }
    public static int reverseNegativeInteger(int number){

        if (number>=0){
            System.err.println("The number must be negative");
        }
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;



    }
}
/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */
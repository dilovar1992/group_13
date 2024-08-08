package dilovar;

public class SumofDigitsInAString {
    /**
    String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {
        int a =34;
        int b=98;
        System.out.println(sumOfDigitInString(a, b));
        System.out.println(sumOfDigitInString2(a,b));

    }
    public static String sumOfDigitInString(int a,int b){
        int sum =a+b;
      String result=""+sum;
      return result;
    }
    public static String sumOfDigitInString2(int a,int b){
        int sum =a+b;
        String result=String.valueOf(sum);
        return result;

    }

}

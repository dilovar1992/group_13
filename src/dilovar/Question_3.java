package dilovar;

public class Question_3 {
    /*
      QUESTION 1 - Write a method which can identify if a given number odd or even
       Ex: identify(5) -->"Odd"
       identify (6) --> "Even"
      */
    public static void main(String[] args) {
        findEvenOdd(5);
    }
    public static void findEvenOdd(int num){
        if (num%2==0){
            System.out.println( num+" is EVEN ");
        } else{
            System.out.println( num+" is ODD ");
        }
    }
}

package zeynep.week1;

public class W1_NumberOddOrEven {
    public static void main(String[] args) {

        identify(6);

    }


    public static void identify(int num){

        if (num % 2 == 0){
            System.out.println("Even");
        }else if (num % 2 == 1){
            System.out.println("Odd");
        }

    }
}
/*
      QUESTION 1 - Write a method which can identify if a given number odd or even
       Ex: identify(5) -->"Odd"
       identify (6) --> "Even"
      */
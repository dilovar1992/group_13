package dilovar.Numbers;

public class Question_2 {
//    QUESTION 1 - Write a method which can identify if a given number odd or even
//    Ex: identify(5) -->"Odd"
//    identify (6) --> "Even"
public static void main(String[] args) {
    int a =99;
    evenOddNumbers(a);
}
public static void evenOddNumbers(int num){
    if (num%2==0){
        System.out.println("this " + num+" is even");
    }else {
        System.out.println("this " + num+" is odd");
    }
}
}

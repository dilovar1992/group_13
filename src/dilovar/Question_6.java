package dilovar;

public class Question_6 {
//    Numbers – Swap Numbers
//    Swap two variables' values without using a third variable.
public static void main(String[] args) {
    int a=10;//a=15
    int b=15;//b=10
    //using arithmetic operators
    a=b-a;
    //a=5
    //b=15
    b=b-a;
    //a=5
    //b=10
    a=a+b;
    System.out.println("a = " + a);//a=15
    System.out.println("b = " + b);//b=10
}
}

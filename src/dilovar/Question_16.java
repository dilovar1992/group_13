package dilovar;

public class Question_16 {
    /*
    Factorial Number
    Create a method that accepts and return the factorial of that number
    parameter: int
    return : int
     */
    public static void main(String[] args) {
        int num=8;
        System.out.println(factorial(num));

    }
    public static int factorial(int num){
        int factorial=num;
        while(num>1){
            factorial*=num-1;
            num--;
        }
        return factorial;
    }
}

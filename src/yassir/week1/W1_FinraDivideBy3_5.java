package yassir.week1;

public class W1_FinraDivideBy3_5 {




    public static void main(String[] args) {

        //call displayNumbers to display numbers from 1 to 30
        displayNumbers(30);
    }

    public static void displayNumbers(int num) {
        for (int i = 0; i <= num; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FINRA");

            } else if (i % 3 == 0) {
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
    /*
    QUESTION 3- Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
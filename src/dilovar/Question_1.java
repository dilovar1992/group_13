package dilovar;

public class Question_1 {
     /*
    QUESTION 2- Write a method that can divide two numbers without using division operator
     */
     public static void main(String[] args) {

         System.out.println(divisionWithoutOperators(1, 0));


     }
     public static long divisionWithoutOperators(long a,long b){
         long dividend=Math.abs(a);
         long divisor =Math.abs(b);
         long quotient=0;
         long sign=(a<0)||(b<0)?-1:1;

         while(dividend>=divisor && divisor>0){
             dividend-=divisor;
             quotient++;
         }
         return quotient*sign;






     }

}

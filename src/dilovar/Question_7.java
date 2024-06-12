package dilovar;

public class Question_7 {
     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {
         int n=64;
         isPrimNumber(n);


     }
     public static void isPrimNumber(int num){
         int factor=0;
         for (int i=1;i<=num;i++){

             if (num%i==0){
                 factor++;
             }

         }
         if (factor==2){
             System.out.println(num+" is Prime Number");
         } else {
             System.out.println(num+" is Not Prime Number");
         }
     }


}

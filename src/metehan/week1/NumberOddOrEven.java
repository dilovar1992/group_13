package metehan.week1;

public class NumberOddOrEven {

        public static void main(String[] args) {

            int a = 2551;
            oddOrEven(a);
        }

        public static void oddOrEven(int number){

            if(number % 2 == 0){
                System.out.println(number + " is even number");
            }else{
                System.out.println(number + " is odd number");
            }

        }
    }



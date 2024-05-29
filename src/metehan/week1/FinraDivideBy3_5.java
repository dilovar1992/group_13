package metehan.week1;

public class FinraDivideBy3_5 {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            String result = "";

            if(divBy3 && divBy5){
                result = "FINRA";
            } else if(divBy3){
                result = "FIN";
            } else if(divBy5){
                result = "RA";
            } else {
                result = "" + i;
            }

            System.out.print(result + " ");

        }


    }

}

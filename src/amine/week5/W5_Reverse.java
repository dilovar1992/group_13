package amine.week5;

public class W5_Reverse {
    public static void main(String[] args) {
        String str = "Life isn't a matter of milestones, but of moments.";
        String result = "";

        //iterate and concatenate each letter into result string
        //starting from the last letter going until first letter
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        //display the result
        System.out.println(result);
    }

}
//String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA
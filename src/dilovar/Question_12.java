package dilovar;

public class Question_12 {
    //String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        String str="Yosir";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){

        String reverse="";//initialize an empty String
        for (int i = str.length()-1; i >= 0; i--) {
            //add every character to reverse string in reverse order
            reverse+=str.toUpperCase().charAt(i);
        }
        return reverse;
    }
}

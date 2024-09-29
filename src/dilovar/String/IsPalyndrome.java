package dilovar.String;

public class IsPalyndrome {
    public static void main(String[] args) {
        String str="aziza";
        String reverse="";
        for (int length = str.length()-1; length >= 0; length--) {
            reverse+=str.charAt(length);


        }
        System.out.println("reverse = " + reverse);

        System.out.println(str.equals(reverse));
    }


}

package dilovar;

public class shiftOperators {
    public static void main(String[] args) {
        int a=56;//111000.
        System.out.println(Integer.toBinaryString(a));
        int b=a>>4;//111000.=>11.1000=>11->rights shift operator
        int c=a<<4;//111000.0000=>1110000000-> left shift operator
        System.out.println(b);
        System.out.println(c);
        System.out.println(Integer.toBinaryString(b));
    }
}

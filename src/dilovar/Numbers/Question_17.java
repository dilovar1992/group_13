package dilovar.Numbers;

public class Question_17 {

    public static void main(String[] args) {
        int num=-2563985;
        System.out.println(lastDigit(num));
    }
    public static int lastDigit(int num) {
        Math.abs(num);
        return num % 10;
    }
}

package metehan.week1;

public class DivideWithoutDivision {

    public static long division (long a, long b) {
        long sign = ((a < 0) && (b < 0)) ? -1 : 1;

        a = Math.abs(a);
        b = Math.abs(b);

        long quotient = 0, temp = 0;

        for (int i = 45; i >= 0; --i) {
            if (temp + (b << i) <= a) {

                temp += b << i;
                quotient |= 1L << i;
            }
        }
        if(sign==-1)
            quotient=-quotient;
        return quotient;
    }
    public static void main(String args[])
    {
        int num1 = 10, num2 = 3;
        System.out.println(division(num1, num2));

        int num3 = 55, num4 = 5;
        System.out.println(division(num3, num4));


    }
}



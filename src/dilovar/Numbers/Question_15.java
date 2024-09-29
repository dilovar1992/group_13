package dilovar.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_15 {
    //    Binary Representation Of N
//
//    Create a method to determine how many 1s are in the representation of the number in binary form
//    parameter: int
//            return: int
//
//    The given n will be more than 0
    public static void main(String[] args) {
        int number = 15;
        System.out.println(BinaryFrequencyOf1(number));
        System.out.println(binaryOfN(number));

    }

    public static int BinaryFrequencyOf1(int number) {
        String binary = Integer.toBinaryString(number);
        List<String> binarylist = new ArrayList<>(Arrays.asList(binary.split("")));
        return Collections.frequency(binarylist, "1");
    }
    public static int binaryOfN(int n){ // 6 -> 3 -> 1 -> 0

        String binary = ""; // 0 -> 10 -> 110

        while(n > 0){
            binary = n % 2 + binary;
            n /= 2;
        }

        return binary.replace("0", "").length();
    }
//
//    Ex:
//    input: 6
//    output: 2
//
//            6 in binary is 110
//    there are two '1' digits, so the output is 2
//
//    Test data:
//            6 -> 110 -> 2
//            7 -> 111 -> 3
//            4 -> 100 -> 1
//            10 -> 1010 -> 2
//            15 -> 1111 -> 4
//            16 -> 10000 -> 1
}

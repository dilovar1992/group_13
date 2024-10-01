package dilovar.String;

public class Question_13 {
    /*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/
    public static void main(String[] args) {
        String string="hskdfhskdfhsjjjjjfhskfkdllQQQqlm";
        System.out.println(uniqueCharacters(string));
    }
    public static String uniqueCharacters(String string){
        String unique="";
//nested loop checks how many times characters repeated
        for (int i = 0; i < string.length(); i++) {
            int count=0;
            for (int j = 0; j < string.length(); j++) {
                if (string.toLowerCase().charAt(i)==string.toLowerCase().charAt(j)){
                    count++;
                }

            }
            //if repeatation is 1 time then unique
            if (count==1){
                unique+=string.charAt(i);
            }
        }
        return unique;
    }
}

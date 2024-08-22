package amine.week6;

/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
public class ValidatePassword {
    public static void main(String[] args) {

        System.out.println("selenium " + validatePassword("selenium"));
        System.out.println("Selenium " + validatePassword("Selenium"));
        System.out.println("Selenium1 " + validatePassword("Selenium1"));
        System.out.println("selenium@ " + validatePassword("selenium@"));
        System.out.println("selenium@1 " + validatePassword("selenium@1"));
        System.out.println("Selenium@1 " + validatePassword("Selenium@1"));

    }

    public static boolean validatePassword(String password) {

        if (password.length() >= 6) {
            if (password.contains(" ")) {
                return false;

            }else if (password.toLowerCase().equals(password) || password.toUpperCase().equals(password)){
                return false;

            } else {
                boolean isDigit = false;
                boolean isSpecialChar = false;

                char [] chars = password.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    if (Character.isDigit(chars[i])){
                        isDigit = true;
                    }
                    if (!(Character.isLetterOrDigit(chars[i]))){
                        isSpecialChar = true;
                    }
                }

                return isDigit && isSpecialChar;
            }


        }else{
            return false;
        }

    }



}
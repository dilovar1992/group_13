package dilovar;

public class PasswordValidationTask {
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
    public static void main(String[] args) {
        String password = "Password123";
        System.out.println("isValidPassword(password) = " + isValidPassword(password));
    }
    public static boolean isValidPassword(String password){
        boolean result=true;
        if (password.length()<6 || password.contains(" ")){
            result=false;
        }
        boolean hasLowerCase=false;
        boolean hasUpperCase=false;
        boolean hasSpecialCharacter=false;
        boolean hasDigits=false;
        char[] chars=password.toCharArray();
        for(char c:chars){
         if (Character.isLowerCase(c)){
             hasLowerCase=true;
         }
         if(Character.isDigit(c)){
             hasDigits=true;
         }
         if (Character.isUpperCase(c)){
             hasUpperCase=true;
         }
         if (!Character.isLetterOrDigit(c)){
             hasSpecialCharacter=true;
         }
        }


        return result && hasDigits && hasLowerCase && hasUpperCase && hasSpecialCharacter;
    }
}

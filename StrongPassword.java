
public class StrongPassword {

  /*  numbers = "0123456789"
    lower_case = "abcdefghijklmnopqrstuvwxyz"
    upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    special_characters = "!@#$%^&*()-+"*/
  static int  nonLengthConstraint = 0;

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        checkNumberPresent(password);
        checkLowerCase(password);
        checkUpperCase(password);
        checkSpecialCharPresent(password);
        int minimumNumber = checkLengthOfPassword(password);

        return minimumNumber;

    }

    private static int checkLengthOfPassword(String password) {

        int insufficientConstrait = 4-nonLengthConstraint;
        int inSufficientLength = 6-password.length();
        if(inSufficientLength >= insufficientConstrait){
            return  inSufficientLength;
        }
        else{
            return insufficientConstrait;
        }
    }

    private static void checkSpecialCharPresent(String password) {
        String specialChar = "\"!@#$%^&*()-+\"*/";

        for(int i=0;i < password.length();i++) {
            char ch = password.charAt(i);
            if (specialChar.indexOf(ch) > -1) {
                nonLengthConstraint += 1;
                return;
            }
        }

    }

    private static void checkUpperCase(String password) {
        for(int i=0;i < password.length();i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                nonLengthConstraint += 1;
                return;
            }
        }
    }

    private static void checkLowerCase(String password) {
        for(int i=0;i < password.length();i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                nonLengthConstraint += 1;
                return;
            }
        }
    }


    private static void checkNumberPresent(String password) {
        if(password.matches(".*\\d+.*"))
            nonLengthConstraint += 1;

    }
    public static void main(String[] args){

        int answer = minimumNumber(3, "Ab1");
        System.out.println(answer);

    }
}

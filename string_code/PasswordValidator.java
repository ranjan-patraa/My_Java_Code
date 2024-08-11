package string_code;



/*You are given a function
        Int checkPassword(char str[],int n)

        The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid

        str is a valid password if it satisfies the below conditions.

        password else 0.

        At least 4 characters

        At least one numeric digit

        -At Least one Capital Letter

        -Must not have space or slash (/)

        Starting character must not be a number */
public class PasswordValidator {

    public static void main(String[] args) {

        char[] password1 = "letsFindcourse".toCharArray();
        char[] password2 = "Abcd123".toCharArray();
        char[] password3 = "123Abcd/".toCharArray();
        char[] password4 = "A1b ".toCharArray();

        System.out.println( passwordValidator(password1, password1.length) ) ; // 0

        System.out.println( passwordValidator(password2, password2.length) ); // 1

        System.out.println( passwordValidator(password3, password3.length) ) ; // 0

        System.out.println( passwordValidator(password4, password4.length) ) ; // 0

    }

    public static int passwordValidator(char[] str, int n) {

        if (n <= 4) {

            return 0;
        }

        if (Character.isDigit(str[0])) {

            return 0;
        }

        boolean hasDigit = false;
        boolean hasCapital = false;

        for (int i = 0; i < n; i++) {

            if (Character.isWhitespace(str[i])  || str[i] == '/') {

                return 0;
            }
            if (Character.isDigit(str[i])) {

                hasDigit = true;
            }
            if (Character.isUpperCase(str[i])) {

                hasCapital = true;
            }
        }

        if(! hasDigit || ! hasCapital) {

            return 0 ;
        }

        return  1 ;
    }
}
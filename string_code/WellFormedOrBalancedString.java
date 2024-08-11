package string_code;

import java.util.Stack;

public class WellFormedOrBalancedString {

    public static void main(String[] args) {


        String ss  = "(]" ;

        System.out.println(ss) ;

        boolean b = validate(ss) ;

        System.out.println(b);


        String str  =    "[{()}]" ; // (){}[]

        Stack<Character> st  = new Stack<>() ;

        for(int i = 0 ; i < str.length() ; i++ ) {

            char ch = str.charAt(i) ;

            if(st.empty()){

                st.push(ch) ;

            } else if (ch == '{' || ch == '(' || ch == '[') {

                st.push(ch) ;

            } else if (ch == '}' && st.peek() == '{') {

                st.pop() ;

            }else if (ch == ')' && st.peek() == '(') {

                st.pop() ;

            }else if (ch == ']' && st.peek() == '[') {

                st.pop() ;
            }
        }

        if(st.empty()) {

            System.out.println("given string is wellFormed");

        }else {

            System.out.println("given string is not wellFormed");

        }


    }



    static  boolean validate(String ss) {

        Stack<Character> stack = new Stack<>() ;

        for(int i  = 0 ; i < ss.length() ; i++) {

            char ch = ss.charAt(i) ;

            if(stack.empty()) {

                stack.push(ch) ;

            } else if (ch == '(' || ch == '{' ||  ch == '[') {

                stack.push(ch) ;

            } else if (ch == ')' && stack.peek() == '(' ) {

                stack.pop() ;

                return  true ;

            } else if (ch == '}' && stack.peek() == '{' ) {

                stack.pop() ;

                return true ;

            }else if (ch == ']' && stack.peek() == '[' ) {

                stack.pop() ;

                return true ;

            } else {

                return  false ;
            }
        }

        if(stack.size() == 0) {

            return true ;
        }
        return false ;
    }

}

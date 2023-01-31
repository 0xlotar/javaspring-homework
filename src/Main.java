import java.util.Scanner;
import java.util.Stack;


/*
  public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println(isPalindromeReverseTheString(scanner.next()) ? "true" : "false");


    }
    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
*/



public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Is It a Palindrome?" + (isPalindromeReverseTheString(scanner.next()) ? "true" : "false"));

        System.out.println("Are brackets Valid:" + (isValid(scanner.next()) ? "true" : "false"));
    }


    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='{'|| ch=='['){
                bracket.push(ch);
            }else{
                if(bracket.empty()){
                    return false;
                }
                if((bracket.peek() == '(' && ch == ')')
                        || (bracket.peek() == '{' && ch == '}')
                        ||(bracket.peek() == '[' && ch == ']')){
                    bracket.pop();
                }else{
                    return false;
                }
            }
        }
        return bracket.isEmpty();
    }
    // fix


}
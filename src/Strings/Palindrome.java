package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user input to check if it is a Palindrome or not");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
        }

    private static String reverseString(String userInput) {
      String reveresed = "";
      for(int i = userInput.length()-1; i>=0; i--) {
          reveresed = reveresed + userInput.charAt(i);
      }
      return reveresed;
      }
    }


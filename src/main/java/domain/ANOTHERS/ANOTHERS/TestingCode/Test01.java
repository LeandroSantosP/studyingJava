package domain.ANOTHERS.ANOTHERS.TestingCode;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 1, 2};


        boolean isPalindrome = true;

        for (int i = 0; i < (myArray.length / 2); i++) {
            if (myArray[i] != myArray[myArray.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}

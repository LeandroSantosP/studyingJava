package domain.ANOTHERS.ANOTHERS.TestingCode;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        pal();
    }
    
    static void pal() {
        int[] arr = { 1, 2, 4, 5, 6, 5, 4, 2, 1 };
    
        boolean isPalindrome = true;
    
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is a Palindrom!");
        } else if (!isPalindrome) {
            System.out.println("Is not a Palindrom!");
        }
    }
}

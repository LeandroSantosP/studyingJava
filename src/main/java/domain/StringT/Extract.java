package domain.StringT;

import java.util.Arrays;

public class Extract {
    public static void main(String[] args) {
        String java = "java";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] javac = new char[3];
        // not index base
        java.getChars(0, 3, javac, 0);
        System.out.println(javac);

        byte[] javaB = new byte[3];

        java.getBytes(0, 3, javaB, 0);
        System.out.println(Arrays.toString(javaB));

        char[] javaCharArray = java.toCharArray();
        System.out.println(javaCharArray);
    }
}

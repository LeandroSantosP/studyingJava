package domain.StringT;

public class Constructor {
    public static void main(String[] args) {
        char[] words = {'a', 'b', 'c', 'd'};
        System.out.println(words);

        String JAVA1 = "JAVA";
        String JAVA2 = "JAVA";

        System.out.println(JAVA1 + JAVA2);
        String JAVA3 = new String("JAVA");
        String JAVA4 = new String("JAVA");
        System.out.println(JAVA3 + JAVA4 + " " + JAVA2);
    }
}

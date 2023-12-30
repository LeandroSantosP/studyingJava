package domainTwo.Matrizes;

import java.util.Scanner;

public class Trainer {

    private record Children(String name, int age) {
    }

    public record InterViewed(String parentName, int childrenAmount, Children[] children) {
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers of people who will be interviewed: ");
        Scanner scanner = new Scanner(System.in);
        int interviewedNum = scanner.nextInt();

        InterViewed[] interViewers2 = new InterViewed[interviewedNum];

        for (int i = 0; i < interViewers2.length; i++) {
            int current = (i + 1);
            System.out.println("Enter the parent name: " + current);
            String parentName = scanner.next();

            System.out.println("Enter the amount of children: " + current);
            int childrenAmount = scanner.nextInt();

            Children[] children = getChildren(childrenAmount, scanner);
            interViewers2[i] = new InterViewed(parentName, childrenAmount, children);
        }

        for (InterViewed interViewed : interViewers2) {
            System.out.println("Person " + interViewed.parentName + " have " + interViewed.childrenAmount + " children in which they are: ");
            for (int j = 0; j < interViewed.children.length; j++) {
                System.out.println("Son Name: " + interViewed.children[j].name + " age: " + interViewed.children[j].age);
            }
        }
    }

    private static Children[] getChildren(int childrenAmount, Scanner scanner) {
        Children[] children = new Children[childrenAmount];
        for (int j = 0; j < children.length; j++) {
            int currentChildren = (j + 1);
            System.out.println("Type the son name: " + currentChildren);
            String sonName = scanner.next();
            System.out.println("Type the " + sonName + " age: " + currentChildren);
            int age = scanner.nextInt();
            children[j] = new Children(sonName, age);
        }
        return children;
    }
}



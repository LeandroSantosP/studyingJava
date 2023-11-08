package domain;

public class IO {

    public void exec() {
        String name = "John dow";
        double height = 1.73;
        double salary = 4000;
        int age = 23;

        String formatingPhrasl = String.format("%s has %d years old and earns %.2f bulks%n", name, age, salary);

        System.out.printf(formatingPhrasl);


//        String onlyOneString = String.format("name: %s, height: %s", name, height);
//        System.out.printf("MY NAME IS: %s, Height: %.2f %n", name, height);
//        System.out.println(onlyOneString);

//        Scanner sc = new Scanner(System.in);
//
//        String x1, x2, x3;
//
//        x1 = sc.nextLine();
//        x2 = sc.nextLine();
//        x3 = sc.nextLine();
//
//        System.out.println("Voce Digitados");
//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.println(x3);
//        sc.close();
    }
}

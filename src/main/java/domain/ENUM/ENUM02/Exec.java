package domain.ENUM.ENUM02;

public class Exec {

    public static void main(String[] args) {
        Gender female = Gender.FEMALE;
        Gender male = Gender.MALE;
        print(female);
        print(male);
        // enum iterator
        Gender[] genders = Gender.values();
        for (Gender gender : genders){
            System.out.println(gender.getTYPE());
        }
        System.out.println(Enum.valueOf(Gender.class, "FEMALE"));
    }

    private static void print(Gender g) {
        switch (g) {
            case FEMALE, MALE -> System.out.println(g.getTYPE());
            default -> System.out.println("TEST");
        }
    }
}

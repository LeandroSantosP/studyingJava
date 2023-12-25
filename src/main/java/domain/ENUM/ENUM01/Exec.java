package domain.ENUM.ENUM01;

public class Exec {
    public static void main(String[] args) {
//        usingConst();
        usingEnum();
    }


    private static void usingConst() {
        int segunda = WeekDays.SEGUNDA;
        int terca = WeekDays.TERCA;
        int quarta = WeekDays.QUARTA;
        int quinta = WeekDays.QUINTA;
        int sexta = WeekDays.SEXTA;
        int sabado = WeekDays.SABADO;
        int domindo = WeekDays.DOMINDO;
        printWeekDay(segunda);
        printWeekDay(terca);
        printWeekDay(quarta);
        printWeekDay(quinta);
        printWeekDay(sexta);
        printWeekDay(sabado);
        printWeekDay(domindo);
    }

    private static void printWeekDay(int day) {
        switch (day) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terca-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sabado-feira");
            case 7 -> System.out.println("Domindo-feira");
        }
    }
    /*
    * Enum
    * */
    private static void printWeekDayEnum(WeekDayEnum day) {
        switch (day) {
            case SEGUNDA -> System.out.println("Segunda-feira");
            case TERCA -> System.out.println("Terca-feira");
            case QUARTA -> System.out.println("Quarta-feira");
            case QUINTA -> System.out.println("Quinta-feira");
            case SEXTA -> System.out.println("Sexta-feira");
            case SABADO -> System.out.println("Sabado-feira");
            case DOMINDO -> System.out.println("Domindo-feira");
        }
    }

    private static void usingEnum() {
        WeekDayEnum segunda = WeekDayEnum.SEGUNDA;
        WeekDayEnum terca = WeekDayEnum.TERCA;
        WeekDayEnum quarta = WeekDayEnum.QUARTA;
        WeekDayEnum quinta = WeekDayEnum.QUINTA;
        WeekDayEnum sexta = WeekDayEnum.SEXTA;
        WeekDayEnum sabado = WeekDayEnum.SABADO;
        WeekDayEnum domindo = WeekDayEnum.DOMINDO;
        printWeekDayEnum(segunda);
        printWeekDayEnum(terca);
        printWeekDayEnum(quarta);
        printWeekDayEnum(quinta);
        printWeekDayEnum(sexta);
        printWeekDayEnum(sabado);
        printWeekDayEnum(domindo);
    }
}

package domain;

public class SwitchCase {

    String exec(int dayNumber) throws Exception {
        String day = switch (dayNumber) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sabado";
            default -> throw new Exception();
        };


        return String.format("DIA DA SEMANA: %s", day);
    }

}

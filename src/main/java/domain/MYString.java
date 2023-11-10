package domain;

public class MYString {

    public void exec() {
        String frase = "   Exemplo De fUnções de String   ";

        String fraseSemEspacos = frase.trim();
        System.out.println("   Frase sem espaços em branco: " + fraseSemEspacos);

        String fraseMinuscula = frase.toLowerCase();
        System.out.println("   Frase em minúsculas: " + fraseMinuscula);

        String fraseSubstituida = frase.replace("fUnções", "NEWWORD");
        System.out.println("Frase com substituição: " + fraseSubstituida);

        String frase2 = "Exemplo de utilização do método substring";

        String parte1 = frase2.substring(8);
        System.out.println("Parte 1: " + parte1);

        String parte2 = frase2.substring(15, 26);
        System.out.println("Parte 2: " + parte2);
    }
}

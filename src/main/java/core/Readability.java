package core;

import java.util.Scanner;

public class Readability {

    public static void exec() {
        System.out.println("Leandro!");
        try (Scanner scannner = new Scanner(System.in)) {
            System.out.print("Text: ");
            String text = scannner.nextLine();
            Integer total_words = get_total_words(text);
            Integer total_letters = get_total_letters(text);
            Integer total_sentences = get_total_sentences(text);
            System.out.println("Words: "
                    + total_words
                    + " Letters: "
                    + total_letters
                    + " Sentences: "
                    + total_sentences);
            scannner.close();

            Double L = ((double) total_letters / total_words) * 100;
            Double S = ((double) total_sentences / total_words) * 100;

            double index = Math.round(0.0588 * L - 0.296 * S - 15.8);
            System.out.println(index);
        }

      }
    private static Integer get_total_sentences(String text) {
      Integer total = 0;
      for (int i = 0; i < text.length(); i++) {
          char current_letter = text.charAt(i);
          if (current_letter == '.' || current_letter == '?' || current_letter == '!') {
              total++;
          }
      }
      return total;
  }

  private static Integer get_total_words(String text) {
      Integer total = 1;
      for (int i = 0; i < text.length(); i++) {
          char current_letter = text.charAt(i);
          if (current_letter != ' ') {
              continue;
          }
          total++;
      }
      return total;
  }

  private static Integer get_total_letters(String text) {
      int total = 0;
      for (int i = 0; i < text.length(); i++) {
          char current_letter = text.charAt(i);
          boolean isValidChar = current_letter != ' '
                  && current_letter != '.'
                  && current_letter != ','
                  && current_letter != '?'
                  && current_letter != '!';
          if (isValidChar) {
              total++;
          }
      }
      return total;
}
}


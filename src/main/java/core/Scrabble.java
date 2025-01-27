package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Scrabble {

  private final ArrayList<Integer> POINTS;

  public Scrabble() {
    this.POINTS = new ArrayList<>(
        Arrays.asList(1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10));
  }

public  void exec() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Player: 1");
      String py_1 = scanner.nextLine();
      System.out.println("Player: 2");
      String py_2 = scanner.nextLine();

      Integer score_py_1 = this.compute_score(py_1);
      Integer score_py_2 = this.compute_score(py_2);

      if (score_py_1 > score_py_2) {
        System.out.println("Play 1 Wins!");       
      } else if (score_py_1 < score_py_2) {
        System.out.println("Play 2 Wins!");
      } else {
        System.out.println("Tie!");
      }
    }
  }

  private Integer compute_score(String text) {
    Integer total = 0;
    for (int index = 0; index < text.length(); index++) {
      char current_letter = text.charAt(index);
      int score_idx_lowecase = current_letter - 'a';
      int score_idx_uppercase = current_letter - 'A';
      if (Character.isUpperCase(current_letter)) {
        total += this.POINTS.get(score_idx_uppercase);
      } else if (Character.isLowerCase(current_letter)) {
        total += this.POINTS.get(score_idx_lowecase);
      }
    }
    return total;
  }
}
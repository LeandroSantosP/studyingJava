package core;

import java.nio.charset.StandardCharsets;

public class MyString {
   static private byte[] byteArrayHelloWord = { 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33 };

   public static void main(String[] args) {
      MyString.construc();
   }

   static void construc() {
      // 1
      new String("John");
      // 2
      char[] s_chars = { 'J', 'o', 'n', 'h', '.' };
      String output_2 = new String(s_chars); // Output: John.
      /* 3 */
      // Start at index 7, read 6 bytes
      int read_6 = byteArrayHelloWord.length - 7;
      var output_3 = new String(byteArrayHelloWord, 7, read_6, StandardCharsets.US_ASCII); // Start at index 7, read 5
                                                                                           // bytes
      // System.out.println(output_3); // Output: World!

      /* 4 */
      // Decode the bytes using UTF-8
      var output_4 = new String(byteArrayHelloWord, StandardCharsets.UTF_8); // Start at index 7, read 5 bytes
      // System.out.println(output_4); // Output: Hello, World!

      /* 5 */
      /*
       * %d Integer (decimal) String.format("%d", 123) → "123"
       * %f Floating-point number String.format("%.2f", 3.14159) → "3.14"
       * %s String String.format("%s", "Java") → "Java"
       * %c Character String.format("%c", 'A') → "A"
       * %x Hexadecimal integer String.format("%x", 255) → "ff"
       * %o Octal integer String.format("%o", 8) → "10"
       * %% Literal percent sign String.format("%%") → "%"
       * , indicates that digits should be grouped (usually by thousands)
       */
      var float_1 = String.format("%1$,3.1f", 1260.505);
      var float_2 = String.format("%1$.1f", 1260.505);
      var decimal = String.format("%d", 1260);
      System.out.println(float_2);
   }
}

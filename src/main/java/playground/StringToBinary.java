package playground;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringToBinary {

  public static void main(String[] args) {
    String input = "1E491640";
    String[] results = input.split("(?<=\\G.{" + 2 + "})");
    System.out.println(Arrays.asList(results));
    String text = "1E";


    List <String> l = toBinString(input);
//    String.format("%8s",binary)  // char -> int, auto-cast
//            .replaceAll(" ", "0");
    System.out.println(l);
    System.out.println(l.size());
//    System.out.println(toBinaryString(input));
  }


  public static List <String> toBinString(String input) {
    String[] splitBySize2 = input.split("(?<=\\G.{" + 2 + "})");
    StringBuilder sb = new StringBuilder();
    for (String s : splitBySize2) {
      sb.append(toBin(s));
    }
    return List.of(sb.toString().split(""));
  }

 

  public static Function <String, StringBuilder> hexToString = (s) -> new StringBuilder(new BigInteger(s, 16).toString(2));

  public static String toBin(String s) {
    StringBuilder preBin = hexToString.apply(s);
    int length = preBin.length();
    if (length < 8) {
      for (int i = 0; i < 8 - length; i++) {
        preBin.insert(0, "0");
      }
    }
    return preBin.reverse().toString();
  }

  public static String convertStringToBinary(String input) {

    StringBuilder result = new StringBuilder();
    char[] chars = input.toCharArray();
    for (char aChar : chars) {
      result.append(
              String.format("%4s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                      .replaceAll(" ", "0")                         // zero pads
      );
    }
    return result.toString();

  }

  public static String toBinaryString(String s) {

    char[] cArray = s.toCharArray();

    StringBuilder sb = new StringBuilder();

    for (char c : cArray) {
      String cBinaryString = Integer.toBinaryString((int) c);
      sb.append(cBinaryString);
    }

    return sb.toString();
  }
}

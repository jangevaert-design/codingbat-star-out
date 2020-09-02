public class starOut {
  public String starOut(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i ++) {
      if (i == 0 && str.charAt(i) != '*') {
        result.append(str.charAt(i));
      }
      if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
        result.append(str.charAt(i));
      }
      if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
        result = new StringBuilder(result.substring(0, result.length() - 1));
      }
    }


    return result.toString();
  }
}

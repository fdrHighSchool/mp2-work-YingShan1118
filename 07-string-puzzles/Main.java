class Main {
  public static void main(String[] args) {
    // Question 1
    System.out.println(conCat("abc", "cat"));// --> "abcat"
    System.out.println(conCat("dog", "cat"));// --> "dogcat"
    System.out.println(conCat("abc", ""));// --> "abc"

    System.out.println();

    // Question 3
    System.out.println(repeatEnd("Hello", 3));// -->"llollollo"
    System.out.println(repeatEnd("Hello", 2));// -->"lolo"
    System.out.println(repeatEnd("Hello", 1));// -->"o"

    System.out.println();

    // Question 4
    System.out.println(countHi("abc hi ho"));// --> 1
    System.out.println(countHi("ABChi hi"));// --> 2
    System.out.println(countHi("hihi"));// --> 2

    System.out.println();

    // Question 5
    System.out.println(withoutString("Hello there", "llo"));// --> "He there"
    System.out.println(withoutString("Hello there", "e"));// --> "Hllo thr"
    System.out.println(withoutString("Hello there", "x"));// --> "Hello there"

    System.out.println();

    // Question 7
    System.out
        .println(makeSarcastic("For me it was never about money, but solving problems for the furture of humanity"));

  }// End of main mehtod

  // Question 1
  public static String conCat(String str1, String str2) {
    if (!(str1.equals("") || str2.equals(""))) {
      if (str1.substring(str1.length() - 1).equals(str2.substring(0, 1))) {
        str2 = str2.substring(1);
      } // End of inner if statement
    } // End of outer if statement
    return str1 += str2;
  }// End of conCat method

  // Question 3
  public static String repeatEnd(String str, int n) {
    str = str.substring(str.length() - n);
    String repeatStr = "";
    for (int times = 0; times < n; times++) {
      repeatStr += str;
    } // End of for loop
    return repeatStr;
  }// End of repeatEnd method

  // Question 4
  public static int countHi(String str) {
    int count = 0;
    for (int i = 0; i <= str.length() - 2; i++) {
      if (str.substring(i, i + 2).equals("hi")) {
        count++;
      } // End of if statement
    } // End of for loop
    return count;
  }// End of countHi mehtod

  // Question 5
  public static String withoutString(String base, String remove) {
    while (base.indexOf(remove) != -1) {
      base = base.replace(remove, "");
    } // End of while loop
    return base;
  }// End of withoutString mehtod

  // Question 7
  public static String makeSarcastic(String str) {
    String newStr = "";
    int randomNum = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      randomNum = (int) (Math.random() * (2 - 1 + 1) + 1);
      if ((randomNum == 1)) {
        newStr += str.substring(i, i + 1).toUpperCase();
      } // End of if statement
      else {
        newStr += str.substring(i, i + 1).toLowerCase();
      }//End of else statement
    } // End of for loop
    return newStr;
  }// End of makeSarcastic method
}// End of Main class

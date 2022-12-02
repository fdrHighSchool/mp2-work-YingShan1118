class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(17)); //Should return F+
    System.out.println(letterGrade(62)); //Should return D-
    System.out.println(letterGrade(77)); //Should return C+
    System.out.println(letterGrade(85)); //Should return B
    System.out.println(letterGrade(99)); //Should return A+
    System.out.println(letterGrade(100)); //Should return A+
  }//End of main method
  public static String letterGrade(int grade){
    String letter = "";
    int onesDigit = grade%10;
    if (grade < 60){
      letter = "F";
    }//End of 1st if statement
    else if (grade < 70){
      letter = "D";
    }//End of 1st else if statement
    else if (grade < 80){
      letter = "C";
    }//End of 2nd else if statement
    else if (grade < 90){
      letter = "B";
    }//End of 3rd else if statement
    else{
      letter = "A";
    }//End of else statement
    if (onesDigit > 6 || grade <= 100){
      letter += "+";
    }//End of 2nd if statement
    else if (onesDigit < 3 && grade > 100){
      letter += "-";
    }//End of 4th else if statement
    return letter;
  }//End of letterGrade method
}//End of Main class

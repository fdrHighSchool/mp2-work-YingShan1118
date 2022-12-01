class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(0)); //Should return 0
    System.out.println(countQuarters(1278)); //Should return 3
    System.out.println(countQuarters(50)); //Should return 2
    System.out.println(countQuarters(98763825)); //Should return 1
  }//End of main method
  
  public static int countQuarters (int cents){
    String stringCents = String.valueOf(cents);
    int quarters = 0;
    if (stringCents.length() < 2){
      return quarters;
    }//End of if statement
    String lastTwoDigit = stringCents.substring(stringCents.length() - 2);
    quarters = (Integer.parseInt(lastTwoDigit))/25;
    return quarters;
  }//End of countQuarters method
  
}//End of Main class

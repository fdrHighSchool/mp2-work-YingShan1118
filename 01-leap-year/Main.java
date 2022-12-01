class Main {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2022));//Should return false 
    System.out.println(isLeapYear(2024));//Should return true
    System.out.println(isLeapYear(1900));//Should return false
    System.out.println(isLeapYear(2000));//Should return true
  }//End of main method
  public static boolean isLeapYear(int year){
    if (year%4 == 0) {
      if (year%100 != 0){
        return true;
      }//End of 2nd if statement
      else if (year%400 == 0){
        return true; 
      }//End of else if statment
      else{
        return false;
      }//End of 1st else statement
    }//End 1st if statement
    else{
      return false; 
    }//End 2nd else statement
  }//End isLeapYear method
}//End Main class

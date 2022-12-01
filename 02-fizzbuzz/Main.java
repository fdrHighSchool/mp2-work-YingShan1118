class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      System.out.println(fizzBuzz(i));
    }//End of for loop
  }//End of main method
  public static String fizzBuzz(int num){
    String result = "";
    if ((num % 3 != 0) && (num % 5 != 0)){
      result += num;
    }//End of 1st if statement
    if (num % 3 == 0){
      result += "Fizz";
    }//End of 2nd if statement
    if (num % 5 == 0){
      result += "Buzz";
    }//End of 3rd else if statement
    return result;
  }//End of fizzBuzz method
}//End of Main class

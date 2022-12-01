class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(1234)); //Should return false
    System.out.println(divBy3(3)); //Should reutrn true
    System.out.println(divBy3(339)); //Should return true
    System.out.println(divBy3(94)); //Should return false
    System.out.println(divBy3(0)); //Should return true  
  }//En dof main method
  public static boolean divBy3 (int num){
    int sum = 0;
    while (num > 0){
      sum += num%10;
      num = num/10;
    }//End of while statement
    return sum%3 == 0;
  }//End of divBy3 method
}//En dof Main class

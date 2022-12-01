class Main {
  public static void main(String[] args) {
    square(2);
    System.out.println();
    rectangle(3, 4);
    System.out.println();
    rightTriangle(5);
    System.out.println();
    triangle(6);  
  }//End of main method
  
  public static void square(int size){
    for(int row = 0; row < size; row++){
      for(int column = 0; column < size; column++){
        System.out.print("* ");
      }//End of col for loop
      System.out.println();
    }//End of row for loop
  }//End of square method
  
  public static void rectangle (int length, int width){
    for(int row = 0; row < length; row++){
      for(int column = 0; column < width; column++){
        System.out.print("* ");
      }//End of column for loop
      System.out.println();
    }//End of row for loop
  }//End of rectangle method

  public static void rightTriangle(int size){
    for(int height = 0; height <= size; height++){
      for(int width = 0; width < height; width++){
        System.out.print("* ");
      }//End of width for loop
      System.out.println();
    }//End of height fpr loop
  }//End of rightTriangle method

  public static void triangle(int size){
    int blankSpace = size;
    for(int height = 0; height < size; height++){
      for(int space = 1; space < blankSpace; space++){
        System.out.print(" ");
      }//End of space for loop 
      blankSpace -= 1;
      for(int width = 0; width <= height; width++){
        System.out.print("* ");
      }//End of width for loop
      System.out.println();
    }//End of height for loop
  }//End of triangle method  
}//End of Main class

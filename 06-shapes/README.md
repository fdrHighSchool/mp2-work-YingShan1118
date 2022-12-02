# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
  * public static void repeatNumbers (int num, int times, int row){     
        for (int r = 0; r < row; r++){        
           for (int n = 0; n <= num; n++){           
           for (int t = 0; t < times; t++){              
             System.out.print(n);             
           }//End of t for loop           
        }//End of n for loop        
       System.out.println();       
     }//End of r for loop     
  }//End of repeatNumbers method


2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
  *public static void greatestToLeast (int num, int times, int row){  
     for (int r = 0; r < row; r++){
        for (int n = num; n > 0; n--){
           for (int t = 0; t < times; t++){
             System.out.print(n);
           }//End of t for loop
        }//End of n for loop
       System.out.println();
     }//End of r for loop
  }//End of greatestToLeast method

import java.util.Scanner;
/**
 *
 * @author Anna Matilainen R00239522
 */
public class MyScanner {
    
    public static int nextInt(){
        Scanner keyboard = new Scanner (System.in);
        
        while (keyboard.hasNextInt()) {
          int i = keyboard.nextInt();
          return i;
      }
        return -999;      
    }
    
    public static double nextDouble(){
        Scanner keyboard = new Scanner (System.in);
        while (keyboard.hasNextDouble()){
            double d = keyboard.nextDouble();
        return d;
        }
        return -999;
    }
    public static String nextString(){
        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNextLine()){
             String s = keyboard.nextLine();
            return s;
        }
       return "Invalid input";
    }
     public boolean hasNext(){
        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNext()){
            boolean b = keyboard.hasNext();
            return b;
        }
       return false;
    }

     public static char nextChar(){
        Scanner keyboard = new Scanner(System.in);
        char c = keyboard.next().charAt(0);
        return c;
    }
    
    public static boolean nextBoolean(){
        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNextBoolean()){
            boolean b = keyboard.nextBoolean();
            return b;
        }
        return false;
    }
}


    
    
    
    
    
    
    



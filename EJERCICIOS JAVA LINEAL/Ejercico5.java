import java.util.Scanner;
import java.util.ArrayList;
class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
  
    int numero1,t1;

      System.out.print("Ingrese el  número: "); 
      numero1 = sc.nextInt();
       

    String c1 = numero1+"";
    char[] aC1 = c1.toCharArray(); 
    String aux = "", aux2="";

    //recorrer los dos arreglo
    for(int i = 0; i < aC1.length ;i++){
          int numEntero = Character.getNumericValue(aC1[i]);
      for(int j = 0 ; j < numEntero; j++){
          aux2 = aux2 + "0";
      }
          aux = aux+ numEntero+ aux2;
          aux2="";
      }
        System.out.println(aux); 
    }
    
  }
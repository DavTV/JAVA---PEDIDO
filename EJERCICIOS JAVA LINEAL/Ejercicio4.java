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
    String aux = "";

    //recorrer los dos arreglo
    for(int i = aC1.length-1; i >= 0 ;i--){
          aux = aux + aC1[i];
      }
        System.out.println(aux); 
    }
    
  }
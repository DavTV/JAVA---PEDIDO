import java.util.Scanner;
import java.util.ArrayList;
class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //declaraci�n de las variables
    int numero1, numero2, t1, t2;

    //lectura de los datos
    System.out.print("Ingrese el primer n�mero: "); 
    numero1 = sc.nextInt();
    t1= Integer.toString(numero1).length();
    
    //validar que sean de la misma longitud
    do{
      System.out.print("Ingrese el segundo n�mero: "); 
      numero2 = sc.nextInt();
      t2 = Integer.toString(numero2).length();
    }while(t1 != t2);

    // convertir los n�mero a cadenas y luego a un arreglo de car�cteres
  
    String c1 = numero1+"",c2=numero2+"";
    char[] aC1 = c1.toCharArray(); 
    char[] aC2 = c2.toCharArray(); 
    
    // variable auxiliar para almacenar la nueva cadena

    String aux ="";

    //recorrer los dos arreglos
    for(int i=0; i< aC1.length;i++){
        aux = aux+aC1[i]+aC2[i];
    }
    System.out.print(aux);

   
    
  } 
}
import java.util.Scanner;
// import java.util.ArrayList;
class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
  
    int numero1,t1;

    do{
      System.out.print("Ingrese el segundo n�mero: "); 
      numero1 = sc.nextInt();
      t1 = Integer.toString(numero1).length();
    }while(t1 >99);
    

    String c1 = numero1+"";
    char[] aC1 = c1.toCharArray(); 
    int sumaFactorial=0;

    //recorrer los dos arreglo
    for(int i=0; i< aC1.length;i++){
      if(aC1[i]%2==0){
        
        int numEntero = Character.getNumericValue(aC1[i]);
        int fact = 1;
          for( int j = 1; j <= numEntero; j++ ) {
             fact *= j;
          }
      sumaFactorial = sumaFactorial+fact;
      }else{
 
      System.out.println(aC1[i] + " Es primo"); 
      }
      }
    System.out.print("La suma de los factoriales es: "+ sumaFactorial);
        


    
  } 
}
import java.util.Scanner;
/*Hay tres líneas de entrada: La primera línea contiene un número entero .
La segunda línea contiene un doble . La tercera línea contiene un String .
Formato de salida: Hay tres líneas de salida: En la primera línea, imprima String:seguido de la cadena inalterada leída desde stdin.
En la segunda línea, imprima Double:seguido de la lectura doble inalterada de stdin.
En la tercera línea, imprima Int:seguido del entero inalterado leído de stdin.*/

public class ClaseReto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor escriba un número: ");
        int i = scanner.nextInt();
        
        System.out.println("Por favor escriba un décimal: ");
        double d = scanner.nextDouble();
        
        System.out.println("Por favor escriba un texto: ");
        scanner.nextLine();//Se llama al método sin asignarle variable para que el buffer lea bien el string
        String s = scanner.nextLine();
        
        
        scanner.close();
    
    
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}

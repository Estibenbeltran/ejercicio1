import java.utils.Scanner;
public class Main{
	public static void main(String[] arg){
		float a,b;
		Scanner cap = new Scanner(System.in);
		System.out.println("Este programa te permitir� saber el numero mayor, el numero menor y si son iguales entre dos variables");
		System.out.println("Ingresa el primer numero");
		a = cap.nextFloat();
		System.out.println("Ingresa el segundo n�mero");
		b = cap.nextFloat();
		System.out.println("");
		if(a>b){
		System.out.println("El numero mayor es: "+a);
		}
		if(a<b){
		System.out.println("El numero mayor es: "+b);
		}
		if(a==b){
		System.out.println("Estos numeros son iguales"+a);
		}	
		System.out.println("Ha finalizado el programa");	
	}	
}
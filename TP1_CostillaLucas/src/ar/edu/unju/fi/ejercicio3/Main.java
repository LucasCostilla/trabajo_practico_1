package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int num;

System.out.print("Ingrese un número entero");
num = sc.nextInt();
if(num % 2 == 0)
System.out.print("Resultado: "+num*3);
else
System.out.print("Resultado: "+num*2);
		}
				
	}

}

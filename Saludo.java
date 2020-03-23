package programacion2;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {

		Scanner leo = new Scanner(System.in);
   String name;
   
   System.out.println("¿Como te llamas?:");
   name = leo.next();
   
   System.out.println("Hola "+name);
	}

}

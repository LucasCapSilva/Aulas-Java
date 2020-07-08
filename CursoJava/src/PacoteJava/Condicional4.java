package PacoteJava;

import java.util.Scanner;

public class Condicional4 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num,n;
		double res;
		System.out.println("Entre com um número qualquer: ");
		num = entrada.nextInt();
		if(num%2==0)
		{
			//res = Math.sqrt(num);
			System.out.println("Número par ");
			n=0;
		}
		else
		{
			//res = Math.pow(num, 2);
			System.out.println("Número ímpar" );
			n=1;
		}
		switch(n)
		{
		case 0:
			res = Math.sqrt(num);
			System.out.println("Raiz quadrada: "+res);
			break;
		case 1:
			res = Math.pow(num, 2);
			System.out.println("Potencia: "+res );
			break;
		default:
			
			System.out.println("Inexistente..." );
		}
		
	}
}

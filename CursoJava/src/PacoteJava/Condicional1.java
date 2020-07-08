package PacoteJava;

import java.util.Scanner;

public class Condicional1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("ente com um número: ");
		num = entrada.nextInt();
		if(num>0)
		{
			System.out.println("Número positivo...");
		}
		else if(num<0)
			{
			System.out.println("Número negativo...");
			}
		else if(num==0)
			{
			System.out.println("É zero...");
			}
		else
		{
			System.out.println("Números irracionais...");
		}
		/*if(num<0 && num>0)
		{
			System.out.println("OK...consegui!!!");
		}
		else
		{
			System.out.println("É zero...");
		}*/
	}
}

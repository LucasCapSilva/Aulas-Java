package PacoteJava;

import java.util.Scanner;

public class Condicional1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("ente com um n�mero: ");
		num = entrada.nextInt();
		if(num>0)
		{
			System.out.println("N�mero positivo...");
		}
		else if(num<0)
			{
			System.out.println("N�mero negativo...");
			}
		else if(num==0)
			{
			System.out.println("� zero...");
			}
		else
		{
			System.out.println("N�meros irracionais...");
		}
		/*if(num<0 && num>0)
		{
			System.out.println("OK...consegui!!!");
		}
		else
		{
			System.out.println("� zero...");
		}*/
	}
}

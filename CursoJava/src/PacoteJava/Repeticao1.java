package PacoteJava;

import java.util.Scanner;

public class Repeticao1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);//uma linha /*  */ --> várias linhas
		int num,x,somapar=0,somaimpar=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if(num%2==0)
			{
				somapar++;
			}
			else
			{
				somaimpar++;
			}
		}
		System.out.println("Temos: "+somapar+"número(s) par(es)...");
		System.out.println("Temos: "+somaimpar+"número(s) impar(es)...");
		
	}
}

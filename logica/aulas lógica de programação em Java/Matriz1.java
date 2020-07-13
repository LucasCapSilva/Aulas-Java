package PacoteJava;

import java.util.Scanner;

public class Matriz1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int [][] m1 = new int[2][2];
		
		for(int l=0;l<2;l++)//lê a linha
		{
			for(int c=0;c<2;c++)//lê a coluna
			{
				System.out.println("Entre com um valor: ");
				m1[l][c] = ler.nextInt();
				
			}
		}
		for(int l=0;l<2;l++)//roda linha/coluna verificando se existe um número par
							//trocando por ZERO
		{
			for(int c=0;c<2;c++)
			{
				// 6==0		5
				// 8==0		7
				if(m1[l][c]%2==0)//substituir o valor par por ZERO
				{
					m1[l][c]=0;
				}
				if(l==c)
				{
					System.out.println("\nValor: "+m1[l][c]);//mostra os valores da diagonal principal
				}
			}
		}
		for(int l=0;l<2;l++)//lê a linha
		{
			for(int c=0;c<2;c++)//lê a coluna
			{
				
				System.out.println("\nValores: "+m1[l][c]);//mostrando a matriz depois de alterada
			}
		}
	}
}

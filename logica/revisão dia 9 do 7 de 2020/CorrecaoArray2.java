package PacoteJava;

import java.util.Scanner;

public class CorrecaoArray2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		float [][] m1 = new float[2][2],m2 = new float[2][2];
		float [][] somar = new float[2][2],subtrair = new float [2][2];
		int consti,op;
		//(1) somar as duas matrizes 
		//(2) subtrair a primeira matriz da segunda 
		//(3) adicionar uma constante as duas matrizes
		//(4) imprimir as matrizes 
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.println(" Entre com um número: ");
				m1[l][c]= ler.nextFloat();
			}
		}
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.println(" Entre com um número: ");
				m2[l][c]= ler.nextFloat();
			}
		}
		System.out.println("\n (1) somar as duas matrizes");
		System.out.println("\n (2) subtrair a primeira matriz da segunda");
		System.out.println("\n (3) adicionar uma constante as duas matrizes");
		System.out.println("\n (4) imprimir as matrizes ");
		System.out.println("\n Digite a sua opção: ");
		op = ler.nextInt();
		switch(op)
		{
		case 1:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					somar[l][c] = m1[l][c]+m2[l][c];
					System.out.println("\nValor: "+somar[l][c]);
				}
			}
			break;
		case 2:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					subtrair[l][c] = m1[l][c]-m2[l][c];
					System.out.println("\nValor: "+subtrair[l][c]);
				}
			}
			break;
		case 3:
			System.out.println(" Entre com um valor constante: ");
			consti = ler.nextInt();
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					m1[l][c] = m1[l][c]+consti;
					m2[l][c] = m2[l][c]+consti;
					System.out.println("\nM1: "+m1[l][c]);
					System.out.println("\nM2: "+m2[l][c]);
				}
			}
			break;
		case 4:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					
					System.out.println("\nMatriz 1: "+m1[l][c]);
				}
			}
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					
					System.out.println("\nMatriz 2: "+m2[l][c]);
				}
			}
			break;
		default:
			System.out.println("Opção inválida...");
			
		}
		
	}
}

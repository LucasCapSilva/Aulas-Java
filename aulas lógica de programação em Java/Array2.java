package PacoteJava;

import java.util.Scanner;

public class Array2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		final int consti=4;
		int [] a1 = new int[consti];
		int acumulador=0;
		float media;
		/*String [] s1 = new String[5];
		int[] b;
		b = new int[10];
		int [] c = new int[2],d = new int[3],e= new int[5];
		int[] elementos = {5,6,7,8};
		int [] meuVetor;
		meuVetor = new int[3];
		meuVetor[0]=100;
		meuVetor[1]=110;
		meuVetor[2]=120;*/
		for(int i=0;i<a1.length;i++)//length mostra o tamanho do meu array
		{
			System.out.println("Entre com um valor para a posição "+(i+1)+":");
			a1[i] = ler.nextInt();
			acumulador = acumulador+a1[i];
		
		}
		for(int i=0;i<a1.length;i++)
		{
			//System.out.printf("\nPosição %d: %d",i+1,a1[i]);
			System.out.printf("\nPosição "+(i+1)+": "+a1[i]);
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Posição "+(i+1)+": "+a1[i]);
		}
		
		media = acumulador/a1.length;
		System.out.println("Media: "+media);
		
		
		
		
	}
		
		    
}
	


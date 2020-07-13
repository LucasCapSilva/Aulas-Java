package PacoteJava;

import java.util.Scanner;

public class Repeticao2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		//int valor=50,somavalor=0,cont=0,valor1,somavalor1=0;
		//float media,media1;
		int idade,maior=0,menor=0;
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		do
		{
			if(idade>=18)
			{
				maior++;
			}
			else
			{
				menor++;
			}
			System.out.printf("\nIdade que digitei: %d \n",idade);
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			
		}while(idade!=0);
		
		System.out.println("Temos: "+maior+" pessoa(s) de maior idade...");
		System.out.println("Temos: "+menor+" pessoa(s) de menor idade...");
		/*while(valor<=55)
		{
			System.out.println("Entre com um valor: ");
			valor1 = ler.nextInt();
			somavalor1= somavalor1+valor1;
			somavalor=somavalor+valor;
			valor++;
			cont++;
		}
		media = somavalor/cont;
		media1 = somavalor1/cont;
		System.out.println("Media de valores lidos foi de: "+media);
		System.out.println("Media1 de valores lidos foi de: "+media1);
		*/
		
	}
}

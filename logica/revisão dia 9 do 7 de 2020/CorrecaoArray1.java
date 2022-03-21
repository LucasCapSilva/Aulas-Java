package PacoteJava;
import java.util.Scanner;


public class CorrecaoArray1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int [] num = new int[6],par = new int[6],impar = new int[6];
		int somapar=0,contimpar=0,x;
		
		for(x=0;x<6;x++)
		{
			System.out.println("Entre com um número: ");
			
			num[x] = ler.nextInt();
			
		}
		for(x=0;x<6;x++)
		{
			if(num[x]%2==0)
			{
				//System.out.println("Número par: "+num[x]);
				par[x]=num[x];
				somapar = somapar+num[x];
			}
			else
			{
				//System.out.println("Número ímpar: "+num[x]);
				impar[x]=num[x];
				contimpar++;
			}
		}
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",par[x]);
		}
		System.out.printf("\n");
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",impar[x]);
		}
		System.out.println("\nSomatório dos números pares: "+somapar);
		System.out.println("\nContador dos números impares: "+contimpar);
	}
}

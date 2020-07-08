package PacoteJava;

import java.util.Scanner;

public class Condicional3 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int n1,n2,n3;
		System.out.println("entre com o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("entre com o segundo número: ");
		n2 = entrada.nextInt();
		System.out.println("entre com o terceiro número: ");
		n3 = entrada.nextInt();
		// Menor	Meio	Maior
		// n1		n2		n3 *
		// n1		n3		n2 *
		// n2		n1		n3 *
		// n2		n3		n1 *
		// n3		n1		n2 *
		// n3		n2		n1 *
		
		if(n1<n2 && n2<n3)
		{
			System.out.printf("%d, %d, %d ",n1,n2,n3);
		}
		else if(n1<n3 && n3<n2)
			{
				System.out.printf("%d, %d, %d ",n1,n3,n2);
			}
			else if(n2<n1 && n1<n3)
				{
					System.out.printf("%d, %d, %d ",n2,n1,n3);
				}
				else if(n2<n3 && n3<n1)
					{
						System.out.printf("%d, %d, %d ",n2,n3,n1);
					}
					else if (n3<n1 && n1<n2)
						{
							System.out.printf("%d, %d, %d ",n3,n1,n2);
						}
						else
						{
							System.out.printf("%d, %d, %d ",n3,n2,n1);
						}
	}
}

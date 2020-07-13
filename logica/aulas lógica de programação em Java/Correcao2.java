package PacoteJava;

import java.util.Scanner;

public class Correcao2 {
	public static void main (String args[])
	{
		Scanner ent = new Scanner (System.in);
		int a,b,c;
		double r,s,d;
		float n1,n2,media;
		
		System.out.println("Entre com o valor de A:");
		a = ent.nextInt();
		System.out.println("Entre com o valor de B:");
		b = ent.nextInt();
		System.out.println("Entre com o valor de C:");
		c = ent.nextInt();
		System.out.println("Entre com o valor da nota 1:");
		n1 = ent.nextFloat();
		System.out.println("Entre com o valor da nota 2:");
		n2 = ent.nextFloat();
		media = (n1+n2)/2;
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		System.out.printf("\nO valor da media foi de: %5.2f \n",media);
		System.out.println("O valor de D: "+d);
		
	}
}

package PacoteJava;

import java.util.Scanner;

public class Condicional2 {
	public static void main (String args[])
	{
		float num1,num2,resultado;
		int opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com o primeiro número: ");
		num1 = entrada.nextFloat();
		System.out.println("entre com o segundo número: ");
		num2 = entrada.nextFloat();
		System.out.printf("\n1-Soma 2-Diferença 3-Multiplicação 4-Divisão\n");
		opcao = entrada.nextInt();
		switch(opcao)
		{
		case 1:
			resultado = num1+num2;
			System.out.println("A soma foi de: "+resultado);
			break;
		case 2:
			resultado = num1-num2;
			System.out.println("A diferença foi de: "+resultado);
			break;
		case 3:
			resultado = num1*num2;
			System.out.println("A multiplicação foi de: "+resultado);
			break;
		case 4:
			if(num2==0)
			{
				System.out.println("Não existe divisão por ZERO!!!");
			}
			else
			{
			resultado = num1/num2;
			System.out.println("A divisão foi de: "+resultado);
			
			}
			break;
		default:
			System.out.println("Opção inválida!!!");
		}
	}
}

package PacoteJava;

import java.util.Scanner;

public class Testeescolha {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		
		float num1,num2,resultado;
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextFloat();
		System.out.printf("Menu: \n1- Soma \n2- Diferença \n3- Multiplicação \n4- Divisão");
		System.out.println("\nDigite a sua opção:");
		int operador = entrada.nextInt();
		switch(operador)
		{
		case 1:
			resultado = num1+num2;
			System.out.println("Resultado da soma: "+resultado);
			break;
		case 2:
			resultado = num1-num2;
			System.out.println("Resultado da diferença: "+resultado);
			break;
		case 3:
			resultado = num1*num2;
			System.out.println("Resultado da multiplicação: "+resultado);
			break;
		case 4:
			resultado = num1/num2;
			System.out.println("Resultado da divisão: "+resultado);
			break;
		default:
			System.out.println("Operação inválida");
			
		}
		
	}
}

package PacoteJava;

import java.util.Scanner;

public class Testeescolha {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		
		float num1,num2,resultado;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextFloat();
		System.out.printf("Menu: \n1- Soma \n2- Diferen�a \n3- Multiplica��o \n4- Divis�o");
		System.out.println("\nDigite a sua op��o:");
		int operador = entrada.nextInt();
		switch(operador)
		{
		case 1:
			resultado = num1+num2;
			System.out.println("Resultado da soma: "+resultado);
			break;
		case 2:
			resultado = num1-num2;
			System.out.println("Resultado da diferen�a: "+resultado);
			break;
		case 3:
			resultado = num1*num2;
			System.out.println("Resultado da multiplica��o: "+resultado);
			break;
		case 4:
			resultado = num1/num2;
			System.out.println("Resultado da divis�o: "+resultado);
			break;
		default:
			System.out.println("Opera��o inv�lida");
			
		}
		
	}
}

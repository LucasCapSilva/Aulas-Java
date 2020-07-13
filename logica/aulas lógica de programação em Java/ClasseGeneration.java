package PacoteJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasseGeneration {
	
	public static void main (String args[])
			{
				//criando objeto do tipo Scanner 
				Scanner leitura = new Scanner(System.in) ;
				
				//int a,b,soma;
				float n1,n2; // definido variáveis
				double media,raiz,pot;
				
				
				/*System.out.printf("Entre com o valor de A:");
				a = leitura.nextInt(); // entrada de dados do tipo inteiro
				System.out.printf("Entre com o valor de B:");
				b = leitura.nextInt();
				soma = a+b;*/
				System.out.printf("Entre com a nota 1:");
				n1 = leitura.nextFloat(); // entrada de dados do tipo Float
				System.out.printf("Entre com a nota 2:");
				n2 = leitura.nextFloat();
				media = (n1+n2)/2;
				System.out.printf("\nA media foi de: %2.2f",media,"\n");
				raiz = Math.sqrt(media); // calculo da raiz quadrada
				pot = Math.pow(media, 2); // calculo da potencia
				System.out.printf("\nRaiz quadrada: \n");
				System.out.println(raiz);
				System.out.printf(" \n");
				System.out.println("Potencia: "+pot);
				System.out.printf("\n Raiz quadrada: %5.2f",raiz);
				JOptionPane.showMessageDialog(null,"Olá meus amigos GENERATIONS...");
			}

}

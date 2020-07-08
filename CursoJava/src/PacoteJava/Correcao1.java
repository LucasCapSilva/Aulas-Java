package PacoteJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Correcao1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int ano,mes,dia,totaldias;
		
		System.out.printf("Entre com os anos: ");
		ano = entrada.nextInt();
		System.out.println("Entre com os meses: ");
		mes = entrada.nextInt();
		System.out.printf("Entre com os dias: ");
		dia = entrada.nextInt();
		
		totaldias = (ano*365)+ (mes*30)+ dia;
		System.out.printf("\nAno: %d, Meses: %d e dias: %d e Total de dias vividos: %d dias...\n",ano,mes,dia,totaldias);
		System.out.println("Ano: "+ano+" Meses: "+mes+" Dias: "+dia+"Total de dias vividos: "+totaldias+" dias...");
		JOptionPane.showMessageDialog(null, "Viva JAVA");
	}
}

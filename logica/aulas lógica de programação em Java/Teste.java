package PacoteJava;

import java.util.*;

public class Teste {
	
	    public static void main (String args[]){
	            float mesada;
	            float compra;
	            int resposta;
	            String mensagem = "Digite um valor válido";
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        
	        System.out.println("Qual é o valor da sua mesada?");
	        mesada = entrada.nextFloat();
	        
	        
	        
	        System.out.println("O que deseja fazer?");
	        System.out.println("1 - COMPRAR, 2 - ESTOU SATISFEITO, 3 - APENAS OLHAR");
	        resposta = entrada.nextInt();
	        switch(resposta){
	            case 1:
	            System.out.println("Qual o valor da compra?");
	            compra = entrada.nextFloat();
	            mesada = mesada - compra;
	            
	            
	            if(mesada < 0){
	                    System.out.println("Você não tem mais dinheiro!");
	                }
	            if(compra > mesada){
	                    System.out.println("Não possui dinheiro suficiente");
	                    
	                    }
	            break;     
	        
	            case 2:
	                compra = entrada.nextFloat();
	                float totalparc = mesada - compra;
	                System.out.println("Seu saldo é de:" + totalparc);
	                break;
	                
	            
	                
	            case 3:
	                System.out.println("Agradecedemos sua preferência.");
	                break;
	                
	            
	            default:
	                System.out.println(mensagem);
	                break;
	
	        }
	            
	    }
}

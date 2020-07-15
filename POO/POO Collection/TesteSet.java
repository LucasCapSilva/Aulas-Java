package teste;

	import java.util.*;
	
	public class TesteSet {
	  public static void main(String args[]) { 
	      //int count[] = {34, 22,10,60,30,22};
	      String nome[] = {"Luis","Lucas","Mario","Maria","Luis"};
	      Set<String> set = new HashSet<String>();
	      try {
	         for(int i = 0; i <5; i++) {
	            set.add(nome[i]);
	         }
	         System.out.println(set);

	         TreeSet listaordenada = new TreeSet<String>(set);
	         System.out.println("A lista ordenada é:");
	         System.out.println(listaordenada);

	         System.out.println("The First element of the set is: "+ (String)listaordenada.first());
	         System.out.println("The last element of the set is: "+ (String)listaordenada.last());
	      }
	      catch(Exception e) {}
	   }
	} 


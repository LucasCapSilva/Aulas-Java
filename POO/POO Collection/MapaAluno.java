package POO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("João","JAVA",8.6);
		Aluno b = new Aluno("Maria","Linux",8.6);
		Aluno c = new Aluno("Izabel","SO",8.6);
		Aluno d = new Aluno("Matheus","C#",8.6);
		
		mapa.put("João", a);
		mapa.put("Maria", b);
		mapa.put("Izabel", c);
		mapa.put("Matheus", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Izabel"));
		
		Collection<Aluno> alunos = mapa.values();
		for (Aluno e: alunos)
		{
			System.out.println(e);
		}
	}
}

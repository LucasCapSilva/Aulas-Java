package POO;

public class TestaHeranca {
	public static void main(String args[])
	{
		Pessoa1 luane = new Pessoa1 ("Luane",111);
		Funcionario1 mauricio = new Funcionario1("Mauricio",222,"Tecnologia da Informação");
		Pessoa1 lucao = new Funcionario1("Lucao",333,"Biologia");
		Pessoa1 natalia = new Coordenador("Natalia",444,"Desenvolvimento de Sistemas");
		
		System.out.println(mauricio.getNome()+" "+mauricio.getMatricula()+" "+mauricio.getDepartamento());
		System.out.println(natalia.getMatricula());
		System.out.println(luane.getNome());
	}
}

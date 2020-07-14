package POO;

public class TestaInterface {
	public static void main(String args[])
	{
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		System.out.println("O participante está lendo:"+leitor.lendo());
		Programador programadora = participante;
		String java = "Java na Veia";
		programadora.pensando(java.toCharArray());
		System.out.println("E programando: "+programadora.digitando());
		//Analista analista = participante;
		//System.out.println("O analista teve o parecer:"+analista.parecer());
	}
}

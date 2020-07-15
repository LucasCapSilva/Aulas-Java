package POO;

public class TelefoneCelular extends Telefone {
	
	public TelefoneCelular()
	{
		super("celular");
	}
	public void toca (int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Tananananaaaaa...Tanana...Tanana");
			break;
		case 2:
			System.out.println("Ohhhhhhh Gaaaaaassssss...");
			break;
		default:
			System.out.println("Hellooo Motorrrrr...");
			break;
		}
		
	}
	public void disca(String numero)
	{
		System.out.println("O número: "+numero+" é um celular...");
		
	}
}

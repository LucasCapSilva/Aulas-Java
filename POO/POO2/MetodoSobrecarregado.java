package POO;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados()
	{
		System.out.printf("Sal�rio inteiro: %d\n",salario(700,500));
		System.out.printf("Sal�rio double: %f\n",salario(750.500));
	}
	public int salario(int valorInt,int valorInt1)
	{
		System.out.printf("\n Sal�rio com argumento inteiro: %d, %d\n",valorInt,valorInt1);
		return valorInt*2;
	}
	public double salario(double valorDouble)
	{
		System.out.printf("\n Sal�rio com argumento double: %f\n",valorDouble);
		return valorDouble*valorDouble;
	}
}

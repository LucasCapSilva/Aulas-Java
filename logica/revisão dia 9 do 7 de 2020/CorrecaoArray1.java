
			System.out.println("Entre com um número: ");
			
			num[x] = ler.nextInt();
			
		}
		for(x=0;x<6;x++)
		{
			if(num[x]%2==0)
			{
				//System.out.println("Número par: "+num[x]);
				par[x]=num[x];
				somapar = somapar+num[x];
			}
			else
			{
				//System.out.println("Número ímpar: "+num[x]);
				impar[x]=num[x];
				contimpar++;
			}
		}
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",par[x]);
		}
		System.out.printf("\n");
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",impar[x]);
		}
		System.out.println("\nSomatório dos números pares: "+somapar);
		System.out.println("\nContador dos números impares: "+contimpar);
	}
}

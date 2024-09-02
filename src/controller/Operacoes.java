package controller;

public class Operacoes 
{

	public Operacoes() 
	{
		super();
	}
	public void operacao(int [] vet )
	{
	br.edu.fateczl.quicksort.Operacoes op = new br.edu.fateczl.quicksort.Operacoes();	
	int fim=vet.length-1;
	int inicio=0;
	
	vet=op.quickSort(vet, inicio, fim);
	for(int i:vet)
	System.out.print(i+" ");
	}
	
}

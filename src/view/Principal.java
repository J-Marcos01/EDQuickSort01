package view;

import controller.Operacoes;

public class Principal {

	public static void main(String[] args) {

		Operacoes operacoes = new Operacoes();
		
		System.out.println("Vetores Originais");
		int [] vet= {74,20,74,87,81,16,25,99,44,58};
		int [] vet1= {44,43,42,41,40,39,38};
		int [] vet2= {31,32,33,34,99,98,97,96};
		
	
		System.out.print("Vetor 1 ==> ");
		for(int num:vet)
		{
			System.out.print(num+" ");
		}
		
		
		System.out.print("\nVetor 2 ==> ");
		for(int num:vet1)
		{
			System.out.print(num+ " ");
		}
		
		
		System.out.print("\nVetor 3 ==> ");
		for(int num:vet2)
		{
			System.out.print(num+" ");
		}
		
		
		System.out.println("\nVetores Organizados ");
		System.out.print("Vetor 1 ==> ");
		operacoes.operacao(vet);
		
		System.out.print("\nVetor 2 ==> ");
		operacoes.operacao(vet1);
		
		System.out.print("\nVetor 3 ==> ");
		operacoes.operacao(vet2);
	}

}

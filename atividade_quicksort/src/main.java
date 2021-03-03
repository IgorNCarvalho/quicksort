import java.util.Scanner;

public class main {

	static void quicksort (int[] vetor, int esq, int dir)
	{
		int pivo, aux, i, j;
		int meio;
		i = esq; 
		j = dir;
		
		meio = (int)((i + j) / 2);
		pivo = vetor[meio];
		
		do
		{
			while(vetor[i] < pivo) i = i + 1;
			while(vetor[j] > pivo) j = j -1;
			
			if(i <= j)
			{
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i = i + 1;
				j = j -1;
			}
		}
		while(j > i);
		
		if(esq < j) quicksort(vetor, esq, j);
		if(i < dir) quicksort(vetor, i, dir);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] dados = new int[10];
		
		for(int i=0; i<dados.length;i++)
			dados[i] = sc.nextInt();	
		
		quicksort(dados, 0, dados.length -1);
		System.out.println("\n\nNúmeros ordenados:\n");
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
		
		sc.close();
	}

}

package ex2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); //Instaciamento do Array list  
		minhaLista.add(1); //  valor 1
		minhaLista.add(2); //  valor 2
		minhaLista.add(2); //  valor 2
		
		for (Integer listaElementos : minhaLista) { // pega o valor da primeira variavel da lista e coloca seu valor em listaElementos ate acabar a execução do for, em seguida passa para o proximo valor da variavel até que a lista seja percorrida por inteira
			System.out.println(listaElementos); //imprime os valores da lista 
		}
		
		Set<Integer> meuSet = new HashSet<Integer>(); //Passa os valores da primeira lista para a lista referenciada  
		meuSet.add(1); // valor 1
		meuSet.add(2); // valor 2
		meuSet.add(3); // valor 3
		meuSet.add(1); // não foi adicionado este valor porque set funciona com valores identicos
		
		int valor;
		Iterator<Integer> iMeuSet = meuSet.iterator(); //Se comunica com cada item do iMeuSet
		while(iMeuSet.hasNext()){ //  HashSet armazena valores que não se repetem			
			valor = iMeuSet.next(); // A variável valor recebe  iMeuSet
			System.out.println(valor); // Mostra os itens de meuSet que estão variável valor
		}
	}
}
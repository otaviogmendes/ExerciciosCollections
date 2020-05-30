package ex3;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula";  // adiciona o texto na variável aula1
		String aula2 = "Conhecendo mais de listas"; // adiciona o texto na variável aula2
		String aula3 = "Trabalhando com Cursos e Sets"; // adiciona o texto na variável aula3
		
		ArrayList<String> aulas = new ArrayList<>(); //Instaciamento do Array list  
		aulas.add(aula1); //adiciona itens aula1
		aulas.add(aula2); //adiciona itens aula2
		aulas.add(aula3); //adiciona itens aula3
		
		System.out.println(aulas); //mostra toda a lista aulas adicionadas
		System.out.println(aulas.size()); //  Mostra  o tamanho do ArrayList aulas
		
		
		//esta errado, não existe posição 3 no array, teria que ser usado o <
		for (int i = 0; i < aulas.size(); i++) { // usando for para acessar  os indices da lista
			System.out.println("Aula: " + aulas.get(i)); // // mostra o valor do indice i
		}

	}

}

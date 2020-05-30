package main;

import java.util.*;

import model.Telefone;

public class main {
	public static void main(String args[]) {
		//0=residencial 1=comercial 2=celular
		
		List<Telefone> lista = new ArrayList<Telefone>();
		Telefone tel01 = new Telefone("0000-1111", 0);
		Telefone tel02 = new Telefone("0000-2222", 1);
		Telefone tel03 = new Telefone("0000-3333", 2);
	
		
		lista.add(tel01);
		lista.add(tel02);
		lista.add(tel03);
	
		Telefone telefone;
		Iterator<Telefone> itr = lista.iterator();
		while(itr.hasNext()) {
			telefone = itr.next();			
			
				System.out.print(telefone.getNrTelefone());
				System.out.print(" /  ");
				switch(telefone.getTipoTelefone()) {
					case 0: System.out.print("Ramal 01\n"); break;
					case 1: System.out.print("Ramal 02\n"); break;
					case 2: System.out.print("Ramal 03\n"); break;
					default: System.out.print("Erro\n"); break;
				}
		}
	}

}

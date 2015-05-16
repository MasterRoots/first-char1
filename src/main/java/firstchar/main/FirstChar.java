package firstchar.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import firstchar.business.StreamChar;
import firstchar.interfaces.Stream;

/**
 * Main para execução da çeitura de Stream
 * 
 * @author Rodrigo Braga
 *
 */
public class FirstChar {

	public static void main(String[] args) {

		StreamChar stream = new StreamChar("aAbBABabc");

		try {
			System.out.println("O primeiro char que nao  se repete eh =  "
					+ firstChar(stream));
		} catch (Exception e) {
			System.out.println("Nao existem chars unicos nessa stream");
		}

	}

	public static char firstChar(Stream input) {

		// Crio dois tipos de lista: Um dos itens que se repetem e outro para os
		// aque aparecem apena uma vez
		Set<Character> othersChar = new HashSet<>(); // Elimina duplicados
		List<Character> uniqueChars = new ArrayList<>();

		while (input.hasNext()) {
			char nextChar = input.getNext();

			// Continue a varrer a Stream caso esse caracter
			if (othersChar.contains(nextChar)) {
				continue;
			}

			// Vou adicionando o char enquanto ele ainda só apareceu uma vez e
			// removo se achar outro igual
			if (uniqueChars.contains(nextChar)) {
				uniqueChars.remove((Character) nextChar);
				othersChar.add(nextChar);
			} else {
				uniqueChars.add(nextChar);
			}

		}

		// Independente de quantos chars unicos, retorno sempre o primeiro
		return uniqueChars.get(0);
	}

}

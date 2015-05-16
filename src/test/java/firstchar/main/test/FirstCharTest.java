package firstchar.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import firstchar.business.StreamChar;
import firstchar.main.FirstChar;

/**
 * Classe de teste do first char
 * 
 * @author Rodrigo Braga
 *
 */
public class FirstCharTest {

	@Test
	public void deveTerUmCharQueNaoSeRepete() {

		StreamChar c1 = new StreamChar("aAbBABabc");
		StreamChar c2 = new StreamChar("aAbBDABab");
		StreamChar c3 = new StreamChar("abc");
		StreamChar c4 = new StreamChar("aAbBABabF");

		assertEquals('c', FirstChar.firstChar(c1));
		assertEquals('D', FirstChar.firstChar(c2));
		assertEquals('a', FirstChar.firstChar(c3));
		assertEquals('F', FirstChar.firstChar(c4));
	}

	@Test(expected = Exception.class)
	public void naoTemCharUnico() {

		StreamChar c1 = new StreamChar("aa");
		StreamChar c2 = new StreamChar("aAbBDABab");
		StreamChar c3 = new StreamChar("a");
		StreamChar c4 = new StreamChar("aaaaaabbbbccc");

		assertEquals('c', FirstChar.firstChar(c1));
		assertEquals('D', FirstChar.firstChar(c2));
		assertEquals('a', FirstChar.firstChar(c3));
		assertEquals('F', FirstChar.firstChar(c4));
	}

}

package firstchar.interfaces;

/**
 * Interface para manipulação de uma Stream
 * 
 * @author Rodrigo Braga
 *
 */
public interface Stream {

	/**
	 * Retorna próximo char
	 * 
	 * @return char
	 */
	public char getNext();

	/**
	 * Existe outro char a ser lido?
	 * 
	 * @return true/false
	 */
	public boolean hasNext();

}

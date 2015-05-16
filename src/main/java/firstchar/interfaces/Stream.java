package firstchar.interfaces;

/**
 * Interface para manipula��o de uma Stream
 * 
 * @author Rodrigo Braga
 *
 */
public interface Stream {

	/**
	 * Retorna pr�ximo char
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

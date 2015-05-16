package firstchar.business;

import firstchar.interfaces.Stream;

/**
 * Implementaçãonpara a leitura de uma Stream char
 * 
 * @author Rodrigo Braga
 *
 */
public class StreamChar implements Stream {

	private char[] array;

	private int index = 0;

	public StreamChar(String stream) {
		this.array = stream.toCharArray();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see firstchar.Stream#getNext()
	 */
	@Override
	public char getNext() {
		char next = this.array[this.index];
		this.index++;
		return next;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see firstchar.Stream#hasNext()
	 */
	@Override
	public boolean hasNext() {

		return this.array.length > this.index;
	}

}

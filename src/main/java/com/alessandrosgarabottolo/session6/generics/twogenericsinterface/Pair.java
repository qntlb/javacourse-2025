package com.alessandrosgarabottolo.session6.generics.twogenericsinterface;

/**
 * A generic interface that represents a pair of key and value.
 *
 * @param <K> the type of the key
 * @param <V> the type of the value
 */
public interface Pair<K, V> {
	
	/**
	 * Returns the key component of the pair.
	 *
	 * @return the key
	 */
    K getKey();
    
    /**
     * Returns the value component of the pair.
     *
     * @return the value
     */
    V getValue();
}

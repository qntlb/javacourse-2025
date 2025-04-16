package com.alessandrosgarabottolo.session6.generics.twogenericsinterface;

/**
 * A concrete implementation of the {@link Pair} interface, 
 * where the key is a {@code String} and the value is an {@code Integer}.
 */
public class StringIntegerPair implements Pair<String, Integer> {
    private String key;
    private Integer value;

    /**
     * Constructs a new {@code StringIntegerPair} with the given key and value.
     *
     * @param key the key string
     * @param value the integer value
     */
    public StringIntegerPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getKey() { return key; }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getValue() { return value; }
}

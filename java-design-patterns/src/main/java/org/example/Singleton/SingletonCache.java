package org.example.Singleton;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SingletonCache<K,V> implements Serializable, Cloneable {

    private static SingletonCache singletonCache = null;

    private Map<K, V> cache = new HashMap<K, V>();

    public static <K,V> SingletonCache<K, V> getInstance(){
        if (singletonCache == null){
            synchronized (SingletonCache.class){
                if (singletonCache == null){
                    singletonCache = new SingletonCache();
                }
            }
        }
        return singletonCache;
    }

    /**
     * To prevent Object to be created by serialization / deserialization
     */
    protected Object readResolve() { return singletonCache; }


    /**
     * To prevent object to be created by cloning
     * @throws CloneNotSupportedException
     */
    protected Object clone()
            throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void setValue(K key, V value){
        cache.put(key, value);
    }

    public V getValue(K key){
        return cache.get(key);
    }
}
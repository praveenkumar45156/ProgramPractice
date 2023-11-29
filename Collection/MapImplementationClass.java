import java.util.HashMap;

class MapImplementationClass 
{
	public static void main(String[] args) 
	{
		// TreeMap, HashMap, LinkedHashMap, Hashtable

		// HashMap Declaration

		HashMap<Integer,String> hash1 = new HashMap<Integer,String>(); // default initial capacity (16) and the default load factor (0.75).
		/*
		HashMap(int initialCapacity)
		Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).
		HashMap(int initialCapacity, float loadFactor)
		Constructs an empty HashMap with the specified initial capacity and load factor.
		HashMap(Map<? extends K,? extends V> m)
		Constructs a new HashMap with the same mappings as the specified Map.
		*/
		hash1.put(1,"Hello");
		hash1.put(2,"World");
		System.out.println(hash1);
		//hash1.clear();
		//System.out.println(hash1);
		System.out.println(hash1.containsKey(1));
		System.out.println(hash1.containsValue("World"));
		System.out.println(hash1.get(2));
		System.out.println(hash1.getOrDefault(3,"not available"));
		System.out.println(hash1.isEmpty());
		System.out.println(hash1.keySet());

		HashMap<Integer,String> hash2 = new HashMap<Integer,String>();
		hash2.putAll(hash1);
		System.out.println(hash2);
		System.out.println(hash2.putIfAbsent(2,"Hello")); //If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
		//System.out.println(hash2.remove(2));
		//System.out.println(hash2.remove(1,"Hello"));
		System.out.println(hash2.replace(2,"praveen"));
		System.out.println(hash2.replace(2,"praveen","kumar"));
		System.out.println(hash2.size());
		System.out.println(hash2.values());
		System.out.println(hash2);

		/*
		void	clear()
		Removes all of the mappings from this map.
		Object	clone()
		Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
		V	compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
		Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
		V	computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
		If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
		V	computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
		If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
		boolean	containsKey(Object key)
		Returns true if this map contains a mapping for the specified key.
		boolean	containsValue(Object value)
		Returns true if this map maps one or more keys to the specified value.
		Set<Map.Entry<K,V>>	entrySet()
		Returns a Set view of the mappings contained in this map.
		void	forEach(BiConsumer<? super K,? super V> action)
		Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
		V	get(Object key)
		Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		V	getOrDefault(Object key, V defaultValue)
		Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
		boolean	isEmpty()
		Returns true if this map contains no key-value mappings.
		Set<K>	keySet()
		Returns a Set view of the keys contained in this map.
		V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
		If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
		V	put(K key, V value)
		Associates the specified value with the specified key in this map.
		void	putAll(Map<? extends K,? extends V> m)
		Copies all of the mappings from the specified map to this map.
		V	putIfAbsent(K key, V value)
		If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
		V	remove(Object key)
		Removes the mapping for the specified key from this map if present.
		boolean	remove(Object key, Object value)
		Removes the entry for the specified key only if it is currently mapped to the specified value.
		V	replace(K key, V value)
		Replaces the entry for the specified key only if it is currently mapped to some value.
		boolean	replace(K key, V oldValue, V newValue)
		Replaces the entry for the specified key only if currently mapped to the specified value.
		void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
		Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
		int	size()
		Returns the number of key-value mappings in this map.
		Collection<V>	values()
		Returns a Collection view of the values contained in this map.
		*/

		
	}
}

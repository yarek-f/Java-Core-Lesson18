package lgs.task2.max;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap<K, V> {

	private Map<K, V> myMap = new HashMap<>();

	public void addObject(K k, V v) {
		MyEntry<K, V> myEntry = new MyEntry<>(k, v);
		myMap.put(myEntry.getKey(), myEntry.getValue());
	}

	public void deleteKey(K k) {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getKey().equals(k)) {
				iterator.remove();
			}
		}
	}

	public void deleteValue(V v) {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getValue().equals(v)) {
				iterator.remove();
			}
		}
	}

	public void setOfKeys() {
		Set<K> setOfKeys = new HashSet<>();
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			setOfKeys.add(next.getKey());
		}

		System.out.println("Set of keys: " + setOfKeys);
	}

	public void listOfValues() {
		List<V> listOfValues = new ArrayList<>();
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			listOfValues.add(next.getValue());
		}

		System.out.println("List of values: " + listOfValues);
	}

	public Map<K, V> getEntryMap() {
		return myMap;
	}

	public void showMap() {
		System.out.println("My map: " + getEntryMap());
	}

}

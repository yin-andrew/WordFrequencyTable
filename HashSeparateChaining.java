public class HashSeparateChaining {

	private class Node {
		Entry entry;
		Node next;

		Node(Entry entry) { 
			this.entry = entry; 
			}
	}

	Node[] hashTable;
	int arraySize; // number of index available
	int tableSize; // number of entries----only changes with put and delete

	public HashSeparateChaining(){
		hashTable = new Node[10];
		arraySize = 10;
		tableSize = 0;
	}

	// resizing method
	private void resize() {
		
		if (size()/arraySize >= 8) {
			arraySize = 2 * arraySize;
		} else {
			arraySize = 1/2 * arraySize;
		}
		
		Node[] oldHashTable = hashTable;
		Node[] newHashTable = new Node[arraySize];
		for (int i = 0; i < oldHashTable.length; i++) {
			while (oldHashTable[i] != null) {
				int hash = hash(oldHashTable[i].entry.getKey());
				Node nextItem = oldHashTable[i].next;
				oldHashTable[i].next = newHashTable[hash];
				newHashTable[hash] = oldHashTable[i];
				oldHashTable[i] = nextItem;
			}
		}
		hashTable = newHashTable;

	}

	// Computes the index in the hash table from a given key 
	private int hash(String key) {
		int hashCode = key.hashCode();
		return (hashCode & 0x7fffffff) % arraySize;
	}

	// Returns the number of entries in the hash table.
	public int size() { return tableSize; }

	// checks whether the hash table is empty 
	public boolean isEmpty() { return tableSize == 0; }

	// Returns the node containing the given key value if it exists in the table.
	 //   Otherwise, it returns a null value. 
	private Node findEntry(String key) {
		int index = hash(key);

		Node currentNode = hashTable[index];
		while (currentNode != null && !currentNode.entry.getKey().equals(key))
			currentNode = currentNode.next;

		return currentNode;

	}

	// Returns the integer value paired with the given key, if the key is in the table.
	//	Otherwise, it returns null. 
	public Integer get(String key) {
		Node searchResult = findEntry(key);

		if (searchResult != null)
			return searchResult.entry.getValue();
		else
			return null;

	}

	// If the given key is not in the table, creates a new entry and adds it to the table.
	//	Otherwise, it updates the value associated with the given key. 
	public void put(String key, Integer value) {
		Node searchResult = findEntry(key);

		if (searchResult != null){
			searchResult.entry.setValue(value);
			return;
		}

		Entry newEntry = new Entry(key, value);
		Node newNode = new Node(newEntry);

		int index = hash(key);
		if (hashTable[index] != null) {
			newNode.next = hashTable[index];
		}
			
		hashTable[index] = newNode;
		tableSize += 1; //////////////update tableSize N wih successful addition of new Entry
		
		if (tableSize/arraySize >= 8) {
			resize();
		}

	}

	// Removes the entry containing the given key
	  // from the table, if the key exists in the table. 
	public void delete(String key) {
		Node searchResult = findEntry(key);
		if (searchResult == null)
			return;

		int index = hash(key);
		if (hashTable[index] == searchResult) {
			hashTable[index] = searchResult.next;
				tableSize--;                    /////////////////update tableSize with successful deletion
				
		} else {
			Node currentNode = hashTable[index];
			while (currentNode.next != searchResult)
				currentNode = currentNode.next;
			currentNode.next = searchResult.next;
		}
	}

	// Produces a string representation of the table. 
	@Override
	public String toString(){
		String output = "";
		for (int i = 0; i < arraySize; i++){
			output += "\n (" + i + "): ";
			Node currentNode = hashTable[i];
			if (currentNode == null)
				output += currentNode + "\n";
			else{
				while (currentNode != null){
					output += " -> " + currentNode.entry;
					currentNode = currentNode.next;
				}
				output += "\n";
			}
		}

		return output;

	}

}
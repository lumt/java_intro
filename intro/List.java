package intro;

public class List<T> {

	// pointers to first and last elements in the list
	// type element has to follow that of List
	private Element<T> first;
	private Element<T> last;

	// gets first element of list
	public T getFirst() {
		if (first == null) {
			// create object of type RunTimeException and throw it
			throw new RuntimeException();
		}
		return first.data;
	}


	// operation to add an element to the last of the list
	public void add(T value) { }

	// operation to print the linked list
	public String toString() {

		// check if empty list
		if (first == null)
			return "List is empty\n";
		
		// otherwise loop through and append a string
		Element<T> current = first;
		String res = "[ ";

		while(current.next != null) {
			res += current.data;
			current = current.next;
		}

		res += " ]";
		return res;
	}

	// all members and operations in a private class are private
	private class Element<S> {
		S 			data;
		Element<S> 	next;
	}

}
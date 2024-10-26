package main.java.stack;
public class Stack {
	private String [] elements;

	public void push(String element){
		int n;
		if (elements == null) {
			n = 0;
		} else {
			n = elements.length;
		}	

		String [] tempElements = new String[n+1];
		
		for (int i=0; i<n; i++) {
			tempElements[i] = elements[i];
		}

		tempElements[n] = element;

		elements = tempElements;
	}
	public String pop() {
		int n;
		if (elements == null) {
			return null;
		}

		n = elements.length;

		String element = elements[n-1];

		String [] tempElements = new String[n-1];
		
		for (int i=0; i<n-1; i++) {
			tempElements[i] = elements[i];
		}

		elements = tempElements; 

		return element;

	}

	public String peek(){
		if (elements == null) {
			return null;
		}
		return elements[elements.length - 1];
	}
}

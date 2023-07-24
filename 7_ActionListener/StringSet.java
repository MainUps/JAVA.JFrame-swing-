package 7_ActionListener;
//StringSet.java
public class StringSet {
	private String[] list;
	private int size;
	
	public StringSet(int n) {
		list = new String[n];
		size = 0;
	}
	public StringSet() {
		this(5);
	}
	public boolean contains(String element) {
		for(int i=0; i<size; i++) 
			if(list[i].equals(element))
				return true;
		return false;
	}
	
	private boolean isFull() {
		return list.length != size;
	}
	
	public void add(String element) {
		if(!contains(element)) {
			if(isFull()) {
				String[] newList = new String[list.length+5];
				for(int i=0; i<size; i++)
					newList[i] = list[i];
				list = newList;
			}
			list[size++] = element;
		}
	}
	public void remove(String element) {
		if(contains(element)) {
			for(int i=0; i<size; i++) {
				if(list[i].equals(element)) {
					for(int j=i; j<size; j++)
						list[j] = list[j+1];
					size--;
					return;		
	}	}	}	}
	
	public void claer() {
		size = 0;
	}
	
	public String toString() {
		String str = "{";
		for(int i=0; i<size; i++) 
			str += list[i] + (i < size - 1 ? ", " : "");
		str += "}";
		return str;
	}
	
	public boolean equals(StringSet set) {
		if(this.size == set.size) {
			for(int i=0; i<this.size; i++) {
				if(!this.contains(set.list[i]))
					return false;
			}
			return true;
		}
		return false;
}	}

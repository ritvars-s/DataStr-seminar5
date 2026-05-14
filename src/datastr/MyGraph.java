package datastr;

public class MyGraph<Ttype> {

	private MyVerticeNode<Ttype>[] verticeNodes;
	private final int DEAFAULT_SIZE = 10;
	private int size = DEAFAULT_SIZE;
	private int howManyElements = 0;
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	public MyGraph() {
		verticeNodes = new MyVerticeNode[size];
		
	}
	public MyGraph(int newSize) {
		if(newSize > 0) {
			size = newSize;
		}
		verticeNodes = new MyVerticeNode[size];
		
	}
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		return howManyElements == size;
	}
	
	private void resize() {
		int newSize = (howManyElements < 200) ? (size * 2) : (int)(size * 1.5);
		MyVerticeNode<Ttype>[] newVerticeNode = new MyVerticeNode[newSize];
		
		for(int i = 0; i < howManyElements; i++) {
			newVerticeNode[i] = verticeNodes[i];
		}
		
		verticeNodes = newVerticeNode;
		size = newSize;	
		System.gc();
		
	}
	
	public void addVertice(Ttype elem) throws Exception{
		if (elem == null) {
			throw new Exception("Ievades dati nav korekti");
		}
		int indexOfVertice = findVerticeIndex(elem);
		if(indexOfVertice != -1) {
			throw new Exception("Tada virsotne" + elem + " jau eksiste");
		}
		
		if(isFull()) {
			resize();
		}
		verticeNodes[howManyElements] = new MyVerticeNode<Ttype>(elem);
		howManyElements++;
	}
	
	private int findVerticeIndex(Ttype elem) {
		for(int i = 0; i < howManyElements; i++) {
			if(verticeNodes[i].getVerticeElement().equals(elem)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
}

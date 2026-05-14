package datastr;

public class MyVerticeNode<Ttype> {
	
	private Ttype verticeElement;
	private MyEdgeNode firstEdgeNode = null;
	
	
	public Ttype getVerticeElement() {
		return verticeElement;
	}
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	
	
	public void setVerticeElement(Ttype newVerticeElement) {
		if(newVerticeElement != null) {
			verticeElement = newVerticeElement;
		}
		else {
			verticeElement = (Ttype) new Object();
		}
		
	}
	public void setFirstEdgeNode(MyEdgeNode newFirstEdgeNode) {
		firstEdgeNode = newFirstEdgeNode;
	}
	
	public MyVerticeNode(Ttype newVerticeElement) {
		setVerticeElement(newVerticeElement);
	}
	
	public String toString() {
		String result = verticeElement + "->";
		MyEdgeNode currentEdgeNode = firstEdgeNode;
		
		while(currentEdgeNode != null) {
			result += currentEdgeNode.toString();//tostring var neizsaukt automatiski izsakusies pats
			result += "->";
			currentEdgeNode = currentEdgeNode.getNextEdge();
		}
		
		return result;
	}
	
}

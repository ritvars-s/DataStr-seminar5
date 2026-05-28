package datastr;

public class MyEdgeNode {
	private int indexToVertice;
	private float weight; //TODO var taisit ari ar citu tipu vai Ttype
	private MyEdgeNode nextEdge = null;
	
	
	public int getIndexToVertice() {
		return indexToVertice;
	}
	public float getWeight() {
		return weight;
	}
	public MyEdgeNode getNextEdge() {
		return nextEdge;
	}
	
	
	public void setIndexToVertice(int newIndexToVertice) {
		if(newIndexToVertice >= 0) {
			indexToVertice = newIndexToVertice;

		}
		else {
			indexToVertice = 0;

		}
	}
	
	public void setWeight(float newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		}
		else {
			weight = 1;
		}
		
	}
	public void setNextEdge(MyEdgeNode newNextEdge) {
		nextEdge = newNextEdge;
	}
	
	public MyEdgeNode(int newIndexToVertice, float newWeight) {
		setIndexToVertice(newIndexToVertice);
		setWeight(newWeight);
	}
	
	public String toString() {
		return "indexTo: " + indexToVertice + " ( " + weight + " )";
	}
	
	
	
}

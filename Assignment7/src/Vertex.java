import java.util.Iterator;


public class Vertex<T> implements VertexInterface<T>{
	boolean visited = false;
	String label;
	@Override
	public void visit() {
		this.visited = true;
	}

	@Override
	public void unvisit() {
		this.visited = false;
		
	}

	@Override
	public boolean isVisited() {
		if (this.visited = true) {
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean connect(VertexInterface<T> endVertex, double edgeWeight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connect(VertexInterface<T> endVertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T getLabel() {
		return (T) label;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public VertexInterface<T> getPredecessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<VertexInterface<T>> getNeighborIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Double> getWeightIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VertexInterface<T> getUnvisitedNeighbor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCost(double newCost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPredecessor(VertexInterface<T> predecessor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNeighbor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPredecessor() {
		// TODO Auto-generated method stub
		return false;
	}

}

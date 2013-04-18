import java.util.Iterator;


public interface VertexInterface<T> { 

	public void visit();  	 // mark as visited
	public void unvisit(); 
	public boolean isVisited();

	public boolean connect(VertexInterface<T> endVertex,double edgeWeight);
	public boolean connect(VertexInterface<T> endVertex); 

	public T getLabel(); 
	public double getCost(); 
	public VertexInterface<T>  getPredecessor(); 
	public Iterator<VertexInterface<T>>  getNeighborIterator(); 
	public Iterator<Double>  getWeightIterator(); 
	public VertexInterface<T> getUnvisitedNeighbor();

	public void setCost(double newCost); 
	public void setPredecessor(VertexInterface<T> predecessor); 

	public boolean hasNeighbor(); 
	public boolean hasPredecessor(); 
}



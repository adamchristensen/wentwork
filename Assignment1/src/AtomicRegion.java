
public class AtomicRegion extends Region {
	int population;
	double area;
	AtomicRegion(int population, double area){
		this.population = population;
		this.area = area;
	}
	
	int getPopulation() {
		return population;
	}

	
	double getArea() {
		return area;
	}
	public static void main(String[] args){
		AtomicRegion America;
		America = new AtomicRegion(100,1000.0);
		
	}
}

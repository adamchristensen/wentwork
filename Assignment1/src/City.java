
public class City extends AtomicRegion {
	String Mayor;
	City(int population, double area) {
		super(population, area);
	}
	public static void main(String[] args)
	{
		City Boston = new City(10000, 100.0);
		
	}

}

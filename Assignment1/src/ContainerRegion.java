
public class ContainerRegion extends Region {

	Region[] Array;
	@Override
	int getPopulation() {
		for(int i=0; i < Array.length; i++){
			System.out.println(this.getPopulation());
		}
		return 0;
	}

	@Override
	double getArea() {
		return 0;
	}
	
}

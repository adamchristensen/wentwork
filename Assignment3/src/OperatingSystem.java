import java.util.Random;
public class OperatingSystem {
private int priority;
private int time_to_execute;
private static final int time_slice = 2;
static Random random = new Random();

public static CircularArray<Job> generateJobs(int number) {
	CircularArray<Job> q = new CircularArray<Job>();
	int time;
	for(int i = 0; i<number; i++){
		time = (int) (Math.random() * 80 % 80);
		q.enqueue((Job) new Job(i+1, time, randomInteger(1,4,random)));
	}
	return q;
	
}


private static int randomInteger(int start, int end, Random aRandom) {
	if (start>end) {
		throw new IllegalArgumentException("Start cannot exceed End.");
	}
	long range = (long)end-(long)start +1;
	long fraction = (long)(range *aRandom.nextDouble());
	int randomNumber = (int) (fraction + start);
	return randomNumber;
}
public static void main (String [] args) {

	Job currentJob;
	CircularArray<Job> scheduler = generateJobs(10);
	scheduler.sort(scheduler);
	System.out.println(scheduler.toString());
	
}
}

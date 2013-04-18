
public class Job{
	int id;
	int totalTime;
	int remainingTime;
	int priority;
	Job j;
	public Job(int id, int totalTime, int priority) {
		j.id = id;
		j.totalTime = totalTime;
		j.priority = priority;
		remainingTime = totalTime;
	}
	public int getId() {
		return id;
	}
	public int getPriority() {
		return priority;
	}
	public boolean finished(int remainingTime, int timeRun) {
		remainingTime = remainingTime - timeRun;
		if (remainingTime <=0)
			return true;
		else
			return false;
	}
	/*public boolean compareTo(Job j) {
		if (j.priority>this.priority){
			return true;
		}
		else
			return false;
	}*/
	
	@Override
	public String toString() {
		return "Job [id=" + id + ", totalTime=" + totalTime
				+ ", remainingTime=" + remainingTime + ", priority=" + priority
				+ "]";
	}
	public Job getJob() {
		return j;
	}
	public void print() {
		System.out.println("Job Complete. ID:"+id+" Total Time:"+totalTime+" Priority:"+priority);
	}
	public int compareTo(Job j) {
		
		if (j.priority<this.priority)
			return 1;
		else
		return 0;
	}
	
}

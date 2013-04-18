import java.util.Arrays;

public class CircularArray<T> implements QueueInterface<T>{
private T [] queue;
private int frontIndex;
private int backIndex;
private static final int INITIAL_CAPACITY = 50;
public CircularArray() {
	this(INITIAL_CAPACITY);
}
@SuppressWarnings("unchecked")
public CircularArray(int initialCapacity) {
	queue = (T[]) new Object[initialCapacity +1];
	frontIndex = 0;
	backIndex = initialCapacity;
}
public void enqueue(T newEntry) {
	if (isArrayFull())
		doubleArray();
	backIndex = (backIndex + 1) % queue.length;
	queue[backIndex] = newEntry;
}

public T dequeue() {
	T front = null;
	if (!isEmpty()) {
		front = queue[frontIndex];
		queue[frontIndex] = null;
		frontIndex = (frontIndex+1) % queue.length;
	}
	return front;
}

public T getFront() {
	T front = null;
	if (!isEmpty())
		front = queue [frontIndex];
	return front;
}
public T getIndex(int p) {
	T Index = null;
	if (!isEmpty())
		Index = queue [p];
	return Index;
}
public int getFrontIndex() {
	return frontIndex;
}
public int getLastIndex() {
	return backIndex;
}
public int getLength() {
	return (backIndex - frontIndex)+1;
}
@SuppressWarnings("unchecked")
public void doubleArray() {
	T[] oldQueue = queue;
	int oldSize = oldQueue.length;
	queue = (T[]) new Object[2*oldSize];
	
	for (int index = 0; index<(oldSize-1); index++) {
		queue[index] = oldQueue[frontIndex];
		frontIndex = (frontIndex+1) % oldSize;
	}
	frontIndex = 0;
	backIndex = oldSize - 2;
}

public boolean isEmpty() {
	return frontIndex == ((backIndex+1)% queue.length);
}
private boolean isArrayFull() {
	return frontIndex == ((backIndex+2)%queue.length);
}
public void clear() {
	for (int index = 0; index<queue.length;index++) {
		queue[index] = null;
	}
}

@Override
public String toString() {
	return "CircularArray [queue=" + Arrays.toString(queue) + ", frontIndex="
			+ frontIndex + ", backIndex=" + backIndex + "]";
}
public CircularArray<Job> sort(CircularArray<Job> processes) {
	CircularArray<Job> sortedJobs = new CircularArray<Job>(10);
for (int i=0; i<processes.getLength();i++) {
	Job j;
	j=processes.getFront();
	if(j.compareTo(processes.getIndex(i)) != 1)
	{
		sortedJobs.enqueue(processes.dequeue());
	}
}
return sortedJobs;
}

}

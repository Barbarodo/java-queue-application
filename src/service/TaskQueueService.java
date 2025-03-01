package service;
import model.Task;
import java.util.*;


public class TaskQueueService {
	private Queue<Task> q = new LinkedList<>();
	
public void enqueue(Task task){
	q.add(task);
}
public Queue<Task> listTasks(){
	return q;
}
public Task dequeue() {
	return q.poll();
}
}

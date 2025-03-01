package app;
import model.Task;
import service.TaskQueueService;
import java.util.*;
public class QueueApp {

	public static void main(String[] args) {
	
		TaskQueueService qServ = new TaskQueueService();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 4) {
			 System.out.println("\n=== Task Queue Menu ===");
	            System.out.println("1. Add Task");
	            System.out.println("2. List Tasks");
	            System.out.println("3. Remove Task");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scan.nextInt();
	            scan.nextLine();
	            
	            switch (choice) {
	            case 1:
	            	System.out.println("Enter Task ID: ");
	            	int id = scan.nextInt();
	            	scan.nextLine();
	            	System.out.print("Enter Task Description: ");
	            	String desc = scan.nextLine();
	            	Task task = new Task(id,desc);
	            	qServ.enqueue(task);
	            	System.out.println("Task was added");
	            	break;
	            case 2: 
	            	System.out.println("Current Tasks in Queue: ");
	            	for(Task t:qServ.listTasks()) {
	            		System.out.println(t);
	            	}
	            	break;
	            case 3: 
	            	Task removedTask = qServ.dequeue();
	            	if(removedTask != null) {
	            		System.out.println("Removed Task: "+removedTask);
	            	}
	            	else {
	            		System.out.println("No tasks to be removed (empty queue)");
	            	}
	            	break;
	            case 4: System.out.println("Exciting Application");
	            break;
	            default:
	            	System.out.println("Inavlid choice, select from 1 to 4");
	            }
		}
scan.close();
	}

}

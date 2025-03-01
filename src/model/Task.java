package model;

public class Task {
private int id;
private String description;

public Task(int id, String description) {
	this.id = id;
	this.description = description;
}
public Task() { //Do I need this constructor?
	this.id = -1;
	this.description = "";
}
public int getId() {
	return id;
}
public String getDescription() {
	return description;
}
public void setId(int id) {
	this.id = id;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "The ID number is : "+id+", the description is: "+description;
}


}

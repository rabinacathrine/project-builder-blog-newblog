package model;
// Type your code
import java.time.*;
public class Blog{
	String title;
	String description;
	LocalDate postedOn;

	public String getTitle(){
		return title;
	}
public void setTitle(String title){
	this.title=title;
}

public String getDescription(){
	return description;
}
public void setDescription(String description){
this.description=description;
}

public LocalDate getPostedon(){
	return postedOn;
}
public void setPostedon(LocalDate postedOn){
this.postedOn=postedOn;
}

//public Blog(String title,int description,LocalDate postedOn){
//	
//}
public Blog(String title, String description, LocalDate date) {
	// TODO Auto-generated constructor stub
}
}
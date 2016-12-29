package entity;
import java.util.Date;

public class Project {
	private int id;
	private String name;
	private Date startDate;
	private Date endDate;
	
	public void setId(int id){
		this.id  = id;
	}
	public int getId(){return id;}
	
	public void setName(String name){
		this.name  = name;
	}
	public String getName(){return name;}
	
	public void setStartDate(Date startDate){
		this.startDate  = startDate;
	}
	public Date getStartDate(){return startDate;}
	
	public void setEndDate(Date endDate){
		this.endDate  = endDate;
	}
	public Date getEndDate(){return endDate;}
}

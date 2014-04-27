import java.util.*;
import java.text.*;


public class Project{
	
	public String name;
	public String id;
	public String owner;
	public String description;
	public ArrayList<String> status;
	public String type;
	
	public List <Activity> activityList;
	public List <Consultant> consultantList;


	public Project(String name,String type,String owner,String description){
		this.name=name;
		this.owner=owner;
		this.description=description;
		this.status = new ArrayList();
		this.status.add("Current project status: On-going");
		this.status.add("Total spent on project: $420,000");
		this.status.add("Current Duration of project: 74 days");
		this.status.add("Project projected schedule: 200 days");
		this.status.add("Project progress: 30%");
		
		this.type=type;
		this.activityList= new ArrayList();
		this.consultantList= new ArrayList();


	}

	public void addActivity(Activity newactivity){
		activityList.add(newactivity);
	}

	public void addConsultant(Consultant newconsultant){
		consultantList.add(newconsultant);
	}

	public ArrayList<String> getStatus(){
		return this.status;
	}

}
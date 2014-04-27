import java.util.*;
import java.text.*;

public class ProjectComponent{
	public String currentuser;
	public List <Project> projectList;


	public ProjectComponent(){
		this.currentuser="This is a place holder for the user system";
		this.projectList = new ArrayList();
	}	

	/**
     * Allows the user to create and add a project to the databases
     * 
     * @param  projectName, projectType
     * @return     Status String
     */
	public void addProject(String projectName,String projectType, String projectDescription){
		Project proj = new Project(projectName,projectType,this.currentuser,projectDescription);
		this.projectList.add(proj);

		//dbComponent.addProject(proj);
		// if (ACLcomponent.hasaccess(this.currentuser)) {	
		// 	return "ADDED";
		// }else {
		// 	return "REJECTED";
		// }
		
	}


	public void addActivity(String projectName,String activityName,String activityDescription){
		Activity newActivity = new Activity(activityName,activityDescription);
		Project selectedProject = this.getProject(projectName);
		selectedProject.addActivity(newActivity);

		// Project selectedProject = dbComponent.getProject(projectID);
		// selectedProject.addActivity(newActivity);


		// if (ACLcomponent.hasaccess(this.currentuser)) {
			
		// 	return "ADDED";
		// }else {
		// 	return "REJECTED";
		// }
	}

	public void addConsultant(String projectName,String consultantName, int workperiod, int salery){
		Consultant newCon = new Consultant(consultantName,workperiod,salery);
		Project selectedProject = this.getProject(projectName);
		selectedProject.addConsultant(newCon);

		
		}
	

	public ArrayList<String> getStatus(String projectName){
		return this.getProject(projectName).getStatus();
	}

	public Project getProject(String projectName){
		for (Project proj :projectList ) {
			if (proj.name==projectName) {
				return proj;
			}
		}
		return null;
	}

}



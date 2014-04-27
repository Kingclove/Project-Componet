import java.util.*;
import java.text.*;

public class Activity{
	public String activityName;
	public String description;
	public String status;
	
	public Activity(String activityName, String description){
		this.activityName=activityName;
		this.description=description;
		this.status="on-going";
	}
}
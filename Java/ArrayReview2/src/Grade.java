public class Grade {
	//The following lines set the instance variables, set to nothing due to the constructor handling set values.
	private String subject;
	private double credHours;
	private int percentGrade;
	//default values if no parameters are passed through the object instantiation.
	public Grade(){
		subject = "n/a";
		credHours = 0.0;
		percentGrade = 0;
	}
	//Sets the old variables to the new variables that will be set by the main method.
	public Grade(String newSubject, int newGrade, double newCredit){
		subject = newSubject;
		percentGrade = newGrade;
		credHours = newCredit;
	}
	//The following series of methods follows the same format for the Get/Set methods.
	//One method (Get) gets and stores the value
	//after the get stores the value the Set method comes back and sets the variable to the new variable.
	public String getSubject(){
		return subject;
	}
	public void setSubject(String newSubject){
		this.subject = newSubject;
	}
	public double getCredHours(){
		return credHours;
	}
	public void setCredHours(double newCredit){
		this.credHours = newCredit;
	}
	public int getPercentGrade(){
		return percentGrade;
	}
	public void  setPercentGrade(int newGrade){
		this.percentGrade = newGrade;
	}
}
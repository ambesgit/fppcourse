package lessonfiveone;

import java.time.LocalDate;

public class Secretary extends DepEmployee{
private double overTimeHours;

public double getOverTimeHours() {
	return overTimeHours;
}

public void setOverTimeHours(double overTimeHours) {
	this.overTimeHours = overTimeHours;
}
public double computeSalary(){
	return super.computeSalary()+(12*getOverTimeHours());
}
public Secretary(String name, LocalDate hiredDate, double salary){
	setName(name);
	setHiredDate(hiredDate);
	this.salary=salary;
	
	
}
}

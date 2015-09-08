package lessonfiveone;

import java.time.LocalDate;

public class Professor extends DepEmployee{
private int numberOfPublications;

public int getNumberOfPublications() {
	return numberOfPublications;
}

public void setNumberOfPublications(int numberOfPublications) {
	this.numberOfPublications = numberOfPublications;
}
public Professor(String name,LocalDate hiredDate,double salary){
	setName(name);
	setHiredDate(hiredDate);
	this.salary=salary;
}
}

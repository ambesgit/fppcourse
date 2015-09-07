package lessonfiveone;

import java.time.LocalDate;

public class DepEmployee {
private String name;
private LocalDate hiredDate;
protected double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getHiredDate() {
	return hiredDate;
}
public void setHiredDate(LocalDate hiredDate) {
	this.hiredDate = hiredDate;
}
public double computeSalary(){
	return salary;
}

}

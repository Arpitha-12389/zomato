package proo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hero {
@Id
private String sName;
private int sAge;
private double sPercentage;
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getsAge() {
	return sAge;
}
public void setsAge(int sAge) {
	this.sAge = sAge;
}
public double getsPercentage() {
	return sPercentage;
}
public void setsPercentage(double sPercentage) {
	this.sPercentage = sPercentage;
}

}

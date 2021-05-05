package game;

public class Player {
private long NationalityId;
private String firstName;
private String lastName;
private int year;

public Player() {
	super();
}

public Player(long nationalityId, String firstName, String lastName, int year) {
	super();
	NationalityId = nationalityId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.year = year;
}

public long getNationalityId() {
	return NationalityId;
}

public void setNationalityId(long nationalityId) {
	NationalityId = nationalityId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

}

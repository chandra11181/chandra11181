package Collections;

public class Address {
private String line1;
private String line2;
private String city;
private String state;
private String zip;
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	line1 = line1;
}
public String getLine2() {
	return line2;
}
public void setLine2(String line2) {
	line2 = line2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	zip = zip;
}
@Override
public String toString() {
	return "Address [Line1=" + line1 + ", Line2=" + line2 + ", City=" + city + ", State=" + state + ", Zip=" + zip
			+ "]";
}

}

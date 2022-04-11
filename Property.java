
public class Property {
private String propertyName;
private String city;
private double rentAmount;
private String owner;
private Plot plot;

public Property() {
	propertyName = "";
	city = "";
	rentAmount = 0;
	owner = "";
	plot = new Plot();
	
}

public Property(Property p) {
	this.propertyName = p.propertyName;
	this.city = p.city;
	this.rentAmount = p.rentAmount;
	this.owner = p.owner;
	this.plot = p.plot;
}

public Property(String propertyName, String city, double rentAmount,String owner) {
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
	this.plot = new Plot();
}

public Property(String propertyName, String city,double rentAmount,String owner,int x,int y,int width, int depth) {
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
    this.plot = new Plot(x,y,width,depth);
}

public void setPropertyName(String propertyName) {
	this.propertyName = propertyName;
}

public String getPropertyName() {
	return propertyName;
}

public void setCity(String city) {
	this.city = city;
}

public String getCity() {
	return city;
}

public Plot setPlot(int x, int y, int width, int depth){
	return new Plot(x,y,width,depth);
}

public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}

public double getRentAmount(){
 return rentAmount;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public String getOwner(){
	return owner;
}

@Override
public String toString() {
	return  "Property Name " + propertyName
	       +"Located in" + city +
	        "Belonging to: " + owner +
	        "Rent Amount " + rentAmount;
			
}

}


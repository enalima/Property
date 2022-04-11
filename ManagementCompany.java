
public class ManagementCompany {
	private String name;
	private String taxID;
	private double mgmFeePer;
	private final int MAX_PROPERTY = 5;
	private Property[] properties;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	
	public ManagementCompany() {
		name = "";
		taxID = "";
		mgmFeePer = 0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(String name,String taxID,double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(String name, String taxID,double mgmFee,int x,int y,int width,int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany){
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
		
	}
	
	
	public int addProperty(Property property) {
		int num = 0;
		for(int i = 0; i < MAX_PROPERTY; i++) {
			properties[i] = property;
			if(properties.length == MAX_PROPERTY)
			{
				num = -1;
			}
			if(properties[i] == null)
			{
				num = -2;
			}
			if(!plot.encompasses(properties[i].setPlot(0, 0, MGMT_WIDTH, MGMT_DEPTH))) {
				num = -3;
			}
			if(plot.overlaps(properties[i].setPlot(0, 0, MGMT_WIDTH, MGMT_DEPTH)))
	       {
		     num = -4;
	       }
		}
		
		
		return num;
		
	}
	
	public int addProperty(String propertyName, String city, double rent, String ownerName) {
		int num = 0;
		Property property = new Property(propertyName, city, rent, ownerName);
		for(int i = 0; i < MAX_PROPERTY; i++) {
			properties[i] = property;
			if(properties.length == MAX_PROPERTY)
			{
				num = -1;
			}
			if(!plot.encompasses(properties[i].setPlot(0, 0, MGMT_WIDTH, MGMT_DEPTH))) {
				num = -3;
			}
			if(plot.overlaps(properties[i].setPlot(0, 0, MGMT_WIDTH, MGMT_DEPTH)))
	       {
		     num = -4;
	       }
		}
		
		return num;
	}
	
	public int addProperty(String propertyName, String city, double rent, String ownerName, int x, int y, int width, int depth) {
		int num = 0;
		Property property = new Property(propertyName, city, rent, ownerName,x,y,width,depth);
		for(int i = 0; i < MAX_PROPERTY; i++) {
			properties[i] = property;
			if(properties.length == MAX_PROPERTY)
			{
				num = -1;
			}
			if(!plot.encompasses(properties[i].setPlot(x,y,width,depth))) {
				num = -3;
			}
			if(plot.overlaps(properties[i].setPlot(x,y,width,depth)))
	       {
		     num = -4;
	       }
		}		
		return num;
	}
	
	
	public double totalRent(){
		double total = 0.0;
		
		for(int i = 0; i < properties.length; i++) {
			total += properties[i].getRentAmount();
		}
		
		return total;
	}
	
	
	public double maxRentProp() {
		double max = properties[0].getRentAmount();
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i].getRentAmount() > max)
			{
				max = properties[i].getRentAmount();
			}
		}
		
		return max;
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	

	private java.lang.String displayPropertyAtIndex(int i)
	{
		String message = "";
		for(i = 0; i < properties.length; i++)
		{
			message = properties[i].toString();
		}
		return message;
	}
	
	@Override
	public String toString() {
		String message;
		
		message = "List of properties for "+ name + ",taxID: " + taxID;
		for(int i = 0; i < properties.length; i++) {
			message += properties[i].toString();
		}
		double totalMNGMFee = (totalRent()*mgmFeePer)/100;
		message += "Total Management Fee: " + totalMNGMFee;
		
		return message;
	}



}







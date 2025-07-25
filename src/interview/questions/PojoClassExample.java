package interview.questions;

public class PojoClassExample {
	
	private int id;
	private String name ;
	private String location;
	
	
	PojoClassExample()
	 {
		super();
	 }
	
	
	//Need to set and get the data via setter/getter method 
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		
		System.out.println("The id is :" + this.id);
		return this.id;
	}
	
	//Need to set and get the data via setter/getter method 
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		System.out.println("The name is :" + this.name);
		
		return this.name;
	}
	
	//Need to set and get the data via setter/getter method 
	
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	
	public String getLocation()
	
	{
		System.out.println("This is location of:" + this.location);
		return this.location;
	}
	
}
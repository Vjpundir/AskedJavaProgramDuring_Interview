package interview.questions;

public class ThisKeyword {

	    String brand;
	    String model;
	    int year;

	    // Constructor 1 - Default constructor
	    public ThisKeyword() {
	        this("Toyota", "Corolla",2023); // Calls constructor 3
	        System.out.println("Inside default constructor");
	    }

	    // Constructor 2 - With 2 parameters
	    public ThisKeyword(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        System.out.println("Inside constructor with 2 parameters");
	        System.out.println("Inside constructor with 2 parameters");
	    }
	    

	    // Constructor 3 - With 3 parameters
	    public ThisKeyword(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	        System.out.println("Inside constructor with 3 parameters");
	    }

	    public void display() {
	        System.out.println("Car Info: " + brand + " " + model + " " + year);
	    }

	    public static void main(String[] args) {
	    	ThisKeyword c1 = new ThisKeyword();                      // Calls default constructor → calls 3-param constructor
	       // c1.display();

//	        ThisKeyword c2 = new ThisKeyword("Honda", "City");       // Calls 2-param constructor
//	        c2.display();
//
//	        ThisKeyword c3 = new ThisKeyword("Hyundai", "i20", 2024); // Calls 3-param constructor directly
//	        c3.display();
	    }
	}



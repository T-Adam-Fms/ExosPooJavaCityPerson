package javaCityPerson;

//Exercice 1.7
public class City7 {
	 private String name;
	 private String country;
	 private int population;
	 private static int instanceCount = 0; // Count of city instances
	
	 public City7(String name, String country, int population) {
	     this.name = name;
	     this.country = country;
	     this.setPopulation(population);
	     instanceCount++; // Increment instance count in constructor
	 }
	 
	// Constructor with name and country (default population 0)
	    public City7(String name, String country) {
	        this(name, country, 0); // Call the other constructor
	    }

	    // Constructor with name and population (default country unknown)
	    public City7(String name, int population) {
	        this(name, "unknown", population); // Call the other constructor
	    }
	
	 public static int getInstanceCount() {
	     return instanceCount;
	 }
	
	 public String getName() {
	 	return name;
	 }
	 	
	 public String getCountry() {
	 	return country;
	 }
	 
	 public int getPopulation() {
	 	return population;
	 }
	 
	 
	 public void setPopulation (int population) {
	 	this.population = population;
	 }
	 
	 // Overriding the toString method
	 @Override
	 public String toString() {
	     return "Ville de " + name + " en " + country + " ayant " + population + " habitants.";
	 }
}

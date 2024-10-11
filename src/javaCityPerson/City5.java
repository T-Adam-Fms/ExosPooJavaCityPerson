package javaCityPerson;

//Exercice 1.5
public class City5 {
	private String name;
	private String country;
	private int population;
	
	public City5(String name, String country, int population) {
	   this.name = name;
	   this.country = country;
	   this.setPopulation(population);
	}
	
	public City5(String name, int population) {
	   this.name = name;
	   this.country = "unknown";
	   this.setPopulation(population);
	}
	
	// Getters
	public String getName() {
	   return name;
	}
	
	public String getCountry() {
	   return country;
	}
	
	public int getPopulation() {
	   return population;
	}
	
	// Setters
	public void setName(String name) {
	   if (name != null && !name.trim().isEmpty()) {
	       this.name = name;
	   } else {
	       System.out.println("City name can't be empty.");
	   }
	}
	
	public void setCountry(String country) {
	   if (country != null && !country.trim().isEmpty()) {
	       this.country = country;
	   } else {
	       System.out.println("Country can't be empty.");
	   }
	}
	
	public void setPopulation(int population) {
	   if (population >= 0) {
	       this.population = population;
	   } else {
	       System.out.println("Population can't be negative.");
	   }
	}
	
	// Method to display city details
	public void display() {
	   System.out.println("Ville de " + name + " en " + country + " ayant " + population + " habitants.");
	}
}




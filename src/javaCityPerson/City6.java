package javaCityPerson;

//Exercice 1.6
public class City6 {
	 private String name;
	 private String country;
	 private int population;
	
	 public City6(String name, String country, int population) {
	     this.name = name;
	     this.country = country;
	     this.setPopulation(population);
	 }
	
	 public City6(String name, int population) {
	     this.name = name;
	     this.country = "unknown";
	     this.setPopulation(population);
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

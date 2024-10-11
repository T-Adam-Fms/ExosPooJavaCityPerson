package javaCityPerson;

//Exercice 1.3: Test City with Constructors
	public class TestCity3 {
	public static void main(String[] args) {
	   // Create cities using both constructors
	   City3 toulouse = new City3("Toulouse", "France", 450000);
	   City3 paris = new City3("Paris", "France", 2000000);
	   City3 marseille = new City3("Marseille", 861635);
	
	   // Display the cities
	   System.out.println(toulouse);
	   System.out.println(paris);
	   System.out.println(marseille);
	
	   // Modify attributes of marseille
	   marseille.setCountry("France");
	   marseille.setPopulation(900000);
	
	   // Display marseille after modification
	   System.out.println("After modification:");
	   System.out.println(marseille);
	}
}
package javaCityPerson;

//Exercice 1.7: Count number of instances
public class TestCity7 {
		public static void main(String[] args) {
	    City7 paris = new City7("Paris", "France", 2000000);
	     City7 nice = new City7("Nice", "France", 340000);
	
	     System.out.println( "city"+ " " + paris.getName() + " " + "country" + " " + paris.getCountry() + " " + "habitants" + " " + paris.getPopulation());
	     System.out.println( "city"+ " " + nice.getName()  + " " + "habitants" + " " + nice.getPopulation());
	     
	     System.out.println("Number of instances: " + City7.getInstanceCount());
	 }
}
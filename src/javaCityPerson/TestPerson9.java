package javaCityPerson;



//Exercice 1.9 : Ajouter à votre classe Person un attribut « Ville de Naissance » qui est un 
//objet de type City de sorte d’obtenir ce qui suit: ---

public class TestPerson9 {

	public static void main(String[] args) {
		// Create instances of City
        City7 amiens = new City7("Amiens", "France", 100000); // Example population
        City7 nice = new City7("Nice", "France", 340000);
		
		Person9 manu = new Person9 ("Macron ","Emmanuel",43,"Elysee à Paris", amiens);
		//Person9 poutine = new Person9 ("Poutine", "Vladimire", 68);
		Person9 biden = new Person9("Biden", "Joe", nice);
		
		System.out.println(manu);
		//System.out.println(poutine);
		System.out.println(biden);

	}
}


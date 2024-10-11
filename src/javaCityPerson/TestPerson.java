package javaCityPerson;

//Exercice 1.8 : Crée la classe Person avec pour attributs nom, prénom, âge, adresse. Puis 
//tester la dans une classe TestPerson en créant plusieurs instances puis afficher les afin 
//d’obtenir le résultat suivant : ---

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person manu = new Person ("Macron ","Emmanuel",43,"Elysee à Paris");
		Person poutine = new Person ("Poutine", "Vladimire", 68);
		Person biden = new Person("Biden", "Joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

	}

}

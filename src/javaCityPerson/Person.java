package javaCityPerson;

//Exercice 1.8

public class Person{
		private String familyName;
		private String firstName;
		private int age;
		private String adresse;
	
	public Person(String familyName, String firstName,  int age,  String adresse) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.adresse = adresse;
	}
	
	public Person(String familyName, String firstName,  int age) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.adresse = "Unknown";
	}
	
	public Person(String familyName, String firstName) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = 0 ;
		this.adresse = "Unknown";
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setFamilyName(String familyname) {
		 this. familyName = familyName;		
	}
	
	public void setFirstName(String firstname) {
		 this. firstName = firstName;		
	}
	
	public void setAge(int Age) {
		 this. age = age;
	}
	
	public void setAdresse(String adresse) {
		 this.adresse = adresse;		
	}
	
	// Overriding the toString method
		 @Override
		 public String toString() {
		     return "Person" + " " + "[" + " " + " familyName =" + " " + familyName + ",  " + "first name =" + " " +  
		    		 firstName + ",  " + "age =" + " " + age + ",  " +  "adresse = " + adresse + " "+ "]";
		 }
}
		 


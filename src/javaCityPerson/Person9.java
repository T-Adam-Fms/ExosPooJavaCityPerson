package javaCityPerson;

// Exercice 1.9
public class Person9 {
    private String familyName;
    private String firstName;
    private int age;
    private String adresse;
    private City7 city7Instance; // Attribute referencing an instance of City7

    // Constructor to initialize all attributes
    public Person9(String familyName, String firstName, int age, String adresse, City7 city7Instance) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.age = age;
        this.adresse = adresse;
        this.city7Instance = city7Instance; // Assigning the City7 instance
    }

    // New constructor for Person9 that takes a City7 instance and sets default values for age and address
    public Person9(String familyName, String firstName, City7 city7Instance) {
        this(familyName, firstName, 0, "Unknown", city7Instance); // Default age and address
    }

    // Constructor without address
    public Person9(String familyName, String firstName, int age, String adresse) {
        this(familyName, firstName, age, adresse, null); // No City7 instance provided
    }

    // Constructor with just family and first name
    public Person9(String familyName, String firstName) {
        this(familyName, firstName, 0, "Unknown", null); // Default age and address
    }

    // Getters
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

    // Setters
    public void setFamilyName(String familyName) {
        this.familyName = familyName; // Corrected assignment
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; // Corrected assignment
    }

    public void setAge(int age) {
        this.age = age; // Corrected assignment
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse; // Corrected assignment
    }

    // Overriding the toString method
    @Override
    public String toString() {
        String cityInfo = (city7Instance != null) 
            ? " Born in " + city7Instance.getName() + ", " + city7Instance.getCountry() 
            : " Born city unknown";
        return "Person [Family Name=" + familyName + ", First Name=" + firstName + 
               ", Age=" + age + ", Address=" + adresse + "]" + cityInfo;
    }
}
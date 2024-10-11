package javaCityPerson;

public class TestCity4 {
    public static void main(String[] args) {
        // Create cities using both constructors
        City4 toulouse = new City4("Toulouse", "France", 450000);
        City4 paris = new City4("Paris", "France", 2000000);
        City4 marseille = new City4("Marseille", 861635);

        // Display city details using display method
        toulouse.display();
        paris.display();
        marseille.display();
    }
}

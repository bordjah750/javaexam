public class Person {
    // Attributs de classe
    private static int counter = 0;

    // Attributs d'instance
    private int id;
    private String name;
    private int age;
    private String gender;

    // Constructeurs
    public Person(String name, int age, String gender, String address, String email, String phoneNumber) {
        this.id = ++counter;
        this.name = this.name;
        this.age = this.age;
        this.gender = this.gender;
    }

    public Person(String firstName, String lastName) {
    }

    // Méthodes get/set
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Autres méthodes
    public String toString() {
        return String.format("ID: %d - Name: %s - Age: %d - Gender: %s", id, name, age, gender);
    }
}

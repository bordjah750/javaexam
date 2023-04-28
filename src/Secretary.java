public class Secretary extends Person {
    private int officeNumber;

    public Secretary(String name, int age, char gender, String address, int officeNumber) {
        super(name, age, gender, address, email, phoneNumber);
        this.officeNumber = officeNumber;
    }

    public Secretary(String name, int age, char gender, String address) {
        super(name, age, gender, address, email, phoneNumber);
        this.officeNumber = (int) (Math.random() * 100) + 1;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void takeNotes() {
        System.out.println("The secretary is taking notes.");
    }

    public void answerPhone() {
        System.out.println("The secretary is answering the phone.");
    }
}


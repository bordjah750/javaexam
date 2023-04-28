public class Prospect extends Person {

    private String programInterest;
    private boolean contacted;

    public Prospect(String firstName, String lastName, int age, String gender, String programInterest, boolean contacted) {
        super(name, age, gender, address, email, phoneNumber);
        this.programInterest = programInterest;
        this.contacted = contacted;
    }

    public Prospect(String firstName, String lastName) {
        super(firstName, lastName);
        this.programInterest = "";
        this.contacted = false;
    }

    public String getProgramInterest() {
        return programInterest;
    }

    public void setProgramInterest(String programInterest) {
        this.programInterest = programInterest;
    }

    public boolean isContacted() {
        return contacted;
    }

    public void setContacted(boolean contacted) {
        this.contacted = contacted;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProgram of interest: " + programInterest +
                "\nContacted: " + contacted;
    }
}

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Person> members;

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<Person>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void removeMember(Person person) {
        members.remove(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

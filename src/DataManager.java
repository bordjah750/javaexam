import java.util.ArrayList;

public class DataManager {
    private ArrayList<Group> groups;

    public DataManager() {
        this.groups = new ArrayList<Group>();
        groups.add(new Group("Etudiants"));
        groups.add(new Group("Professeurs"));
        groups.add(new Group("Prospects"));
        groups.add(new Group("Secretaires"));
    }

    public void addPersonToGroup(Person person, String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                group.addMember(person);
                break;
            }
        }
    }

    public void removePersonFromGroup(Person person, String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                group.removeMember(person);
                break;
            }
        }
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }
}

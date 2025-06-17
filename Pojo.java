public class Pojo implements Comparable {

    private int priority;
    private String description;

  
    public Pojo(int aPriority, String aDescription) {
        priority = aPriority;
        description = aDescription;
    }
    
    public String toString() {
        return description;
    }

    public int compareTo(Object otherObject) {
        Pojo other = (Pojo) otherObject;
        if (priority < other.priority) {
            return -1;
        }
        if (priority > other.priority) {
            return 1;
        }
        return 0;
    }
}

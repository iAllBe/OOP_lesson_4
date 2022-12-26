import java.util.Calendar;

public class Task {
    static Integer currentId = 1;
    private Integer id;
    private String taskName;
    private String fullName;
    private Calendar dateCreation;
    private Calendar deadLine;
    private Importance importance;

    Task(String taskName, String fullName, Integer dayToDecide, Integer importance) {
        this.taskName = taskName;
        this.fullName = fullName;
        this.dateCreation = Calendar.getInstance();
        this.deadLine = Calendar.getInstance();
        this.deadLine.add(Calendar.DAY_OF_MONTH, dayToDecide);
        this.id = currentId;
        currentId++;

        if (importance == 1) {
            this.importance = Importance.high;
        } else if (importance == 2) {
            this.importance = Importance.medium;
        } else {
            this.importance = Importance.low;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Calendar getDate() {
        return dateCreation;
    }

    public Calendar getDeadLine() {
        return deadLine;
    }

    @Override
    public String toString() {
        return "Задача №:" + id + " - "  + taskName + ", от: " + fullName + ", дата создания :" + dateCreation.getTime()
                + ", срок окончания:"
                + deadLine.getTime() + ", важность: " + importance;
    }
}
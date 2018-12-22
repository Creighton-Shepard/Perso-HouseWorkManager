import model.Person;
import model.Task;

import java.util.LinkedList;
import java.util.List;

public class Controller {

    private List<Person> personList;
    private List<Task> taskList;

    public Controller(){
        this.personList = new LinkedList<Person>();
        this.taskList = new LinkedList<Task>();
    }
}

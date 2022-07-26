import java.lang.reflect.Array;
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();

    }
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    public Person shortest(){
        if (persons.isEmpty()){
            return null;
        }
        Person returnPerson = this.persons.get(0);
        for (Person temp: persons){
            if (returnPerson.getHeight() > temp.getHeight()){
                returnPerson = temp;
            }
        }
        return returnPerson;
    }
    public Person take(){
        if (persons.isEmpty()){
            return null;
        }
        Person returnPerson = this.shortest();

        persons.remove(returnPerson);
        return returnPerson;
    }

}

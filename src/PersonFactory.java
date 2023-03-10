import java.util.ArrayList;
import java.util.Collections;

public class PersonFactory {
    private ArrayList<Person> allPersons;
    public PersonFactory() {
        allPersons = new ArrayList<>();
    }
    public void addPerson(Person person) {
        int initial = allPersons.size();

        for(int i = 0; i < allPersons.size(); i++){
            String str1 = person.getLastName();
            String str2 = allPersons.get(i).getLastName();
            if(str2.compareTo(str1) >= 0)
                allPersons.add(i, person);
        }


        if(initial == allPersons.size())
            allPersons.add(person);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> ageunder18listofPeople = new ArrayList<>();

        for (Person person: allPersons){
            if(person.getAge() < 18)
                ageunder18listofPeople.add(person);
        }
        return ageunder18listofPeople;
    }



    public boolean checkLastName(String lastName) {
        for(Person person: allPersons){
            if (person.getLastName().equals(lastName))
                return true;
        }
        return false;

    }
}
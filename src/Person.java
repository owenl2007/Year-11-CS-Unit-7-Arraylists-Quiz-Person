public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String FirstNameSetter, String LastNameSetter, int AgeSetter){
        firstName = FirstNameSetter;
        lastName = LastNameSetter;
        age = AgeSetter;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        String returnInfo = "First name: " + firstName + ", Last name:" + lastName + ", Age: " + age;
        return returnInfo;
    }
}
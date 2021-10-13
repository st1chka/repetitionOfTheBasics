package Repetition.Lesson1.Task1;

public abstract class PersonBuilder {
    Person person;

    void createPerson(){
        person = new Person();
    }

    abstract void buildFirstName();
    abstract void buildLastName ();
    abstract void buildMiddleName();
    abstract void buildCountry();
    abstract void buildAddress();
    abstract void buildPhone();
    abstract void buildAge();
    abstract void buildGender();

    Person getPerson(){
        return person;
    }
}

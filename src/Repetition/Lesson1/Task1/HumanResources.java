package Repetition.Lesson1.Task1;

public class HumanResources {
    PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder personBuilder){
        this.personBuilder= personBuilder;
    }
    Person builderPerson(){
        personBuilder.createPerson();
        personBuilder.buildFirstName();
        personBuilder.buildMiddleName();
        personBuilder.buildLastName();
        personBuilder.buildCountry();
        personBuilder.buildAddress();
        personBuilder.buildPhone();
        personBuilder.buildAge();
        personBuilder.buildGender();

        return personBuilder.getPerson();
    }
}

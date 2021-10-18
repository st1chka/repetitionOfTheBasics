package Repetition.Lesson1.Task1;

public class Main {

    public static void main(String[] args) {
	HumanResources hr = new HumanResources();

    hr.setPersonBuilder(new PersonCreate());
    Person person = hr.builderPerson();

        System.out.println(person);

    }
}

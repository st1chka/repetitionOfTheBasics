package Repetition.Lesson1.Task1;

public class PersonCreate extends PersonBuilder{

    @Override
    void buildFirstName() {
        person.setFirstName("Вася");
    }

    @Override
    void buildLastName() {
        person.setLastName("Иванов");
    }

    @Override
    void buildMiddleName() {
        person.setMiddleName("Иванович");
    }

    @Override
    void buildCountry() {
        person.setCountry("Россия");
    }

    @Override
    void buildAddress() {
        person.setAddress("Г.Новосибирск");
    }

    @Override
    void buildPhone() {
        person.setPhone("895123");
    }

    @Override
    void buildAge() {
        person.setAge(25);
    }

    @Override
    void buildGender() {
        person.setGender("Муж");
    }
}

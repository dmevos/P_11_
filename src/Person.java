import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname = personBuilder.surname;
        age = personBuilder.age;
        address= personBuilder.address;
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(surname);
        personBuilder.setAddress(address);
        return personBuilder;

    }
    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) return OptionalInt.of(age);
        else return OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("Персона: " + name + " " + surname);
        if (this.hasAge()) sb.append(", возраст ").append(age);
        if (this.hasAddress()) sb.append(", проживает в ").append(address);
        return sb.toString();
    }
}

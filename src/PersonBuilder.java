public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) throw new IllegalStateException("Человек не может быть без имени");
        if (surname == null) throw new IllegalStateException("Человек не может быть без фамилии");
        if (age <= -2 || age == 0 || age > 100)
            throw new IllegalArgumentException("Чето-то с возрастом человека не то...");
        return new Person(this);
    }
}
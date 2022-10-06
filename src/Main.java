public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        Person personA = new PersonBuilder().setName("Anna").setSurname("Bokova").build();
        Person personB = new PersonBuilder().setName("Boris").setSurname("Godunov").setAge(23).build();
        Person personC = new PersonBuilder().setName("Denis").setSurname("Krylov").setAddress("Paris").build();
        Person personD = new PersonBuilder().setName("Boris").setSurname("Godunov").setAge(25).setAddress("Moscow").build();
        System.out.println(personA);
        System.out.println(personB);
        System.out.println(personC);
        System.out.println(personD);

        personB.happyBirthday();
        System.out.println(personB);
        personA.happyBirthday();
        System.out.println(personA);
        try {
            Person personE = new PersonBuilder().setSurname("Oba-na").setAge(30).build();
        }catch (Exception ex){
            System.out.println("Создать персону не удалось: "+ex.getMessage());
        }
*/

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println("Создать персону не удалось: " + e.getMessage());
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setName("Сергей")
                    .setSurname("Жуков")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Создать персону не удалось: " + e.getMessage());
        }

    }
}
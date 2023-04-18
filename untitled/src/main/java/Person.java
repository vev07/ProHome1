
public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Iryna");
        Person person1 = new Person("Yevhen",39);

        move(person);
        move(person1);
        talk(person);
        talk(person1);

    }

    public static void move(Person person) {
        System.out.println(person.getFullName() + " is moving");
    }
    public static void talk(Person person) {
        System.out.println(person.getFullName() + " is talking");
    }
}

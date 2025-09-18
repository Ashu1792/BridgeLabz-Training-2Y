package Level1;

public class PersonDemo {
    static class Person {
        String name;
        int age;

        // Parameterized constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        void display() {
            System.out.println("Person: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person original = new Person("SHIVAM", 28);
        Person clone = new Person(original);
        original.display();
        clone.display();
    }
}
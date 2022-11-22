import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("123123");

        Person person1 = new Person("OK");



        Person person2 = new Person("OH");
        Person person3 = new Person("KO");
        Person person4 = new Person("AB");
        Person person5 = new Person("AC");
        Person person6 = new Person("BC");


        List<Person> list = Arrays.asList(person1, person2,person3,person4,person5,person6);

        List<Person> list2 = list.stream().sorted(Comparator.comparing(person -> person.name, Comparator.reverseOrder())).toList();
        for(Person person: list2){
            System.out.println(person.name);
        }
    }
}

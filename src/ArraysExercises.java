import java.util.Arrays;

public class ArraysExercises {
    public static void main (String[] args){
        Person[] peoples = new Person[3];
        peoples[0] = new Person("Charlie");;
        peoples[1] = new Person("Hung");
        peoples[2] = new Person("Delgado");

        peoples = addPerson(peoples, new Person("NewMe"));

        for(Person people : peoples){
            System.out.println(people.getName());
        }
    }

    public static Person[] addPerson (Person[] peoplesArr, Person people){
        Person[] copyOfPerson = Arrays.copyOf(peoplesArr, peoplesArr.length + 1);

        copyOfPerson[copyOfPerson.length - 1] = people;
        return copyOfPerson;
    }
}

import java.util.*;

public class ArraysExercises {

    //to add a person
//        public static Person[] addPerson(Person[] people, Person newperson){
//            people = Arrays.copyOf(people, people.length + 1);
//            people[people.length - 1] = newperson;
//            return people;
//        }

        public static Person[] addPerson(Person[] people, Person person){
            Person[] oneMorePerson = Arrays.copyOf(people, people.length + 1);
            oneMorePerson[oneMorePerson.length - 1] = person;
            return oneMorePerson;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person dean = new Person("Dean");
        Person sam = new Person("Sam");
        Person cas = new Person("Cas");

        Person[] people = new Person[3];
        people[0] = dean;
        people[1] = sam;
        people[2] = cas;

//        iterating through array v1
//        for(int i = 0; i < people.length; i++){
//            System.out.println(people[i]);
//        }

        //iterating through array v2
        for (Person peeps : people) {
            System.out.println(peeps.getName());
        }

        //adding jack to a new copy of people
        Person[] copyPeople = addPerson(people, new Person("Jack"));
        for(Person newPeeps : copyPeople){
            System.out.println(newPeeps.getName());
        }

    }

}

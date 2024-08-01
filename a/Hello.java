package HML_projects.a;

public class Hello { //Outside classes cannot be static
    public static void main(String[] args) { //Main method of a class is static because it is designed to be used even when no object of that cass has been created
        Person john =   new Person(18);
        Person tomi =   new Person("tomi",21);

        changeName(tomi);

        System.out.println(tomi.name);
        System.out.println(Person.population); //when accessing a static property you need to also use the Class name, not object reference

    }


    private static void changeName(Person a){ //Any method you want to call in the main method must also be static
        System.out.println(a.name);
        a.name = "Tola";
        System.out.println(a.name);

    }

    public static class Person{
        String name;
        int age;
        static long population;
        //we use static keyword for properties that are object independent

        Person(String name, int age){
            this.name = name;
            this.age = age;
            Person.population += 1; //this adds one to the property when a human is created
                                   //The change is done to the entire class 'Person'
        }

        Person(int age){
            this.age = age;
            this.name = "John Do";
            Person.population += 1;
        }

        static { //the static block of a class runs only once i.e when the class is first loaded
           System.out.println("I run only once");
        }
    }
}

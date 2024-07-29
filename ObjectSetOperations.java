import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Person
{
    String name;
    int age;


    public Person()
    {

    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Name:"+name+"\nAge:"+age;
    }
}

class People
{
    Set<Person>people=new HashSet<>();

    public void addPerson(Person person)
    {
        people.add(person);
    }

    public boolean find(Person person)
    {
        for(Person i:people)
        {
            if(person.hashCode()==i.hashCode())
                return true;
        }
        return false;
    }
}

public class ObjectSetOperations
{

    public static void main(String [] args)
    {
        People people=new People();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add person\n2.Search for person\n3.Exit");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    Person person=new Person();
                    System.out.println("Enter the details:");
                    System.out.println("Name:");
                    scanner.nextLine();
                    person.setName(scanner.nextLine());
                    System.out.println("Age:");
                    person.setAge(scanner.nextInt());
                    people.addPerson(person);
                    System.out.println(people);
                    break;
                case 2:
                    System.out.println("Enter the details of person to be searched:");
                    System.out.println("Enter the details:");
                    System.out.println("Name:");
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    System.out.println("Age:");
                    int age=scanner.nextInt();
                    Person person1=new Person();
                    person1.setName(name);
                    person1.setAge(age);
                    if(people.find(person1))
                        System.out.println("Person present!");
                    else
                        System.out.println("Not present!");
                    break;
                case 3:
                    System.out.println("Exiting!");
                    break;

            }
        }while (choice!=3);


    }
}

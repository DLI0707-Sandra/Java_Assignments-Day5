package mappractice.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook
{
    public static void main(String[] args)
    {
        Map<String,Long> phonebook=new HashMap<>();
        int choice;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("1.Enter\n2.Remove\n3.Search\n4.Exit");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the name:");
                    String name= scanner.next();
                    System.out.println("Enter phone number:");
                    long phonenumber=scanner.nextLong();
                    phonebook.put(name,phonenumber);
                    break;
                case 2:
                    System.out.println("Enter the name:");
                    String delete_name= scanner.next();
                    phonebook.remove(delete_name);
                    break;
                case 3:
                    System.out.println("Enter the name:");
                    String search_name=scanner.next();
                    for(Map.Entry<String,Long>iterator:phonebook.entrySet())
                    {
                        if(search_name.equals(iterator.getKey()))
                            System.out.println("Phone number is :"+iterator.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Exiting!");
                    break;
            }
        }while(choice!=4);
        System.out.println("Final phonebook:");
        System.out.println(phonebook);
    }
}

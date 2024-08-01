package policymanagementsystem.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class PolicyManagement {

    public static void main(String[] args) throws ParseException {
        Policies policies = new Policies();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new policy\n2.Remove policies\n3.Get all unique policies\n4.Policies expiring soon\n5.Get policies by coverage\n6.Policies with same number\n7.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter policy details:");
                    System.out.println("Policy number:");
                    String policyNumber = scanner.next();
                    System.out.println("Policy holder name:");
                    scanner.nextLine();
                    String policyHolder = scanner.nextLine();
                    System.out.println("Type:");
                    String policyType = scanner.next();
                    System.out.println("Expiry date(yyyy-mm-dd):");
                    scanner.nextLine();
                    String date=scanner.nextLine();
                    LocalDate expiry_date= LocalDate.parse(date);
                    System.out.println("Coverage:");
                    long policyCoverage = scanner.nextLong();
                    Policy policy = new Policy(policyNumber, policyHolder, policyType,expiry_date, policyCoverage);
                    policies.addPolicy(policy);
                    break;
                case 2:
                    System.out.println("Enter thr policy number :");
                    String policynumber = scanner.next();
                    policies.removePolicy(policynumber);
                    break;
                case 3:
                    System.out.println("Unique policies:");
                    System.out.println(policies.unique_policies);
                case 4:
                    System.out.println("Policies expiring within 30 days:");
                    policies.expiringSoon();
                    break;
                case 5:
                    System.out.println("Enter the coverage:");
                    policies.viewbyCoverage(scanner.nextLong());
                    System.out.println("Policies are listed below:");
                    break;
                case 6:
                    System.out.println("Enter the policy number:");
                    String number=scanner.next();
                    System.out.println("Policies with number:"+number);
                    policies.getByNumber(number);
                    break;
                case 7:
                    System.out.println("Exiting!");
                    break;
            }

        } while (choice != 7);

    }

}

package policymanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PolicyManagement
{
    public static void main(String[] args) throws ParseException {
        Policies policies = new Policies();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        int choice;
        do {
            System.out.println("1.Add new policy\n2.Remove policies\n3.Get policy by number\n4.Policies expiring soon\n5.Get policies by name\n6.Remove expired\n7.Exit");
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
                    Date expiry_date=null;
                    expiry_date=dateFormat.parse(date);
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
                case 3:System.out.println("Enter thr policy number :");
                    String policy_number = scanner.next();
                    System.out.println(policies.findPolicybyNumber(policy_number));
                    break;
                case 4:
                    System.out.println("Policies expiring within 30 days:");
                    policies.expiringSoon();
                    break;
                case 5:
                    System.out.println("Enter the policy holder name:");
                    policies.getByName(scanner.next());
                    System.out.println("Policies are listed below:");
                    break;
                case 6:
                    policies.removeexpiredPolicy();
                    break;
                case 7:
                    System.out.println("Exiting!");
                    break;
            }

        } while (choice != 7);

    }

}

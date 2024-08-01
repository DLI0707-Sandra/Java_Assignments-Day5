package policymanagementsystem.com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Policies
{
    ArrayList<Policy>policies=new ArrayList<>();
    Set<Policy>unique_policies=new HashSet<>();
    public void addPolicy(Policy policy)
    {
        policies.add(policy);
        unique_policies.add(policy);
    }

    public void removePolicy(String policyNumber)
    {
        for(int i=0;i<policies.size();i++)
        {
            if(policies.get(i).policynumber.equals(policyNumber))
                policies.remove(i);
        }
    }

    public Policy findPolicy(String policyNumber)
    {
        for(int i=0;i<policies.size();i++)
        {
            if(policies.get(i).policynumber.equals(policyNumber))
                return policies.get(i);
        }
        return null;
    }

    public void expiringSoon()
    {
            Set<Policy>expiring=new HashSet<>();
            LocalDate today = LocalDate.now();
//        System.out.println(today);
            LocalDate thirtyDaysFromNow = today.plusDays(30);

//        System.out.println(thirtyDaysFromNow);
            for (Policy policy : policies) {
                LocalDate expiryDate = policy.getExpiry_date();
//            System.out.println(expiryDate);
                if (!expiryDate.isBefore(today) && !expiryDate.isAfter(thirtyDaysFromNow)) {
                    expiring.add(policy);
                }
            }
            System.out.println(expiring);


    }

    public void viewAll()
    {
        for (int i=0;i<policies.size();i++)
        {
            System.out.println(policies.get(i));
        }
    }

    public void viewbyCoverage(long coverage)
    {
        for (int i=0;i<policies.size();i++)
        {
            if (policies.get(i).amount==coverage)
                System.out.println(policies.get(i));
        }
    }

    public void getByNumber(String number)
    {
        for (int i=0;i<policies.size();i++)
        {
            if (policies.get(i).policynumber.equals(number))
                System.out.println(policies.get(i));
        }
    }

    public void viewbyType(String Type)
    {
        for (int i=0;i<policies.size();i++)
        {
            if(policies.get(i).type.equals(Type))
                System.out.println(policies.get(i));
        }
    }
}

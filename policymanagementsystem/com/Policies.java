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
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        dateFormat.format(today);
        System.out.println(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thirtyDaysFromNow = calendar.getTime();
        dateFormat.format(thirtyDaysFromNow);
        System.out.println(thirtyDaysFromNow);
        for (Policy policy : policies) {
            Date expiryDate = policy.getExpiry_date();
            dateFormat.format(expiryDate);
            System.out.println(expiryDate);
            if (!expiryDate.before(today) && !expiryDate.after(thirtyDaysFromNow)) {
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

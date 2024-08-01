package policymanagement;

import java.text.SimpleDateFormat;
import java.util.*;

public class Policies
{
    ArrayList<Policy> policies=new ArrayList<>();
    Set<Policy> unique_policies=new HashSet<>();
    Map<String ,Policy>policyMap=new HashMap<>();
    Map<String,Policy>policyLinkedMap=new LinkedHashMap<>();
    Map<Date ,Policy>policyTreeMap=new TreeMap<>();
    public void addPolicy(Policy policy)
    {
        policies.add(policy);
        unique_policies.add(policy);
        policyMap.put(policy.policynumber,policy);
        policyLinkedMap.put(policy.policynumber,policy);
        policyTreeMap.put(policy.expiry_date,policy);
    }
    public void removePolicy(String policynumber) {
        for (int i = 0; i < policies.size(); i++)
        {
            if(policies.get(i).policynumber.equals(policynumber))
                policies.remove(policies.get(i));
        }
    }
    public void removeexpiredPolicy()
    {
        for(int i=0;i<policies.size();i++)
        {
            Calendar calendar = Calendar.getInstance();
            Date today = calendar.getTime();
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
            dateFormat.format(today);
            System.out.println(today);
            for (Policy policy : policies) {
                Date expiryDate = policy.getExpiry_date();
                dateFormat.format(expiryDate);
                System.out.println(expiryDate);
                if (expiryDate.before(today)) {
                    policies.remove(policy);
                    policyMap.remove(policy.policynumber);
                    policyLinkedMap.remove(policy.policynumber);
                    policyTreeMap.remove(policy.expiry_date);
                }
            }

        }
    }

    public Policy findPolicybyNumber(String policyNumber)
    {
        return policyMap.get(policyNumber);
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

    public void getByName(String name)
    {
        for (int i=0;i<policies.size();i++)
        {
            if (policies.get(i).policyholder.equals(name))
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

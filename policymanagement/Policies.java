package policymanagement;


import java.time.LocalDate;
import java.util.*;

public class Policies
{
    ArrayList<Policy> policies=new ArrayList<>();
    Set<Policy> unique_policies=new HashSet<>();
    Map<String ,Policy>policyMap=new HashMap<>();
    Map<String,Policy>policyLinkedMap=new LinkedHashMap<>();
    Map<LocalDate ,Policy>policyTreeMap=new TreeMap<>();
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

//    public static LocalDate getLocalDateFromDate(LocalDate date) {
//        return date.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//    }
    public void removeexpiredPolicy()
    {
        for(int i=0;i<policies.size();i++)
        {
            LocalDate today=LocalDate.now();
            System.out.println(today);
            for (Policy policy : policies) {
                LocalDate expiryDate = policy.getExpiry_date();
                System.out.println(expiryDate);
                if (expiryDate.isBefore(today)) {
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
        for(Map.Entry<LocalDate,Policy>iterator:policyTreeMap.entrySet())
        {
            LocalDate today = LocalDate.now();
            LocalDate thirtyDaysFromNow = today.plusDays(30);
            if(iterator.getKey().isAfter(thirtyDaysFromNow))
            {
                break;
            }
            if((iterator.getKey().isAfter(today)||iterator.getKey().equals(today))&&(iterator.getKey().isBefore(thirtyDaysFromNow)||iterator.getKey().equals(thirtyDaysFromNow)))
                System.out.println(iterator.getValue());
        }
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

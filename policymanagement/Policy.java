package policymanagement;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Policy
{
    String policynumber;
    String policyholder;
    LocalDate expiry_date;
    String type;
    long amount;

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Policy(String policynumber, String policyholder, String type,LocalDate expiry_date, long coverage)
    {
        this.policynumber=policynumber;
        this.policyholder=policyholder;
        this.expiry_date=expiry_date;
        this.type=type;
        this.amount =coverage;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Policy Number:"+policynumber+"\nPolicy holder name:"+policyholder+"\nExpiry Date:"+expiry_date+"\nType:"+type+"\nPremium amount:"+ amount;
    }
}

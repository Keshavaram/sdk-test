package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;

public class Customer {
    public String first_name;
    public String last_name;
    public String emailId;
    public String facebookId;
    public String primaryPhoneNumber;
    public String customerCreatedStoreName;
    public String customerPrimaryNumber;
    public String customerIsdCode;
    public String customerCreatedAt;//TODO Review the format

    public String CustomerReferralCode;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Customer() {
        this.customerCreatedAt = Instant.now().toString();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getCustomerCreatedStoreName() {
        return customerCreatedStoreName;
    }

    public void setCustomerCreatedStoreName(String customerCreatedStoreName) {
        this.customerCreatedStoreName = customerCreatedStoreName;
    }

    public String getCustomerPrimaryNumber() {
        return customerPrimaryNumber;
    }

    public void setCustomerPrimaryNumber(String customerPrimaryNumber) {
        this.customerPrimaryNumber = customerPrimaryNumber;
    }

    public String getCustomerIsdCode() {
        return customerIsdCode;
    }

    public void setCustomerIsdCode(String customerIsdCode) {
        this.customerIsdCode = customerIsdCode;
    }

    public String getCustomerCreatedAt() {
        return customerCreatedAt;
    }

    public String getCustomerReferralCode() {
        return CustomerReferralCode;
    }

    public void setCustomerReferralCode(String customerReferralCode) {
        CustomerReferralCode = customerReferralCode;
    }
}

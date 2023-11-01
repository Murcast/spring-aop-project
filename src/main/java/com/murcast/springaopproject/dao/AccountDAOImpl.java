package com.murcast.springaopproject.dao;

import com.murcast.springaopproject.dto.DataToPass;
import com.murcast.springaopproject.entity.Account;
import com.murcast.springaopproject.entity.SubAccount;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String serviceField;

    @Override
    public String getServiceField() {
        System.out.println(getClass() + ": get serviceField value");
        return serviceField;
    }

    @Override
    public void setServiceField(String serviceField) {
        System.out.println(getClass() + ": set serviceField value: " + serviceField);
        this.serviceField = serviceField;
    }

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT AS A PARAMETER");
    }
    @Override
    public void addObject(Object obj) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN OBJECT AS A PARAMETER");
    }
    @Override
    public void addSubAccount(SubAccount subAccount) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN SUBACCOUNT AS A PARAMETER");
    }

    @Override
    public void methodWithTwoParameters(String name, DataToPass data) {
        System.out.printf("%s: name - %s, data - %s", getClass(), name, data);
    }
}

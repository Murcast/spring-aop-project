package com.murcast.springaopproject.dao;

import com.murcast.springaopproject.dto.DataToPass;
import com.murcast.springaopproject.entity.Account;
import com.murcast.springaopproject.entity.SubAccount;

import java.util.List;

public interface AccountDAO {

    String getServiceField();

    void setServiceField(String serviceField);

    void addAccount();

    void addAccount(Account account);

    void addObject(Object obj);

    void addSubAccount(SubAccount subAccount);

    void methodWithTwoParameters(String name, DataToPass data);

    List<Account> findAccounts();
}

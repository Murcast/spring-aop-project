package com.murcast.springaopproject;

import com.murcast.springaopproject.dao.AccountDAO;
import com.murcast.springaopproject.dao.MembershipDAO;
import com.murcast.springaopproject.dto.DataToPass;
import com.murcast.springaopproject.entity.Account;
import com.murcast.springaopproject.entity.SubAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		return runner -> {
			demoTheBeforeAdvice(accountDAO);
			demoTheMembershipAdvise(membershipDAO);
			accountDAO.addAccount(new Account("knowname"));
			accountDAO.addObject(new Object());
			accountDAO.addSubAccount(new SubAccount());
			accountDAO.setServiceField("default value");
			accountDAO.getServiceField();
			accountDAO.methodWithTwoParameters("elegant name", new DataToPass("data title", 42));
			accountDAO.findAccounts();
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}

	private void demoTheMembershipAdvise(MembershipDAO membershipDAO) {
		membershipDAO.addAccount();
	}
}

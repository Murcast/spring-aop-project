package com.murcast.springaopproject;

import com.murcast.springaopproject.dao.AccountDAO;
import com.murcast.springaopproject.dao.MembershipDAO;
import com.murcast.springaopproject.dto.DataToPass;
import com.murcast.springaopproject.entity.Account;
import com.murcast.springaopproject.entity.SubAccount;
import com.murcast.springaopproject.service.TrafficFortuneService;
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
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO, TrafficFortuneService tfs) {
		return runner -> {
//			demoTheBeforeAdvice(accountDAO);
//			demoTheMembershipAdvise(membershipDAO);
//			accountDAO.addAccount(new Account("knowname"));
//			accountDAO.addObject(new Object());
//			accountDAO.addSubAccount(new SubAccount());
//			accountDAO.setServiceField("default value");
//			accountDAO.getServiceField();
//			accountDAO.methodWithTwoParameters("elegant name", new DataToPass("data title", 42));
//			accountDAO.findAccounts();
//			try {
//				accountDAO.findAccounts(null);
//			} catch (Exception e) {
//				System.out.println("we are fine");
//			}
			System.out.println(tfs.getFortune(false));
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}

	private void demoTheMembershipAdvise(MembershipDAO membershipDAO) {
		membershipDAO.addAccount();
	}
}

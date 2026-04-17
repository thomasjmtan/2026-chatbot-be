package com.tartlief.chatbot;

import com.tartlief.chatbot.dto.account.AccountDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@SpringBootApplication
public class ChatbotApplication {

	public static void main(String[] args) {
        SpringApplication.run(ChatbotApplication.class, args);
        String id = "1";
        String username = "tartlief";
        String password = "12345";
        AccountDto newAccount = new AccountDto(id, username, password);
	}

}

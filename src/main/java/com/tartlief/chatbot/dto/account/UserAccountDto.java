package com.tartlief.chatbot.dto.account;

import java.time.OffsetDateTime;

public class UserAccountDto extends AccountDto{
    private String email;
    private OffsetDateTime dob;

    public UserAccountDto(AccountDto account, String newEmail, OffsetDateTime newDob) {
        super(account);
        this.email = newEmail;
        this.dob = newDob;
    }
}

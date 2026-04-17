package com.tartlief.chatbot.dto.account;

public class AccountDto {
    private String id;
    private String username;
    private String password;

    public AccountDto(AccountDto otherAcc) {
        this.id = otherAcc.id;
        this.username = otherAcc.username;
        this.password = otherAcc.password;
    }

    public AccountDto(String newId, String newUsername, String newPassword) {
        this.id = newId;
        this.username = newUsername;
        this.password = newPassword;
    }
}

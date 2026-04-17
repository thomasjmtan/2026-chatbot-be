package com.tartlief.chatbot.dto.account;

import java.time.OffsetDateTime;

public class AdminAccountDto extends AccountDto{
    private String staffId;
    private boolean isDisabled;

    public AdminAccountDto(AccountDto account, String newStaffId, boolean isDisabled) {
        super(account);
        this.staffId = newStaffId;
        this.isDisabled = isDisabled;
    }
}

package com.balance.service;

import com.balance.dto.BalanceDto;

import java.util.UUID;

public interface BalanceService {

    BalanceDto getBalance(UUID uuid);

}

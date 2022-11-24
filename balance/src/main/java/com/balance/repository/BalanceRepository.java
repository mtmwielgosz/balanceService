package com.balance.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BalanceRepository {

    private static Map<UUID, BigDecimal> uuidBalanceMap = new HashMap<>();

    public BalanceRepository() {
        uuidBalanceMap.put(UUID.randomUUID(), BigDecimal.valueOf(100));
        uuidBalanceMap.put(UUID.randomUUID(), BigDecimal.valueOf(200));
        uuidBalanceMap.put(UUID.randomUUID(), BigDecimal.valueOf(300));
        uuidBalanceMap.put(UUID.randomUUID(), BigDecimal.valueOf(400));
    }

    public BigDecimal findBalance(UUID userUUID) {
        return BigDecimal.ZERO;
    }

}

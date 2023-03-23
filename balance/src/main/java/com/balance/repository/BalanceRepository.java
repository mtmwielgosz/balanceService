package com.balance.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BalanceRepository {

    /*
        Create Rest GET Endpoint, which returns value of balance based on given user's UUID.
        You can change / delete everything. Our source of data is Map with users UUIDs and their balances [BigDecimal].
        You can google.
     */
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

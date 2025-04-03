package com.app.inditex_prices.application;

import com.app.inditex_prices.port.out.db.DbPort;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private final DbPort dbPort;

    public PriceService(DbPort dbPort) {
        this.dbPort = dbPort;
    }

}

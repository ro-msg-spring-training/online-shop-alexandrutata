package ro.msg.learning.shop.services;

import ro.msg.learning.shop.dtos.StockResponse;

import java.util.List;

public interface StockService {
    List<StockResponse> readAllByLocationId(int locationId);
}

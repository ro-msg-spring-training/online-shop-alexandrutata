package ro.msg.learning.shop.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.dtos.StockResponse;
import ro.msg.learning.shop.services.StockService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StockApi {
    private final StockService stockService;

    @GetMapping(value = "/stock/location/{locationId}")
    public ResponseEntity<List<StockResponse>> readAllByLocationId(@PathVariable("locationId") int locationId) {
        List<StockResponse> stocks = stockService.readAllByLocationId(locationId);
        return ResponseEntity.ok(stocks);
    }
}

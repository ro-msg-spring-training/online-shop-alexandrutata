package ro.msg.learning.shop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.dtos.StockResponse;
import ro.msg.learning.shop.entities.StockEntity;
import ro.msg.learning.shop.mappers.StockMapper;
import ro.msg.learning.shop.repositories.StockRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final StockRepository repository;
    private final StockMapper mapper;

    @Override
    public List<StockResponse> readAllByLocationId(int locationId) {
        List<StockEntity> entities = repository.findAllByLocationId(locationId);
        return entities.stream().map(mapper::mapEntityToResponse).toList();
    }
}

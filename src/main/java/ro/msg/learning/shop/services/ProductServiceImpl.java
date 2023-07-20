package ro.msg.learning.shop.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.entities.ProductEntity;
import ro.msg.learning.shop.mappers.ProductEntityDtoMapper;
import ro.msg.learning.shop.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductEntityDtoMapper mapper;

    @Override
    public ProductDto readById(int id) {
        ProductEntity entity = repository.findById(id).orElseThrow();
        return mapper.mapEntityToDto(entity);
    }

    @Override
    public List<ProductDto> readAll() {
        List<ProductEntity> entities =  repository.findAll();
        return entities.stream().map(mapper::mapEntityToDto).toList();
    }

    @Override
    public int create(ProductDto product) {
        ProductEntity entity = mapper.mapDtoToEntity(product);
        entity = repository.save(entity);
        return entity.getId();
    }

    @Override
    public void update(ProductDto product) {
        if (!repository.existsById(product.getId())) {
            throw new EntityNotFoundException();
        }

        ProductEntity entity = mapper.mapDtoToEntity(product);
        repository.save(entity);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}

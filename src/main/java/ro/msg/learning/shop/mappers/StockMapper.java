package ro.msg.learning.shop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.msg.learning.shop.dtos.StockResponse;
import ro.msg.learning.shop.entities.StockEntity;

@Mapper
public interface StockMapper {
    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "locationId", source = "location.id")
    StockResponse mapEntityToResponse(StockEntity input);
}

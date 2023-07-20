package ro.msg.learning.shop.mappers;

import org.mapstruct.Mapper;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.entities.ProductEntity;

@Mapper
public interface ProductEntityDtoMapper {
    ProductDto mapEntityToDto(ProductEntity input);

    ProductEntity mapDtoToEntity(ProductDto input);
}

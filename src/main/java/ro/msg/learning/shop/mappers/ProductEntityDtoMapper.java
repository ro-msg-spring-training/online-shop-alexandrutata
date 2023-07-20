package ro.msg.learning.shop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.entities.ProductEntity;

@Mapper
public interface ProductEntityDtoMapper {
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    ProductDto mapEntityToDto(ProductEntity input);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    ProductEntity mapDtoToEntity(ProductDto input);
}

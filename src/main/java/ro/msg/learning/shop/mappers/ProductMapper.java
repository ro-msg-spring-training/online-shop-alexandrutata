package ro.msg.learning.shop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.dtos.ProductRequestDto;
import ro.msg.learning.shop.entities.ProductEntity;

@Mapper
public interface ProductMapper {
    ProductDto mapEntityToDto(ProductEntity input);

    @Mapping(target = "category.id", source = "categoryId")
    @Mapping(target = "supplier.id", source = "supplierId")
    ProductEntity mapRequestToEntity(ProductRequestDto input);
}

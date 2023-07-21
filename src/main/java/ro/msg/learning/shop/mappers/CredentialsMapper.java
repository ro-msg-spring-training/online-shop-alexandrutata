package ro.msg.learning.shop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.msg.learning.shop.models.CredentialModel;
import ro.msg.learning.shop.entities.CustomerEntity;

@Mapper
public interface CredentialsMapper {
    @Mapping(target = "authorities", ignore = true)
    CredentialModel mapEntityToModel(CustomerEntity input);
}

package ro.msg.learning.shop.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor(access=AccessLevel.PROTECTED, force=true)
public abstract class BaseDTO {
    private int id;
}

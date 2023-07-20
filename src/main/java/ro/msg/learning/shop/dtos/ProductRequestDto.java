package ro.msg.learning.shop.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class ProductRequestDto extends BaseDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("weight")
    private double weight;

    @JsonProperty("categoryId")
    private int categoryId;

    @JsonProperty("supplierId")
    private int supplierId;

    @JsonProperty("image_url")
    private String imageUrl;
}

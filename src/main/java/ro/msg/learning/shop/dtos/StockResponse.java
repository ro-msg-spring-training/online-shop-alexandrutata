package ro.msg.learning.shop.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockResponse {
    @JsonProperty("id")
    private int id;

    @JsonProperty("productId")
    private int productId;

    @JsonProperty("locationId")
    private int locationId;

    @JsonProperty("quantity")
    private int quantity;
}

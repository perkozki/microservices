package pl.szef.inventoryservice.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = PRIVATE)
public class InventoryResponse {

    String skuCode;
    boolean isInStock;
}

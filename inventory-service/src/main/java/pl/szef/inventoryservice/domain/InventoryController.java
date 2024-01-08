package pl.szef.inventoryservice.domain;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
class InventoryController {

    InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam("sku-codes") List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}

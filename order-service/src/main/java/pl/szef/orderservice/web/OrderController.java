package pl.szef.orderservice.web;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.szef.orderservice.infra.OrderService;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequestMapping("/api/order")
@FieldDefaults(makeFinal = true, level = PRIVATE)
@RequiredArgsConstructor
class OrderController {

    OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order placed successfully";
    }
}

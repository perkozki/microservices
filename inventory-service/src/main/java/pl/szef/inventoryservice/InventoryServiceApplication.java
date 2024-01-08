package pl.szef.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.szef.inventoryservice.domain.Inventory;
import pl.szef.inventoryservice.domain.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("Iphone_13");
			inventory.setQuantity(100);

			Inventory inventory3 = new Inventory();
			inventory3.setSkuCode("Iphone_14");
			inventory3.setQuantity(1000);

			Inventory inventory4 = new Inventory();
			inventory4.setSkuCode("Iphone_15");
			inventory4.setQuantity(100);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory3);
			inventoryRepository.save(inventory4);
		};
	}

}

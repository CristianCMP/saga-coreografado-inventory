package br.com.saga_choreography.inventory.core.repository;

import br.com.saga_choreography.inventory.core.model.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer> {
    List<OrderInventory> findByOrderIdAndTransactionId(String orderId, String transactionId);
    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
}

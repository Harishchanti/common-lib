package com.ailiens.optimusprime.autobots.repository;

import com.ailiens.optimusprime.domain.Slots;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Slots entity.
 */
public interface SlotsRepository extends JpaRepository<Slots,Long> {

	Slots findByConsignmentId(String consignmentId);
	List<Slots> findAllByWarehouseId(String warehouseId);
	Slots findBySlotId(int slotId);

}

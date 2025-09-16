package tech.buildrun.btgpactual.orders_ms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.btgpactual.orders_ms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity,Long> {

    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}

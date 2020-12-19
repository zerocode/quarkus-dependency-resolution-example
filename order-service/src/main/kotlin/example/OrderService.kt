package example

import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class OrderService(private val repository: OrderRepository) {

    private val logger = Logger.getLogger(OrderService::class.java)

    fun process(order: Order) {
        logger.info("Processing: $order")
        repository.save(order)
    }
}
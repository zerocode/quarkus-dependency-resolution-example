package example

import org.jboss.logging.Logger

class InMemoryOrderRepository : OrderRepository {

    private val logger = Logger.getLogger(OrderService::class.java)

    val orders = mutableListOf<Order>()

    override fun save(order: Order) {
        logger.info("Saving: $order")
        orders.add(order)
    }
}

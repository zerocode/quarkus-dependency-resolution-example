package example

import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Produces

class OrderServiceTestConfig {

    @ApplicationScoped
    @Produces
    fun orderRepository(): OrderRepository {
        return InMemoryOrderRepository()
    }
}
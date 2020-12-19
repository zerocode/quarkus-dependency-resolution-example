package example

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
class OrderServiceTest {

    @Inject
    private lateinit var service: OrderService

    @Test
    fun `injected order service with resolved repository dependency`() {
        service.process(Order("some_test_order"))
    }
}
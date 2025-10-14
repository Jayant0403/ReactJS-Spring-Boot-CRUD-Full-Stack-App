package net.javaguides.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles; // <-- correct import

@SpringBootTest
@ActiveProfiles("test")
public class SpringbootBackendApplicationTests {
    @Test
    void contextLoads() {
        // verifies the app context loads without errors
    }
}


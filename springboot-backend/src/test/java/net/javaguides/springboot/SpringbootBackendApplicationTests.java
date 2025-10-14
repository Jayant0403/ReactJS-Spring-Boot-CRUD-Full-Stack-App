package net.javaguides.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.ActiveProfiles;  // Fixed: 'Profiles' not 'Proiles'

@SpringBootTest
@ActiveProfiles("test")  // Optional: Ensures 'test' profile (e.g., for test-specific properties like H2 DB fallback)
public class SpringbootBackendApplicationTests {
    @Test
    void contextLoads() {
        // This test just verifies the app context loads without errors
    }
}

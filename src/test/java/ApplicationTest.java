//import service.org.demo.app.DatabaseService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.test.context.TestPropertySource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@TestPropertySource("classpath:test.properties")
//@SpringBootTest
//public class ApplicationTest {
////    public static void main(String[] args) {
////        SpringApplication.run(ApplicationTest.class, args);
////    }
//
//    @Autowired
//    private DatabaseService dbServer;
//    // This value from the application.properties.
//    @Test
//    public void testDatabaseName() {
//        assertEquals("mkyong", dbServer.getName());
//    }
//
//    // We expect 10 from the test.properties; the original application.properties is 5.
//    @Test
//    public void testDatabaseThreadPool() {
//        assertEquals(10, dbServer.getThreadPool());
//    }
//
//}
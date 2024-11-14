package com.example.Conditional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConditionalApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    private static GenericContainer<?> myAppDev;
    private static GenericContainer<?> myAppProd;

    @BeforeAll
    static void setUp() {
        myAppDev = new GenericContainer<>("devapp")
                .withExposedPorts(8080);
        myAppProd = new GenericContainer<>("prodapp")
                .withExposedPorts(8081);
        myAppDev.start();
        myAppProd.start();
    }

    @Test
    public void testGetEndpointStatus() {
        Integer devAppPort = myAppDev.getMappedPort(8080);
        ResponseEntity<String> responseDev = restTemplate.getForEntity("http://localhost:" + devAppPort + "/profile", String.class);
        assertEquals(200, responseDev.getStatusCodeValue());
        assertEquals("Current profile is dev", responseDev.getBody());

        Integer prodAppPort = myAppProd.getMappedPort(8081);
        ResponseEntity<String> responseProd = restTemplate.getForEntity("http://localhost:" + prodAppPort + "/profile", String.class);
        assertEquals(200, responseProd.getStatusCodeValue());
        assertEquals("Current profile is production", responseProd.getBody());
    }

    @Test
    void contextLoads() {
        Integer devAppPort = myAppDev.getMappedPort(8080);
        ResponseEntity<String> forEntityDev = restTemplate.getForEntity("http://localhost:" + devAppPort + "/profile", String.class);
        System.out.println(forEntityDev.getBody());

        Integer prodAppPort = myAppProd.getMappedPort(8081);
        ResponseEntity<String> forEntityProd = restTemplate.getForEntity("http://localhost:" + prodAppPort + "/profile", String.class);
        System.out.println(forEntityProd.getBody());
    }
}
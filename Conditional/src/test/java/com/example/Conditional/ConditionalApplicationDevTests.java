//package com.example.Conditional;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.testcontainers.containers.GenericContainer;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ActiveProfiles("devProfile")
//public class ConditionalApplicationDevTests {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private static GenericContainer<?> myAppDev;
//
//    @BeforeAll
//    static void setUp() {
//        myAppDev = new GenericContainer<>("devapp")
//                .withExposedPorts(8080);
//        myAppDev.start();
//
////    @Test
////        public void testGetEndpointStatus() {
////        System.setProperty("netology.profile.dev", "true");
////        Integer devAppPort = myAppDev.getMappedPort(8080);
////        ResponseEntity<String> responseDev = restTemplate.getForEntity("http://localhost:" + devAppPort + "/profile", String.class);
////        assertEquals(200, responseDev.getStatusCodeValue());
////        assertEquals("Current profile is dev", responseDev.getBody());
//////        ResponseEntity<String> response = restTemplate.getForEntity("/profile", String.class);
//////        assertEquals(200, response.getStatusCodeValue());
//////        assertEquals("Current profile is dev", response.getBody());
////    }
////}
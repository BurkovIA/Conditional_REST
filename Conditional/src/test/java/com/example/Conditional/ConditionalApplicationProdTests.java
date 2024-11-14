//package com.example.Conditional;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ActiveProfiles("prodProfile")
//public class ConditionalApplicationProdTests {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void testProdProfile() {
//        ResponseEntity<String> response = restTemplate.getForEntity("/profile", String.class);
//        assertEquals(200, response.getStatusCodeValue());
//        assertEquals("Current profile is production", response.getBody());
//    }
//}
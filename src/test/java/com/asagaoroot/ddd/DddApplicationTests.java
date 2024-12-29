package com.asagaoroot.ddd;

import com.asagaoroot.ddd.controller.HelloController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DddApplicationTests {

    @InjectMocks
    private HelloController helloController;

    private MockMvc mockMvc;

    private AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(helloController);
        mockMvc = MockMvcBuilders.standaloneSetup(helloController) .build();
    }

    @AfterEach
    void closeMocks() throws Exception {
        closeable.close();
    }

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("Normal pattern")
    void hello() throws Exception {

        String contentType = "text/plain;charset=ISO-8859-1";
        String requestBody = "";
        String expected = "Hello World!";

        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/hello")
                        .content(requestBody)
                        .contentType(contentType);

        String actual = mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(contentType))
                .andReturn().getResponse().getContentAsString(StandardCharsets.UTF_8);

        assertEquals(expected, actual);
    }

}

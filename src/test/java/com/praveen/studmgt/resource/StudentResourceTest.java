package com.praveen.studmgt.resource;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentResourceTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	StudentResource studentResource;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(studentResource).build();
	}

	@Test
	public void testGetStudents() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/students"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(content().string("Get all students"));
	}

}

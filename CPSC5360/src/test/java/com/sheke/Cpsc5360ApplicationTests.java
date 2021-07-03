package com.sheke;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sheke.repo.VotersRepository;

@SpringBootTest
@WebMvcTest
class Cpsc5360ApplicationTests {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	VotersRepository votersRepository;

	@Test
	void contextLoads() throws Exception{
		
		when(votersRepository.findAll()).thenReturn(
				Collections.emptyList()
				);
		
		mockMvc.perform(
				MockMvcRequestBuilders.get("voters/all")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		
		verify(votersRepository).findAll();
	}

}

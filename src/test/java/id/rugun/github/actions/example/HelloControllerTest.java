package id.rugun.github.actions.example;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class HelloControllerTest {

		@Autowired
		private MockMvc mockMvc;

		public void whenSayHello_thenHelloMessageReturned() throws Exception {

				mockMvc.perform(get("/hello"))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.message", is("Hello, world!")));
		}
}

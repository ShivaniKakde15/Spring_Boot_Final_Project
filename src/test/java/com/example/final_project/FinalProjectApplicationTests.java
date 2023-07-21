// package com.example.final_project;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;

// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import com.example.final_project.Model.User;
// import com.example.final_project.Repository.finalprojectRepo;
// import com.example.final_project.Service.finalprojectService;

// @SpringBootTest
// class FinalProjectApplicationTests {

// 	@Autowired
// 	finalprojectService serve;
	

// 	@MockBean //Will be used only for mocking purpose
//     finalprojectRepo repo;
	
// 	@Test
// 	void contextLoads() {
// 		when(repo.findAll()).thenReturn(Stream.of(new User("abc@gmail.com", 1234567890, "abc123")).collect(Collectors.toList()));
// 	    			//assertEquals(mocking rows,checking the size of the db);
// 	assertEquals(1, serve.getting().size());
// 	}

	
// }

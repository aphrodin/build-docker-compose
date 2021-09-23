package com.example.polls;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.polls.model.RoleName;
import com.example.polls.model.Role;
import com.example.polls.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PollsApplicationTests {

	@Autowired
    private RoleRepository roleRepository;

	@Test
	public void contextLoads() {
	}

	@Test
 	public void findusers() throws Exception {

		roleRepository.findByName(RoleName.ROLE_USER);


}


}

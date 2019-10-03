package com.macrosoftas.archijee;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import com.macrosoftas.archijee.repository.UserRepository;
import com.macrosoftas.archijee.model.User;
import com.macrosoftas.archijee.ArchiJEEApplication;
import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ArchiJEEApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UserRepository repository;

	@Test
	public void testExample1() throws Exception {
		
		BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		String encodepwd = bCryptPasswordEncoderLocal.encode("admin2017");
		
		String encodepwd2 = bCryptPasswordEncoderLocal.encode("admin2018");
		
		System.out.println("encodepwd "+encodepwd+" - encodepwd2"+encodepwd2);
		
		assertThat(encodepwd).isNotEqualTo(encodepwd2);
	}
	@Test
	public void testExample2() throws Exception {
		
		BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		String encodepwd = bCryptPasswordEncoderLocal.encode("admin2017");
		
		String encodepwd2 = bCryptPasswordEncoderLocal.encode("admin2017");
		
		System.out.println("encodepwd "+encodepwd+" - encodepwd2"+encodepwd2);
		
		assertThat(encodepwd).isNotEqualTo(encodepwd2);
	}
	
	
	/**
		
			@Test
			public void save_scenario_1() {
			// Given
			Comment comment = new Comment();
			comment.setComment("Test");
			comment.setType(CommentType.PLUS);
			comment.setCreatedDate(new Timestamp(System.currentTimeMillis()));

			// When
			Comment saved = commentRepository.save(comment);

			// Then
			assertThat(testEntityManager.find(Comment.class,
			saved.getId())).isEqualTo(saved);
			}
	**/

}
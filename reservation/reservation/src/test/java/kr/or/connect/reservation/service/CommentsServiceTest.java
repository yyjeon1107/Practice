package kr.or.connect.reservation.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.connect.reservation.config.ApplicationConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class CommentsServiceTest {

	@Autowired
	private CommentsService commentsService;

	@Test
	public void execute() throws Exception {
		assertNotNull("getComments(1, 1) should be not null", commentsService.getComments(1, 1));
	}
}

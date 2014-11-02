package demo.web;

import demo.dao.FeedbackDao;
import demo.domain.Feedback;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		FeedbackDao feedbackDao =
                context.getBean(FeedbackDao.class);
		
		Feedback feedback = new Feedback();
        feedback.setId(6);
		feedback.setName("From Pankaj");
        feedback.setMessage("At India");
		
		feedbackDao.save(feedback);
		
		System.out.println("Person::"+feedback);
		
		List<Feedback> list = feedbackDao.list();
		
		for(Feedback p : list){
			System.out.println("Person List::"+p);
		}
		
		context.close();
		
	}

}

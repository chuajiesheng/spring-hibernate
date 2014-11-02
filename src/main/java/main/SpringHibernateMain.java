package main;

import dao.FeedbackDao;
import model.Feedback;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		FeedbackDao personDAO =
                context.getBean(FeedbackDao.class);
		
		Feedback person = new Feedback();
        person.setId(5);
		person.setName("Pankaj");
        person.setMessage("India");
		
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		
		List<Feedback> list = personDAO.list();
		
		for(Feedback p : list){
			System.out.println("Person List::"+p);
		}
		
		context.close();
		
	}

}

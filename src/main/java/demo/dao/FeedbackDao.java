package demo.dao;

import demo.domain.Feedback;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackDao {

	public void save(Feedback p);
	public List<Feedback> list();
	
}

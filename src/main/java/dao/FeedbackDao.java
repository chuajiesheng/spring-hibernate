package dao;

import model.Feedback;

import java.util.List;

public interface FeedbackDao {

	public void save(Feedback p);
	
	public List<Feedback> list();
	
}

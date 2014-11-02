package demo.dao.impl;

import demo.dao.FeedbackDao;
import demo.domain.Feedback;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("feedbackDaoImpl")
public class FeedbackDaoImpl implements FeedbackDao {

    @Autowired
	private SessionFactory sessionFactory;

    public FeedbackDaoImpl() {
    }

    public FeedbackDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
	public void save(Feedback p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Feedback> list() {
		Session session = this.sessionFactory.openSession();
		List<Feedback> feedbackList = session.createQuery("from Feedback").list();
		session.close();
		return feedbackList;
	}

}

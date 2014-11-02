package dao.impl;

import java.util.List;

import dao.FeedbackDao;
import model.Feedback;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FeedbackDaoImpl implements FeedbackDao {

	private SessionFactory sessionFactory;

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
		List<Feedback> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

}

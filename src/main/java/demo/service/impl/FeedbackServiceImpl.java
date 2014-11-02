package demo.service.impl;

import demo.dao.FeedbackDao;
import demo.domain.Feedback;
import demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackDao feedbackDao;

    public FeedbackServiceImpl() {
    }

    @Autowired(required=true)
    public FeedbackServiceImpl(demo.dao.FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    public void setFeedbackDao(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    @Override
    public void addFeedback(Feedback feedback) {
        feedbackDao.save(feedback);
    }

    @Override
    public List<Feedback> listFeedbacks() {
        return feedbackDao.list();
    }
}

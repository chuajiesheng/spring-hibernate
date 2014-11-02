package demo.service;

import demo.domain.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService {
    public void addFeedback(Feedback feedback);
    public List<Feedback> listFeedbacks();
}

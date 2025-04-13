package com.youssef.ditask.service;

import com.youssef.ditask.model.Course;
import com.youssef.ditask.util.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseRecommenderService {

    private final CourseRecommender mainCourseRecommender;
    private CourseRecommender secondaryCourseRecommender;

    @Autowired
    public CourseService(CourseRecommender mainCourseRecommender) {
        this.mainCourseRecommender = mainCourseRecommender;
    }

    @Autowired
    public void setSecondaryCourseRecommender(
            @Qualifier("secondaryCourseRecommender") CourseRecommender secondaryCourseRecommender) {
        this.secondaryCourseRecommender = secondaryCourseRecommender;
    }


    @Override
    public List<Course> getMainRecommendedCourses() {
        return mainCourseRecommender.recommendedCourses();
    }

    @Override
    public List<Course> getSecondaryRecommendedCourses() {
        return secondaryCourseRecommender.recommendedCourses();
    }

}

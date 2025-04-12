package com.youssef.ditask.service;

import com.youssef.ditask.model.Course;
import com.youssef.ditask.util.CourseRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseRecommenderService {

    private final CourseRecommender primaryCourseRecommender;
    private CourseRecommender qualifierCourseRecommender;
    private final CourseRecommender secondaryCourseRecommender;

    @Autowired
    public CourseService(CourseRecommender courseRecommender, CourseRecommender secondaryCourseRecommender) {
        this.primaryCourseRecommender = courseRecommender;
        this.secondaryCourseRecommender = secondaryCourseRecommender;
    }

    @Autowired
    public void setPrimaryCourseRecommender(
            @Qualifier("secondaryCourseRecommender") CourseRecommender qualifierCourseRecommender) {
        this.qualifierCourseRecommender = qualifierCourseRecommender;
    }


    @Override
    public List<Course> getPrimaryRecommendedCourses() {
        return primaryCourseRecommender.recommendedCourses();
    }

    @Override
    public List<Course> getQualifierRecommendedCourses() {
        return qualifierCourseRecommender.recommendedCourses();
    }

    @Override
    public List<Course> getSecondaryRecommendedCourses() {
        return secondaryCourseRecommender.recommendedCourses();
    }
}

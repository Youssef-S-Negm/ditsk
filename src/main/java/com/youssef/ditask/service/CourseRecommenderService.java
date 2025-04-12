package com.youssef.ditask.service;

import com.youssef.ditask.model.Course;

import java.util.List;

public interface CourseRecommenderService {

    List<Course> getPrimaryRecommendedCourses();

    List<Course> getQualifierRecommendedCourses();

    List<Course> getSecondaryRecommendedCourses();

}

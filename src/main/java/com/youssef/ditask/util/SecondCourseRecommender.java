package com.youssef.ditask.util;

import com.youssef.ditask.model.Course;

import java.util.List;

public class SecondCourseRecommender implements CourseRecommender {

    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course(3, "Introduction to Kotlin"),
                new Course(4, "Introduction to AI and machine learning")
        );
    }

}

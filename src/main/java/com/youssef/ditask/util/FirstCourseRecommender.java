package com.youssef.ditask.util;

import com.youssef.ditask.model.Course;

import java.util.List;

public class FirstCourseRecommender implements CourseRecommender {

    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course(1, "Introduction to Java Programming"),
                new Course(2, "Introduction to Spring framework")
        );
    }
}

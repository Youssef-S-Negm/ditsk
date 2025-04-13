package com.youssef.ditask.controller;

import com.youssef.ditask.model.Course;
import com.youssef.ditask.service.CourseRecommenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseRecommenderService courseRecommenderService;

    @Autowired
    public CourseController(CourseRecommenderService courseRecommenderService) {
        this.courseRecommenderService = courseRecommenderService;
    }

    @GetMapping("/{qualifier}")
    public ResponseEntity<List<Course>> getCourses(@PathVariable String qualifier) {
        return switch (qualifier) {
            case "match-name" -> ResponseEntity.ok(courseRecommenderService.getMainRecommendedCourses());
            case "qualifier" -> ResponseEntity.ok(courseRecommenderService.getSecondaryRecommendedCourses());
            default -> ResponseEntity.badRequest().build();
        };
    }

}

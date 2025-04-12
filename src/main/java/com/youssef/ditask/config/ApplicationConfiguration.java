package com.youssef.ditask.config;

import com.youssef.ditask.util.CourseRecommender;
import com.youssef.ditask.util.FirstCourseRecommender;
import com.youssef.ditask.util.SecondCourseRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Primary
    public CourseRecommender mainCourseRecommender() {
        return new FirstCourseRecommender();
    }

    @Bean
    public CourseRecommender secondaryCourseRecommender() {
        return new SecondCourseRecommender();
    }
}

package com.brihaspathee.neo4j.services;

import com.brihaspathee.neo4j.models.Course;
import com.brihaspathee.neo4j.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, October 2024
 * Time: 6:06 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.services
 * To change this template use File | Settings | File and Code Template
 */
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(String identifier){
        return courseRepository.findCourseByIdentifier(identifier);
    }
}

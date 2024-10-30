package com.brihaspathee.neo4j.controllers;

import com.brihaspathee.neo4j.models.Course;
import com.brihaspathee.neo4j.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, October 2024
 * Time: 6:07 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.controllers
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/")
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Course> findById(@PathVariable String identifier) {
        Course course = courseService.getCourseById(identifier).orElseThrow(
                ()-> new ResponseStatusException(HttpStatusCode.valueOf(404))
        );
        return ResponseEntity.ok(course);
    }
}
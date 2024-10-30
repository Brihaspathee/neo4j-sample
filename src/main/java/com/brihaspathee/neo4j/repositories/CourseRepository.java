package com.brihaspathee.neo4j.repositories;

import com.brihaspathee.neo4j.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, October 2024
 * Time: 6:04 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.repositories
 * To change this template use File | Settings | File and Code Template
 */
public interface CourseRepository extends Neo4jRepository<Course, Long> {

    Optional<Course> findCourseByIdentifier(String identifier);
}

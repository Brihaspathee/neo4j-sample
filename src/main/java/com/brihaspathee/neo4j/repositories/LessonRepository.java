package com.brihaspathee.neo4j.repositories;

import com.brihaspathee.neo4j.models.Lesson;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 20, November 2024
 * Time: 5:24 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.repositories
 * To change this template use File | Settings | File and Code Template
 */
public interface LessonRepository extends Neo4jRepository<Lesson, Long> {

    @Query("MATCH(:Course{identifier: $courseId})<-[r:BELONGS_TO]-(lessons:Lesson) return lessons")
    List<Lesson> findLessonsByCourseIdentifier(String courseId);
}

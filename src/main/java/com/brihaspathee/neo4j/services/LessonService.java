package com.brihaspathee.neo4j.services;

import com.brihaspathee.neo4j.models.Lesson;
import com.brihaspathee.neo4j.repositories.LessonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 20, November 2024
 * Time: 5:29 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.services
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;

    public List<Lesson> getLessonsByCourseId(String courseId) {
        return lessonRepository.findLessonsByCourseIdentifier(courseId);
    }
}

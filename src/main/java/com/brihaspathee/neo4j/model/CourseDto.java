package com.brihaspathee.neo4j.model;

import com.brihaspathee.neo4j.models.Lesson;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 20, November 2024
 * Time: 5:31 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private String identifier;

    private String title;

    private String teacher;

    private List<Lesson> lessons;
}

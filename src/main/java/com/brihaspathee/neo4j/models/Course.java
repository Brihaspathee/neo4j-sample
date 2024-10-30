package com.brihaspathee.neo4j.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, October 2024
 * Time: 6:01 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.models
 * To change this template use File | Settings | File and Code Template
 */
@Node
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String identifier;

    private String title;

    private String teacher;

    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.INCOMING)
    private List<Lesson> lessons;
}

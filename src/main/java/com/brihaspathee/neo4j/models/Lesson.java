package com.brihaspathee.neo4j.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 30, October 2024
 * Time: 4:54 AM
 * Project: neo4j-sample
 * Package Name: com.brihaspathee.neo4j.models
 * To change this template use File | Settings | File and Code Template
 */
@Node
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String identifier;
}

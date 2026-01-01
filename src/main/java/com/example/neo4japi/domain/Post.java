package com.example.neo4japi.domain;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
public class Post {
    @Id @GeneratedValue private Long id;
    private String content;

    public Post() {}
    public Post(String content) { this.content = content; }

    public Long getId() { return id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}

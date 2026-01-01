package com.example.neo4japi.domain;

import org.springframework.data.neo4j.core.schema.*;
import java.util.ArrayList;
import java.util.List;

@Node
public class User {
    @Id @GeneratedValue private Long id;
    private String name, email;

    @Relationship(type = "KNOWS", direction = Relationship.Direction.OUTGOING)
    private List<User> friends = new ArrayList<>();

    @Relationship(type = "KNOWS", direction = Relationship.Direction.INCOMING)
    private List<User> friendsOf = new ArrayList<>();

    @Relationship(type = "POSTED_BY", direction = Relationship.Direction.OUTGOING)
    private List<Post> posts = new ArrayList<>();

    public User() {}
    public User(String name, String email) {
        this.name = name; this.email = email;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<User> getFriends() { return friends; }
    public List<User> getFriendsOf() { return friendsOf; }
    public List<Post> getPosts() { return posts; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}

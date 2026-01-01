package com.example.neo4japi.repository;

import com.example.neo4japi.domain.Post;
import com.example.neo4japi.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "users")
public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User {id: $id})-[:KNOWS*2]-(fof) WHERE NOT (u)-[:KNOWS]-(fof) RETURN fof")
    List<User> findFriendsOfFriends(Long id);

    @Query("MATCH (u:User {id: $id})-[:POSTED_BY]->(p:Post) RETURN p")
    List<Post> findPostsByUser(Long id);
}

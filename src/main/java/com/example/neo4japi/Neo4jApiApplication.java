package com.example.neo4japi;

import com.example.neo4japi.domain.User;
import com.example.neo4japi.domain.Post;
import com.example.neo4japi.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories
@SpringBootApplication
public class Neo4jApiApplication implements CommandLineRunner {

    private final UserRepository users;

    public Neo4jApiApplication(UserRepository users) { this.users = users; }

    public static void main(String[] args) {
        SpringApplication.run(Neo4jApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Graphe run ! http://localhost:7474/browser/");
    }
}

# neo4j-java-api

API Spring Boot minimale pour interagir avec une base Neo4j.

## Prérequis
- JDK 11+ installé
- Maven installé
- Neo4j en cours d'exécution (bolt) accessible localement

## Configuration
La configuration Neo4j et le chemin de base REST sont dans `src/main/resources/application.properties`. Adapter les paramètres de connexion Neo4j pour votre environnement.

## Lancer l'application
- Depuis la racine du projet :
  - `mvn spring-boot:run`
- Ou ouvrir le projet dans `IntelliJ IDEA 2025.3.1` et exécuter la classe `com.example.neo4japi.Neo4jApiApplication`

## Tests
- Exécuter les tests : `mvn test`

## Structure importante
- `pom.xml` — configuration Maven
- `src/main/java/com/example/neo4japi/domain/` — entités `User`, `Post`
- `src/main/java/com/example/neo4japi/repository/` — interfaces de repository (ex. `UserRepository`)
- `src/main/resources/application.properties` — paramètres (connexion Neo4j, base path `/api`)

## Endpoints
Le chemin de base REST est `/api` (défini dans `application.properties`).

## Remarques
- Ne pas laisser de secrets en clair en production ; utiliser des variables d'environnement ou un gestionnaire de secrets.
- Vérifier que Neo4j est accessible sur l'URI et les identifiants configurés.

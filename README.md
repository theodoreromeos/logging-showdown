# Logging Example v1.0.0

Spring boot project that demonstrates the current best
logging  technologies

## - Tech Stack

- **Java** (version 21)
- **Spring Boot** (version 3.4.2)
- **Maven** (version 3)
- **Docker**
- **Elasticsearch**
- **Logstash**
- **Kibana**

## - Scripts

Inside the project folder :

- To build the image : **docker build -t yourusername/logging-example:vX.X .**
- Push the image to your docker hub : **docker push yourusername/logging-example:vX.X**
- Modify the docker-compose file to pull from your docker hub like this :
```yaml
    log-example-app:
        image: yourusername/logging-example:vX.X
```        
- To run (testing profile as default): **docker-compose -f ./log-ex-docker-compose.yaml up -d**
- To test : **http://localhost:9090/log-ex/swagger-ui/index.html**


**Notes:**
- yourusername/logging-example = your docker hub username and repository
- vX.X = your own versioning, e.g. v1.0


## - Git and Docker Hubs

- Docker : **theodoreromeos1**
- Github : **https://github.com/theodoreromeos/logging-example.git**

## - Profiles

- local
- testing
- production

### - Contributing members

- Theodore Romeos
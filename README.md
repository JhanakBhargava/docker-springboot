# docker-springboot

--building jar
mvn clean install

--building docker image
docker build -f Dockerfile -t docker-spring-boot .

--running docker image
docker run -p 8085:8085 docker-spring-boot

--see docker images
docker images

--delete dangling images
docker image prune

--see running containers with ids
docker ps

--stop running
docker container stop container_id

--delete container 
docker rm container_id

--delete image
docker rmi imgae_id

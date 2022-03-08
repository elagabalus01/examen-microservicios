mvn spring-boot:build-image -Dmaven.test.skip=true
docker run -p 8082:8082 --network="host" -d publicaciones:0.0.1-SNAPSHOT

#mvn clean install spring-boot:repackage -Dmaven.test.skip=true

mvn clean spring-boot:build-image -Dmaven.test.skip=true
docker-compose down --remove-orphans
sudo rm -fr blockstorage
#docker system prune -a
docker container rm `docker ps -qa` 2>/dev/null

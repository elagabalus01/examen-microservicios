docker-compose down --remove-orphans

build-image(){
	cd $1
	./build-image.sh
	cd ..	
}

if [[ $1 == "-b" ]]
then
    build-image admin_usuarios
    build-image publicaciones
    build-image discovery_server
    build-image server-metrics
fi
docker-compose up --build
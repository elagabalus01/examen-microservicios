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
    build-image seguidores
    build-image comentarios
    build-image mensajes
    build-image discovery_server
    build-image server-metrics
    docker-compose up --build
else
    docker-compose up
fi

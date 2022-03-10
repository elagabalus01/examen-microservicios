build-image(){
	cd $1
	./build-image.sh
	cd ..	
}

export micro=$1
if [[ $# -lt 1 ]]
then
	echo "Ingresa el nombre del micro a ejecutar"
	exit
fi
./networkdown.sh
docker-compose down --remove-orphans

build-image $1
build-image discovery_server
build-image server-metrics

docker-compose -f single-docker-compose.yml up --build

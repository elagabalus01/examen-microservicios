docker-compose down
cd micro1
./build-image.sh
cd ..

cd publicaciones
./build-image.sh
cd ..

cd discovery_server
./build-image.sh
cd ..

docker-compose up --build
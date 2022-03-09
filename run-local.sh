docker-compose down --remove-orphans
cd admin_usuarios
./build-image.sh
cd ..

cd publicaciones
./build-image.sh
cd ..

cd discovery_server
./build-image.sh
cd ..

cd server-metrics
./build-image.sh
cd ..



docker-compose up --build
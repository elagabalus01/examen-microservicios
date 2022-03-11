#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE admin_usuarios OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE admin_usuarios TO admin;

    CREATE DATABASE publicaciones OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE publicaciones TO admin;

    CREATE DATABASE comentarios OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE comentarios TO admin;

    CREATE DATABASE mensajes OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE mensajes TO admin;

    CREATE DATABASE seguidores OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE seguidores TO admin;

EOSQL

#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE admin_usuarios OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE admin_usuarios TO admin;

    CREATE DATABASE publicaciones OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE publicaciones TO admin;
EOSQL

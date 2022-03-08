FROM postgres:12.8

COPY ./initdb.sh /docker-entrypoint-initdb.d/initdb.sh

RUN chmod +x /docker-entrypoint-initdb.d/*.sh

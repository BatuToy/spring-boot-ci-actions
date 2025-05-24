#!/usr/bin/env sh

docker-entrypoint.sh postgres &

sleep 5
#   Todo -->  This will not work at the moment !
psql -U postgres -c "CREATE DATABASE 'order_db';"
psql -U postgres -c "CREATE USER 'action_user' WITH ENCRYPTED PASSWORD 'action_pass';"
psql -U postgres -c "GRANT ALL PRIVILEGES ON DATABASE 'order_db' TO 'action_user';"
psql -U postgres -c "CREATE SCHEMA 'order_schema';"
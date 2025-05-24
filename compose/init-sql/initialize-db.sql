CREATE DATABASE order_db;
CREATE SCHEMA order_schema;
CREATE USER action_user WITH ENCRYPTED PASSWORD 'action_pass';
GRANT ALL PRIVILEGES ON DATABASE order_db TO action_user;

CREATE DATABASE legalite_db;
CREATE USER legalite WITH ENCRYPTED PASSWORD 'legalite1';
GRANT ALL PRIVILEGES ON DATABASE legalite_db TO legalite;
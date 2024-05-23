CREATE DATABASE contacts_db;

CREATE TABLE IF NOT EXISTS contacts
(
  id INTEGER NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO contacts (first_name, last_name, phone)
VALUES
('John', 'Doe', '123-456-7890'),
('Jane', 'Smith', '098-765-4321'),
('Alice', 'Johnson', '555-123-4567');

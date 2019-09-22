 DROP TABLE IF EXISTS persons;

CREATE TABLE persons (
  id bigint(20) AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  social_security_number VARCHAR(250) DEFAULT NULL,
  home_phone VARCHAR(250) DEFAULT NULL,
  mobile VARCHAR(250) DEFAULT NULL,
  birth_date date DEFAULT NULL,
  email date DEFAULT NULL
);

INSERT INTO persons (first_name, last_name, social_security_number, home_phone, mobile, birth_date, email)
 VALUES
  ('Aliko', 'Dangote', '125485659', '', '12565865658', '1992-12-7', 'aliko29@gmail.com'),
  ('Bill', 'Gates', '125488899', '', '12565861115', '1959-11-17', 'bill06@gmail.com'),
  ('Folrunsho', 'Alakija', '125485777', '', '14458865658', '1993-1-22', 'alakia7@gmail.com');
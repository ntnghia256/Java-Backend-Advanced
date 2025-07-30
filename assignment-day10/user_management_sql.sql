CREATE DATABASE IF NOT EXISTS user_management_java_exercise_vti;

USE user_management_java_exercise_vti;

CREATE TABLE IF NOT EXISTS `user` (
	id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO `user` (username, email) VALUES
('alice', 'alice@gmail.com'),
('bob', 'bob@gmail.com'),
('kandy', 'kandy@gmail.com'),
('lisa', 'lisa@gmail.com'),
('tommy', 'tommy@gmail.com');

SELECT * FROM `user`;
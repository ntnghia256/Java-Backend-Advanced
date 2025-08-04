CREATE DATABASE IF NOT EXISTS user_management_java_exercise_vti;

USE user_management_java_exercise_vti;

DROP TABLE IF  EXISTS tbl_team;
CREATE TABLE IF NOT EXISTS tbl_team (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(30) NOT NULL UNIQUE
);

INSERT INTO tbl_team (`name`) VALUES
('team 1'),
('team 2'),
('team 3');

DROP TABLE IF  EXISTS tbl_user;
CREATE TABLE IF NOT EXISTS tbl_user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    team_id TINYINT NOT NULL,
    username VARCHAR(30) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO tbl_user (team_id, username, email) VALUES
(1, 'alice', 'alice@example.com'),
(1, 'bob', 'bob@example.com'),
(2, 'charlie', 'charlie@example.com'),
(2, 'david', 'david@example.com'),
(3, 'eve', 'eve@example.com');



select * from tbl_user;
select * from tbl_team;
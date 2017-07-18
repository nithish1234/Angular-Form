CREATE TABLE users
(
id INT AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
email_id VARCHAR(50) NOT NULL,
PASSWORD VARCHAR (50)NOT NULL ,
CONSTRAINT pk_id PRIMARY KEY(id) ,
CONSTRAINT uk_email_id UNIQUE(email_id)
);
SELECT id,NAME,email_id,PASSWORD FROM users;
SELECT id,NAME,email_id,PASSWORD FROM users;
	SELECT id,NAME,email_id,PASSWORD FROM users WHERE email_id="nithish.619@gmail.com" AND PASSWORD="spencer@revature.com";
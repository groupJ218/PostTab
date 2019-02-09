CREATE TABLE mydb.users
(
  IS_BLOCK TINYINT,
  ID BIGINT NOT NULL AUTO_INCREMENT,
  ADDRESS_ID BIGINT,
  PASSWORD VARCHAR(50),
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50),
  EMAIL VARCHAR (50),
  PHONE VARCHAR (13),
  LOGIN VARCHAR (50),
  LAST_IP VARCHAR (50),
  REGISTER_DATE DATE ,
  LAST_LOGIN_DATE DATE,
  PRIMARY KEY (ID),
  FOREIGN KEY (ADDRESS_ID) REFERENCES addresses(ID)
);

ALTER TABLE users MODIFY PHONE varchar(13) ;
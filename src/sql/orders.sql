CREATE TABLE mydb.orders
(
  ID       BIGINT NOT NULL AUTO_INCREMENT,
  USER_ID  BIGINT,
  POINT_ID BIGINT,
  SUM      DOUBLE,
  DATE     DATE,
  PRIMARY KEY (ID),
  FOREIGN KEY (USER_ID),
  FOREIGN KEY (POINT_ID)
);
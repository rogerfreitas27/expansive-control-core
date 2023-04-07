CREATE TABLE `expansive_control`.TB_FINANCIAL_MOVEMENT(
ID BIGINT auto_increment NOT NULL,
NAME VARCHAR(255) NOT NULL,
VALUE  VARCHAR(255) NOT NULL,
RF_SHABBY_TYPE  BIGINT NOT NULL,
DATETIME  DATETIME,
RF_AUTHENTICATE_USER  BIGINT,
CONSTRAINT TB_FINANCIAL_MOVEMENT_PK PRIMARY KEY(ID),
CONSTRAINT FK_FINANCIAL_MOVEMENT_SHABBY_TYPE FOREIGN KEY(RF_SHABBY_TYPE) REFERENCES TB_SHABBY_TYPE(ID),
CONSTRAINT FK_FINANCIAL_MOVEMENT_AUTHENTICATE_USER FOREIGN KEY(RF_AUTHENTICATE_USER) REFERENCES TB_AUTHENTICATE_USER(ID)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;


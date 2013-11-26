CREATE TABLE "PHONE_NUMBER"
 ( "ID" NUMBER NOT NULL ENABLE,
 "TYPE" VARCHAR2(50),
 "NUM" VARCHAR2(50),
 "ID_CUSTOMER" NUMBER,
 CONSTRAINT "PHONE_NUMBER_PK" PRIMARY KEY ("ID") ENABLE,
 CONSTRAINT "PHONE_NUMBER_FK" FOREIGN KEY ("ID_CUSTOMER")
 REFERENCES "CUSTOMER" ("ID") ENABLE
 )
/

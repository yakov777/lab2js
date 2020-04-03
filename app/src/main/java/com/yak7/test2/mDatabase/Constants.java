package com.yak7.test2.mDatabase;

public class Constants {

    //COLUMNS
    static final String ROW_ID="id";
    static final String NAME="name";
    static final String URL="url";

    //DB PROPERTIES
    static final String DB_NAME="dd_DB";
    static final String TB_NAME="dd_TB";
    static final int DB_VERSION=1;

    //CREATE TABLE STMT
    static final String CREATE_TB="CREATE TABLE dd_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT NOT NULL,url TEXT NOT NULL);";

    //UPGRADE TB STMT
    static final String DROP_TB="DROP TABLE IF EXISTS "+TB_NAME;





}

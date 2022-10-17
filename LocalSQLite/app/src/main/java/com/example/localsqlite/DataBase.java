package com.example.localsqlite;

import android.provider.BaseColumns;

// User information table
public class DataBase
{
    // It is User information
    public static final class CreateDB implements BaseColumns
    {
        public static final String USERID = "userid";
        public static final String NAME = "name";
        public static final String AGE = "age";
        public static final String GENDER = "gender";
        public static final String _TABLENAME0 = "usertable";
        public static final String _CREATE0 = "create table if not exists "+_TABLENAME0+"("
                +_ID+" integer primary key autoincrement, "
                +USERID+" text not null , "
                +NAME+" text not null , "
                +AGE+" integer not null , "
                +GENDER+" text not null );";
    }
}

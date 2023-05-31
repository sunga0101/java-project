package com.likelion.javaproject2.week7.day2.model;

import java.sql.SQLException;

public class CountryDAO extends BaseDAO{
    private  void getCodeName() {
        String sql = "select code, name from country order by code, name";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while( rs.next() ) {
                System.out.print( rs.getString("code") + "\t");
                System.out.println( rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }
}

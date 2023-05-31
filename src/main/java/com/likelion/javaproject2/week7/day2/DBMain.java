package com.likelion.javaproject2.week7.day2;
import com.likelion.javaproject2.week7.day2.model.BaseDAO;

import java.sql.*;


public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
//        dbMain.initPerson();
        dbMain.insertPerson("!!");
        dbMain.insertPerson("mini");
        dbMain.insertPerson("jimin");
    }
    private int insertPerson(String name) {
        int cnt = 0;
        String sql = "insert into person(name) values(?)";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            cnt = psmt.executeUpdate();
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        finally {
            close();
        }
        return cnt;
    }

    private void initPerson() {
        int cnt = 0; // 몇 건이 변환되었는지
        String sql = """
                create table person (
                id integer primary key autoincrement,
                name string
                )
                """;
        try {

            getConn();
            smt = conn.createStatement();
            smt.executeUpdate("drop table if exists person");
            cnt = smt.executeUpdate(sql);
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

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

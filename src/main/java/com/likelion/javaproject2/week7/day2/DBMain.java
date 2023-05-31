package com.likelion.javaproject2.week7.day2;
import com.likelion.javaproject2.week7.day2.model.BaseDAO;
import com.likelion.javaproject2.week7.day2.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
        dbMain.initPerson();
        dbMain.insertPerson("!!");
        System.out.println(dbMain.insertPerson("mini"));
        System.out.println(dbMain.insertPerson("jimin"));

        List<Person> personList = dbMain.findAllPerson();
        System.out.println(personList.toString());
    }

    private List<Person> findAllPerson() {
        List<Person> result = new ArrayList<>();
        String sql = "select id, name  from person";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while( rs.next() ) {
                int id = rs.getInt("id"); // int 타입
                String name = rs.getString("name");
                result.add(new Person(id,name)); // 생성자
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;  // Person.java에서 toString을 overide
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

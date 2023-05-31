package com.likelion.javaproject2.week7.day2.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDAO extends BaseDAO {

    public Optional<Person> findByNamePerson(String pname) {
        String sql = "select id, name  from person where name=?";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1,pname);
            rs = psmt.executeQuery();
            if ( rs.next() ) { // while문으로 하면 동명이인 다 가져옴. if문은 상위 1명만
                int id = rs.getInt("id"); // int 타입
                String name = rs.getString("name");
                return Optional.of(new Person(id, name)); // optional 객체, null이 들어가도 완충
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return Optional.empty();  // null -> optional.empty()
    }


    public List<Person> findAllPerson() {
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


    public int insertPerson(String name) {
        int cnt = 0; // 몇 건이 변환되었는지
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

    public void initPerson() {
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
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }
}

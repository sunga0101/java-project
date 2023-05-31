package com.likelion.javaproject2.week7.day2.model;

import java.sql.*;

// 데이터 access하는데 사용한다는 의미
public class BaseDAO {
    // 기본은 private지만 하위 접근이 가능하도록 protect로 변경해줌
    protected Connection conn = null;
    protected Statement smt = null;
    protected PreparedStatement psmt = null;
    protected ResultSet rs = null;

    // 아래 두 함수는 항상 같이 실행하도록

    // 매번 커넥션 할 필요 없도록
    protected void getConn(){
        String url = "jdbc:sqlite:world.db"; // 변경 가능하도록
        String user = ""; // 필요할 때 사용하도록
        String password = "";
        try{
        conn = DriverManager.getConnection(url);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //상속받은 자손들에게만 노출되도록
    protected void close(){
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (smt != null) smt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (psmt != null) psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

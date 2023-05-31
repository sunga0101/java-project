package com.likelion.javaproject2.week7.day2;
import com.likelion.javaproject2.week7.day2.model.BaseDAO;
import com.likelion.javaproject2.week7.day2.model.Person;
import com.likelion.javaproject2.week7.day2.model.PersonDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("mini"));
        System.out.println(personDAO.insertPerson("jimin"));

        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
        System.out.println(personDAO.findByNamePerson("jimin"));
    }
}

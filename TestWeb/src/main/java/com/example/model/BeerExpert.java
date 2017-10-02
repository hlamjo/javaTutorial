package com.example.model;
import java.sql.*;
import java.util.*;

public class BeerExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/beer","postgres", "");



            PreparedStatement statement = connection.prepareStatement("select beername from proposal where color_id = (select uid from color where colorname=(?))");
            statement.setString(1, color);
        // выбираем данные с БД
        ResultSet rs = statement.executeQuery();
        // И если что то было получено то цикл while сработает
        while (rs.next()) {
            brands.add(rs.getString("beername"));
        }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        if(color.equals("amber")){
//            brands.add("Jack Amber");
//            brands.add("Red Moose");
//        } else {
//            brands.add("Jail Pale Ale");
//            brands.add("Gout Stout");
//        }
        return brands;
    }
}

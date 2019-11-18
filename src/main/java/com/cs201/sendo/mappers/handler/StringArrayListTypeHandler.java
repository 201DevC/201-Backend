package com.cs201.sendo.mappers.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StringArrayListTypeHandler extends BaseTypeHandler<ArrayList<String>> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ArrayList<String> parameter, JdbcType jdbcType)
            throws SQLException {
        // TODO Auto-generated method stub
        StringBuilder str = new StringBuilder(parameter.toString());
        ps.setString(i, str.substring(1, str.length() - 1));

    }

    @Override
    public ArrayList<String> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // TODO Auto-generated method stub

        String str = rs.getString(columnName);

        ArrayList<String> roles = new ArrayList<String>();
        String[] rolesarray = str.split(",");
        for (String s : rolesarray)
            roles.add(s);

        return roles;
    }

    @Override
    public ArrayList<String> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        String str = rs.getString(columnIndex);

        ArrayList<String> roles = new ArrayList<String>();
        String[] rolesarray = str.split(",");
        for (String s : rolesarray)
            roles.add(s);

        return roles;
    }

    @Override
    public ArrayList<String> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        String str = cs.getString(columnIndex);

        ArrayList<String> roles = new ArrayList<String>();
        String[] rolesarray = str.split(",");
        for (String s : rolesarray)
            roles.add(s);

        return roles;
    }

}
package com.cisco.prj.util;

import java.lang.reflect.Method;

import com.cisco.prj.annotation.Column;
import com.cisco.prj.annotation.Table;

public class SQLUtil {
	// Book.class , Product.class, Employee.class ==> CREATE table products ...
	public static String generateCreateSQL(Class<?> clazz) {
		StringBuilder builder = new StringBuilder();
		Table table = clazz.getAnnotation(Table.class);
		if( table != null) {
			builder.append("create table " + table.name()); 
			builder.append("("); // create table products (
			Method[] methods = clazz.getDeclaredMethods();
			for(Method m : methods) {
				if(m.getName().startsWith("get")) {
					Column col = m.getAnnotation(Column.class);
					if( col != null) {
						builder.append(col.name()); // create table products ( PID
						builder.append(" ");
						builder.append(col.type());
						builder.append(",");  // create table products ( PID NUMBER(10), PRD_NAME VARCHAR(200) ,
					}
				}
			}
			builder.setCharAt(builder.lastIndexOf(","), ')');
		}
		return builder.toString();
	}
}

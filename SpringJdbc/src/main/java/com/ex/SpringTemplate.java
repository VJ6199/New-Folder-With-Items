package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringTemplate {
 private JdbcTemplate jt;
 
 public void setJt(JdbcTemplate jt) {
	 this.jt=jt;
	 
 }
 public void select() {
	 List li=jt.queryForList("select * from student");
	 Iterator i=li.iterator();
	 while(i.hasNext()) {
		System.out.println(i.next());
	 }
	 
 }
 
}
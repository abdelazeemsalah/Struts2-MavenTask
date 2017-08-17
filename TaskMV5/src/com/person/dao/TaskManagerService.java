package com.person.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.person.model.Person;
import com.service.utility.DBUtility;
public class TaskManagerService {
 private Connection connection;
 public TaskManagerService() {
  connection = DBUtility.getConnection();
 }
 public void addTask(Person person) {
  try {
   PreparedStatement preparedStatement = connection
     .prepareStatement("insert into task(user_name,age,email,task_start_time,task_end_time,task_status) values (?,?,?,?,?,?)");
   System.out.println("Task:"+person.getUserName());
   preparedStatement.setString(1, person.getEmail());
   preparedStatement.setLong(2, person.getAge());     
   preparedStatement.setString(3,person.getEmail());
   Date dt = new Date();
   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   String currentTime = sdf.format(dt);
   preparedStatement.setString(4,currentTime);
   preparedStatement.setString(5,currentTime);
   preparedStatement.setString(6, "P");
   preparedStatement.executeUpdate();
  } catch (SQLException e) {
   e.printStackTrace();
  }
 }

 

 public List<Person> getAllPendingTasks() {
  List<Person> tasks = new ArrayList<Person>();
  try {
   Statement statement = connection.createStatement();
   ResultSet rs = statement.executeQuery("select * from task where task_status='P'");
   while (rs.next()) {
	   Person task = new Person();
    task.setTaskId(rs.getInt("task_id"));
    task.setUserName(rs.getString("user_name"));
    task.setEmail(rs.getString("email"));    
    task.setAge(rs.getLong("age"));
    task.setTaskStatus(rs.getString("task_status"));
    tasks.add(task);
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }
  return tasks;
 }
 public Person getTaskById(int taskId) {
	 Person task = new Person();
  try {
   PreparedStatement preparedStatement = connection.
     prepareStatement("select * from task where task_id=?");
   preparedStatement.setInt(1, taskId);
   ResultSet rs = preparedStatement.executeQuery();
   if (rs.next()) {
	   task.setTaskId(rs.getInt("task_id"));
	    task.setUserName(rs.getString("user_name"));
	    task.setEmail(rs.getString("email"));    
	    task.setAge(rs.getLong("age"));
     task.setTaskStatus(rs.getString("task_status"));
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }
  return task;
 }
 
 public void completeTask(int taskId,String status) {
	   try {
	    PreparedStatement preparedStatement = connection
	      .prepareStatement("update task set task_status=? where task_id=?");
	    preparedStatement.setString(1,status);
	    preparedStatement.setInt(2, taskId);
	    preparedStatement.executeUpdate();
	   } catch (SQLException e) {
	    e.printStackTrace();
	   }
	  }
 
}
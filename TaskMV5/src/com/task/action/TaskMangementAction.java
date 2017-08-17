package com.task.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.person.dao.TaskManagerService;
import com.person.model.Person;


public class TaskMangementAction extends ActionSupport implements ModelDriven<Person>  {

	/**
	 * 
	 */
	private TaskManagerService taskmanagerservice;
	
	public TaskManagerService getTaskmanagerservice() {
		return taskmanagerservice;
	}
	public void setTaskmanagerservice(TaskManagerService taskmanagerservice) {
		this.taskmanagerservice = taskmanagerservice;
	}

	private Person person ;
	
	public List<Person> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Person> taskList) {
		this.taskList = taskList;
	}

	private List<Person> taskList;
	
	private static final long serialVersionUID = 6044323357368438849L;
	@Valid
	@Override
	public Person getModel() {
		
		return person;
	}
	
	public String viewTaskList() {
		//taskList.add(new Person("Abdelazeem", 28L, "abdelazeem.salah@gmail.com"));
		//taskList.add(person);
		taskList=taskmanagerservice.getAllPendingTasks();
		return SUCCESS;
	}
	
public String addTask() {
	//taskList.add(person);
		taskmanagerservice.addTask(person);
		taskList=taskmanagerservice.getAllPendingTasks();
		return SUCCESS;
	}

public String completeTask()
{
    HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
    Integer taskId=new Integer(request. getParameter("taskId"));
    taskmanagerservice.completeTask(taskId, "C");
    addActionMessage("Task Completed Successfuly");
    taskList=taskmanagerservice.getAllPendingTasks();
    
    return SUCCESS;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}
	
	

}

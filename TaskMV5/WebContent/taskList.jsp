
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
@import url(style.css);



.welcome {
    position: absolute;
	background-color:#DDFFDD;
	border:1px solid #009900;
	width:300px;
	top: 20%;margin-left: 1%;font-size: 15px;
}
.welcome li{
	list-style: none;
}
.odd {
background-color:  #eee;
}

.even {
background-color: #fff;
}
table.taskTable th {

    background-color: black;
    color: white;height: 25px;
}
table.taskTable td{
height: 25px;
}
.taskTable{
width:600px;'
}
</style>
    </head>
    <body>
    <div style="position: absolute;width: 100%;top: 10%;margin-left: 1%;font-size: 20px;">Pending Tasks</div>
    <s:if test="hasActionMessages()">
   <div class="welcome">
      <s:actionmessage/>
   </div>
</s:if>
       <s:if test="taskList.size() > 0">
	<div class="content">
	<table class="taskTable"   >
		<tr  >
			<th>User Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Actions</th>
			
		</tr>
		<s:iterator value="taskList" status="taskStatus">
			<tr
				class="<s:if test="#taskStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="userName" /></td>
				<td><s:property value="age" /></td>
				<td><s:property value="email" /></td>
				<td><s:url id="completeTask" action="completeTask">
					<s:param name="taskId" value="%{taskId}"></s:param>
				</s:url>
				<s:a href="%{completeTask}">Complete Task</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
    </body>
</html>

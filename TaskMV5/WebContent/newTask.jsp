
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
</style>
    </head>
    <body>
    <div style="position: absolute;width: 100%;top: 10%;margin-left: 2%;font-size: 20px;">Create New Task</div>
    <div style="position: absolute;width: 100%;top: 30%;margin-left: 2%;">
		
   <s:actionerror  />
    <s:form action="createTask" theme="simple"> 
    <s:fielderror cssStyle="color:red;" fieldName="userName" /> 
    <div class="row">
				<div class="col">
					<div class="inputLabel">
						User Name <span class="asterisk">*</span>
					</div>
					<div class="inputField">
						<div class="flW">


							<s:textfield label="User Name" name="userName" id="userName"
								cssClass="required textField" />

							<s:fielderror fieldName="userName" />
						</div>
					</div>
				</div>
				</div> 
				   <div class="row">
				<div class="col">
					<div class="inputLabel">
						Age <span class="asterisk">*</span>
					</div>
					<div class="inputField">
						<div class="flW">


							<s:textfield label="Age" name="age" id="age"
								cssClass="required textField" />

							<s:fielderror cssStyle="color:red;" fieldName="age" />
						</div>
					</div>
				</div>
				</div>
				   <div class="row">
				<div class="col">
					<div class="inputLabel">
						Email ID <span class="asterisk">*</span>
					</div>
					<div class="inputField">
						<div class="flW">


							<s:textfield label="Email" name="email" id="email"
								cssClass="required textField" />

							<s:fielderror cssStyle="color:red;" fieldName="email" />
						</div>
					</div>
				</div>
				<div class="row">
					<div class="submitBtn">
						<s:submit name="Save" cssClass="button" />
					</div>
				</div>
				</div> 
				
<%-- <s:textfield name="userName" label="User Name"></s:textfield> --%>
<%-- <s:fielderror fieldName="age" />  --%>
<%-- <s:textfield name="age" label="Age"></s:textfield>  --%>
<%-- <s:fielderror fieldName="email" />  --%>
<%-- <s:textfield name="email" label="Email"></s:textfield> --%>
<%-- <s:submit value="save"></s:submit>   --%>
</s:form>
</div>
    </body>
</html>

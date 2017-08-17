
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
   
    <body>
 


    <s:form action="createTask1" theme="simple"> 
    <s:fielderror fieldName="userName" cssStyle="color:red;" />   
<s:textfield name="userName" label="User Name"></s:textfield>
<s:fielderror fieldName="age" /> 
<s:textfield name="age" label="Age"></s:textfield> 
<s:fielderror fieldName="email" /> 
<s:textfield name="email" label="Email"></s:textfield>
<s:submit value="save"></s:submit>  
</s:form>
    </body>
</html>

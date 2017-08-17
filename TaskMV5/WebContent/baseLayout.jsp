<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:insertAttribute name="title" ignore="true" /></title>
            <style type="text/css">
            .layoutClass{
            background-color: #385b93;color:white;
            }
            </style>
    </head>
    <body>
        <table   width="100%" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td class="layoutClass" height="40" colspan="2" >
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr height="440">
                <td class="layoutClass">
                    <tiles:insertAttribute name="menu" />
                </td>
                <td width="80%">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td height="40" colspan="2" class="layoutClass">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>

<%-- 
    Document   : erreur
    Created on : Oct 27, 2019, 12:55:07 PM
    Author     : e-boudhina
--%>

<%@page import="java.io.PrintStream"%>
<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
       
            
      <h1>Opps...</h1>
      <p>Sorry, an error occurred.</p>
      <p>Here is the exception stack trace: </p>
      <p>Make sure that <b>n</b> is valid number not a string</p>
      <%=request.getAttribute("exception") %>
   </body>
</html>


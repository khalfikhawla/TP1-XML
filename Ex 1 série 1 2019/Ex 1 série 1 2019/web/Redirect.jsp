<%-- 
    Document   : Welcome
    Created on : Nov 2, 2019, 8:54:06 PM
    Author     : e-boudhina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        /* I used request dispatcher because a jsp/html under WEB-INF, cannot access directly by a client.
            so you need to forward to this page in serverside.  */
        request.getRequestDispatcher("/WEB-INF/VueSérie.jsp").forward(request, response);%>
    </body>
</html>

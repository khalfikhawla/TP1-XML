<%-- 
    Document   : VueSérie
    Created on : Oct 26, 2019, 8:46:14 PM
    Author     : e-boudhina
--%>

   
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main page</title>
    </head>
    
    <body>
        
        <% if (request.getAttribute("SH") !=null){%>
        
        <b>La Somme S : </b> <em><%= request.getAttribute("SH") %></em>
        
        <% }else {%>
        
        <h4>Calcule de la série harmonique : s = 1 + 1/2 + 1/3 + 1/4 +... +1/n</h4>
        
        
        La valeur de n : 
        <br><br>
        <!-- the action below is just an alias / a fake path , to modify it refer to web.xml-->
        <form action="Calculer.php" method="post">
       
            <input type="text" name="n" value=""><br><br>
            <input type="submit" value="Calculer" />
       
        </form>
        
        <% }%>
        
    </body>
    
</html>

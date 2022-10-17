<%-- 
    Document   : index.jsp
    Created on : 17 de out de 2022, 14:00:27
    Author     : Fatec
--%>

<%
  
    int n1 = 4;
    int n2 = 2;
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/scripts.jspf" %>
        <%@include file="WEB-INF/jspf/css.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <!<!-- Incluindo o arquivo JSPF que contém a navbar -->
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        <div class="container-fluid" id="jsp">
            <!<!-- Incluindo o arquivo JSPF que contém o conteudo de jsp-->
            <%@include file="WEB-INF/jspf/jsp.jspf" %>   
            <div class="row">
                <div class="col-sm-3 text-center" style="padding-bottom: 1%;">
                    <h2>Exemplo:</h2>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4 text-center">
                    <h4>Valor Variavel n1: </h4>
                    <% 
                         
                        out.print(n1);
                    
                    %>
                </div>
                <div class="col-sm-4 text-center">
                    <h4>Valor Variavel n1: </h4>
                    <% 
                         
                        out.print(n2);
                    
                    %>
                </div>
                <div class="col-sm-4 text-center">
                    <h4>Soma: </h4>
                    <% 
                         
                        out.print(n1 + n2);
                    
                    %>
                </div>
            </div>
        </div>
        <div class="container-fluid" id="jspf">
            <%@include file="WEB-INF/jspf/jspf.jspf" %> 
        </div>
        
        <div class="container-fluid" id="jstl">
            <%@include file="WEB-INF/jspf/jstl.jspf" %> 
            <div class="row">
                <div class="col-sm-3 text-center">
                    <h2>Exemplo: </h2>
                    
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12 text-center">
                    <p>
                        &lt;c:forEach var="i" begin="1" end="10" step="1"&gt; <br>
                            &lt;c:out value="${i}" /&gt;

                                <br />
                                &lt;/c:forEach&gt;
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>

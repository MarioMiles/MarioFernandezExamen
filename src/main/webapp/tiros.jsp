<%-- 
    Document   : tiros
    Created on : 16-jun-2021, 16:22:52
    Author     : DAW-A
--%>

<%@page import="modelo.Coordenada"%>
<%@page import="modelo.Tiro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tiros parabólicos</title>
    </head>
    <body>
        <h1>Tiros parabólicos</h1>
        <%
            ArrayList<String> listaGrados= ( ArrayList<String> ) request.getAttribute("listaGrados");

           
            Tiro miTiro = ( Tiro ) request.getAttribute("miTiro");
            double velocidad=0;
            int angulo=0;
            
            if ( miTiro!=null) {
                    velocidad=miTiro.getVelocidadIni();
                    angulo=miTiro.getAngulo();
                }
            
            %>
             <form action="ServletTiros" method="post">
                <p><label>Velocidad(M/s):</label><input type="text" name="velocidad" value="<%=velocidad%>"></p>
                <p><label>Angulo:</label>
                    <select name="angulo">
                         <%

                            for ( String a: listaGrados ){
                              String cadenaSelected="";
                              if ( Integer.parseInt(a)==angulo){
                                  cadenaSelected = " selected ";
                              }

                              out.println("<option value=" + a + cadenaSelected +">" + a + "</option>" );
                              
                              
                          }
                           %>
                    </select>
                    </p>
                    <input type="submit" value="Calcular">
                    <h1>Alcance: ${miTiro.alcanceMax}</h1>
                    <h1>Altura: ${miTiro.alturaMax}</h1>
             </form>
             <%
                ArrayList<Coordenada> listaCoordenadas = ( ArrayList<Coordenada> ) request.getAttribute("listaCoordenadas");
                    
                if(listaCoordenadas!=null){
                    out.println("<table border='1'>"
                            + "<tr>"
                            +   "<td>X</td>"
                            +   "<td>Y</td>"
                            
                            + "</tr>");
                  for(int i=10;i>0;i--){
                    out.println("<tr>"
                            
                            +   "<td>"+miTiro.getAlcanceMax()/i+"</td>"
                            +   "<td>"+miTiro.getAlturaMax()/i+"</td>"
                              
                            + "</tr>" );
                            
                    }
                   out.println("</table>");
                    
                }
                
            
            %>
    </body>
</html>

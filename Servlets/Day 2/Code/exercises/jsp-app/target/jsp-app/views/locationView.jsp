<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="ro.teamnet.zth.appl.dao.LocationDao" %>
<%@ page import="ro.teamnet.zth.appl.domain.Location" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Locations List</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>Id</td>
        <td>Street address</td>
        <td>Postal code</td>
        <td>City</td>
        <td>State province</td>
    </tr>
    </thead>
    <tbody>
    <%
        String aux = request.getParameter("id");
        Integer id = Integer.parseInt(aux);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        LocationDao ld = new LocationDao();
        Location location = ld.getLocationById(id);
    %>
    <tr>
        <!--TODO de completat cu cod pentru a afisa detaliile locatiei cu id-ul trimis din locationlist.jsp in momentul in care se acceseaza link-ul 'View'-->
                <td>
                    <%=location.getId()%>
                </td>
                <td>
                    <%=location.getStreetAddress()%>
                </td>
                <td>
                    <%=location.getPostalCode()%>
                </td>
                <td>
                    <%=location.getCity()%>
                </td>
                <td>
                    <%=location.getStateProvince()%>
                </td>
    </tr>

    </tbody>
</table>
<a href="locationList.jsp">Locations List</a>
</body>
</html>

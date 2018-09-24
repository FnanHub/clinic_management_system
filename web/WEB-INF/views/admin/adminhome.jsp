<%--
  Created by IntelliJ IDEA.
  User: melathadgu
  Date: 9/23/18
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/admin_js/adminhome.js" type="text/javascript" ></script>
     <link href="resources/css/admincss/adminhome.css" type="text/css" rel="stylesheet">
</head>
<body>

<button id="doc" class="admin" value="doctors"> doctors</button>

<button id="ser" class="admin" value="services"> services</button>


<table id="tbl_list" style="display: none;">
    <thead>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name </th>
        <th>E-mail</th>
        <th>Phone number</th>
        <th>Action </th>
    </tr>
    </thead>
    <tbody  id="data_list">

    </tbody>
</table>

<table id="serv_list" style="display: none;">
    <thead>
    <tr>
        <th>clinicserviceId</th>
        <th>clinicService Name</th>
        <th>description  </th>
        <th>Action </th>
    </tr>
    </thead>
    <tbody  id="data_ser_list">

    </tbody>
</table>

</body>
</html>

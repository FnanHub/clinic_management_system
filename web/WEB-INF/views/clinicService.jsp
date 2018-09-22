<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 9/22/18
  Time: 1:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>


    <!-- Latest compiled and minified CSS -->
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"--%>
          <%--integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

    <%--<!-- Optional theme -->--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/patient_rg_js/clinical_service.js"></script>

    <%--<!-- Latest compiled and minified JavaScript -->--%>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

</head>
<body>

    <%@include file="../header.jsp" %>

<article>

    <jsp:useBean id="obj" class="model.ClinicService" scope="request"/>
    <div class="row">
        <c:set var="i" value="0" scope="page"/>
        <c:forEach var="clinicService" items="${clinic_services}">
        <c:set var="n" value="${i%3}"/>
        <c:if test="${n == 0}">

    </div>
    <div class='row'>
        <hr>
        </c:if>
        <div class='col-md-4'>
            <p><img src='${clinicService.clinicServiceImgUrl}' width=200 height=200 class='img-thumbnail'/></p>
            <h3 class='text-primary'>${clinicService.clinicServiceName}</h3>
            <p class='text-success'>Description: <strong>${clinicService.description}</strong></p>
                <%--<p><a id="service_details" href='#' class='btn btn-default'>View Details</a></p>--%>
            <button class="doctors_list" class='btn btn-default' value='${clinicService.clinicserviceId}'>Doctor's list
            </button>
            <c:set var="i" value="${i+1}"/>
        </div>

        </c:forEach>
    </div>
    </div>

</article>


    <%@include file="../footer.jsp" %>



</body>
</html>

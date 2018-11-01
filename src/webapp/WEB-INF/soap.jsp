<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>Hello Spring MVC</title>
   </head>

   <body>
   <c:set var="user" value="${user}"/>
   <c:if test="user not null">
      Country:
      name: <c:out value="${user.name}"/>
      age: <c:out value="${user.age}"/>
      gender: <c:out value="${user.gender.value()}"/>


   </c:if>
   <c:otherwise>
      Chose the user
   </c:otherwise>
   </body>
</html>
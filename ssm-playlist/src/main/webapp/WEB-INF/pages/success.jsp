<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--添加jstl核心库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>congratulations!</h1>
<c:forEach items="${musicList}" var="music">
    ${music.id}-
    ${music.name}-
    ${music.singer}-
    ${music.album}-
</c:forEach>
</body>
</html>

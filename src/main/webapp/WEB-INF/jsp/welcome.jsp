<%--
  Created by IntelliJ IDEA.
  User: 055055
  Date: 2018-11-01
  Time: 오후 1:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/static/js/jquery.js"></script>

<html>
<head>
    <title>Hello</title>
</head>
<body>
    <button id="name" value="${name}"></button>
    <button onclick="move()">dd</button>
    <button id="click" value="hh">click</button>
</body>
</html>

<script type="text/javascript">

   $("#click").on("click", function(){
       var url = "/main";
       var param = "?name="+$("#name").val()+"&identifiedType="+"${identified.identifiedType[0]}";
       alert(url+param);
        location.href = url+param;
   });

  function move(){
      alert($("#click").val());
      alert("aa");
  };
</script>
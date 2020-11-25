<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/11/25
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>房产信息查询系统</h1>
<p>
    用户名:${sessionScope.users.name}<a href="/loginout.do">退出</a>
</p>
<a href="#">房产信息查询</a>
<div>
    <h1>房产信息查询</h1>
    <p>查询类型：
    <select id="option">
        <option value="用户名"> 用户名</option>
        <option value="身份证">身份证</option>
    </select>
        <input type="text" name="projectname"><input type="button" onclick="query()" value="查找">
    </p>
    <table>
        <tr>
            <td>序号</td>
            <td>项目名称</td>
            <td>产权人</td>
            <td>省份证号</td>
            <td>房屋类型</td>
            <td>使用面积</td>
            <td>建造时间</td>
        </tr>
        <c:forEach items="${pageInfo.list}" var="realEstate">
        <tr>
            <td>${realEstate.id}</td>
            <td>${realEstate.projectname}</td>
            <td>${realEstate.projectname}</td>
            <td>${realEstate.cardid}</td>
            <td>${realEstate.housetype}</td>
            <td>${realEstate.usearea}</td>
            <td>${realEstate.buildtime}</td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="7">

                    <c:if test="${pageInfo.hasPreviousPage}">
                        <a href="/main.do?pageNum=${pageInfo.prePage}">上一页</a>
                    </c:if>
                    <c:forEach items="${requestScope.pageInfo.navigatepageNums}" var="i">
                        <c:if test="${i==requestScope.pageInfo.pageNum}">
                            <a href="/main.do?pageNum=${i}">[${i}]</a>
                        </c:if>
                        <c:if test="${i!=requestScope.pageInfo.pageNum}">
                            <a href="/main.do?pageNum=${i}">${i}</a>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage}">
                        <a href="/main.do?pageNum=${pageInfo.nextPage}">下一页</a>
                    </c:if>

            </td>
        </tr>
    </table>
</div>
</body>
<script>
    function query(){
        var option = document.getElementById("option");
        var projectname = document.getElementById("projectname");
        window.location.href="/main.do?option="+option+"&projectname="+projectname;
    }
</script>
</html>

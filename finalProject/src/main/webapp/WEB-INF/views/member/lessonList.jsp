<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style>
	.outer{
		width:1000px;
        margin: auto;
    }

    
    @font-face {
    font-family: '양진체';
    src: url('https://cdn.jsdelivr.net/gh/supernovice-lab/font@0.9/yangjin.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}

        *{
            font-family: '양진체';
            color:rgb(49, 48, 47);
            font-weight: normal;
            font-style: normal;
        }
        
         /*영역잡기*/
    #alarm-outer{
        margin:auto;
        width: 1000px;
        display: block;
    }
    #teacher-detail{
        margin: auto;
        width: 900px;
        height: 2000px;
    }
    #teacher-reply{
        
        margin: auto;
        margin-top: 50px;
        width: 900px;
        height: 300px;
    }
    .line{
        height: 0px;
        width: 600px;
        background-color: black;
        border: 1px solid black;
        margin: auto;
        margin-top: 20px;
        margin-bottom: 20px;
    }
    #idc{
        
        width: 500px;
        height: 700px;
        margin: auto;
        margin-bottom: 10px;
        /*공란색칠*/
        background-color: orange;
    }
    #vi{
        width: 700px;
        height: 400px;
        margin:auto;
        margin-bottom: 10px;
        /*공란색칠*/
        background-color: orange;
    }
    /*영역잡기 끝*/

    /*페이지 제목 + 서브타이틀*/
    #subtit{
            font-size: 25px;
            font-weight: 800;
            margin-top: 50px;
            margin-bottom: 50px;
    }
    .mid{
        margin-bottom: 30px;
        font-size: 25px;
    }   
    /*페이지 제목 끝*/
    
    /*선생님 정보*/
    #teacher-tb1{
        border-collapse: separate;
        border-spacing: 10px;
    }


    #teacher-tb2{
        text-align: center;
        border-collapse: separate;
        border-spacing: 10px;
        margin: auto;
        width: 600px;
    }
    
</style>
</head>
<body>
	
	<jsp:include page="../common/header.jsp"/>
	<jsp:include page="../common/myPageNavi.jsp"/>
	    <div class="outer">
    <br><br><br><br>
	 <h4 align="center"><b>과외 목록</b></h4>
	 <br><br>
        <table class="table table-bordered table-sm" id="lessonListTable">
            <thead align="center">
                <tr>
                    <th style="width:20% ;">과목</th>
                    <th style="width:25% ;">선생님</th>
                    <th style="width:45% ;">기간</th>
                    <th style="width:10% ;">상태</th>
                </tr>
            </thead>
            <tbody align="center">
                <c:forEach var="l" items="${list }">
                	<tr align="center">
                		<td>${l.subject}</td>
                		<td>${l.userName } 선생님</td>
                		<td>${l.startDate} ~ ${l.endDate }</td>
                		<c:choose>
                			<c:when test="${l.status eq 'Y' }">
                				<td>진행중</td>
                			</c:when>
                			<c:otherwise>
                				<td>종료</td>
                			</c:otherwise>
                		</c:choose>
                		
                	</tr>
                </c:forEach>

            </tbody>

        </table>
		
        
    </div>
 

    </div>
    </div>

    </div>
    </div>
</body>
</html>
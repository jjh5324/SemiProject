<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% // Controller 로부터 결과 데이터 받음
	int cnt = (Integer)request.getAttribute("result");
%>

<% if(cnt == 0){
	System.out.println("cnt: " + cnt); // 0
%>
	<script>
		alert("수정 실패");
		history.back();
	</script>
<% } else { 
	System.out.println("cnt: " + cnt); // 0
	
} %>
	<script>
		alert("수정 성공");
		opener.parent.window.location.reload();
		window.close();
	</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(':button').on('click',function(){
			$.ajax({
				url: 'ajaxAction',
				type: 'get',
				async:true,
				date:{username:'lisi',fav:['a','b']},
				contentType:'application/x-www-form-urlencoded',
				dateType:'json',
				suceess:function(json){
					console.log(json);
				}
				
			});
		});
	});
</script>
</head>
<body>
<input type="button" value="testAjax"/>
</body>
</html>
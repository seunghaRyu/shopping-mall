<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<link rel="stylesheet" href="/resources/css/user/signup.css">


</head>
<body>
	<a href="/main">shopping mall</a>
<div class="wrapper">
	<form action="">
		<div class="wrap">
			<div class="signup">
			<span>회원가입</span>
			</div>
			<div class="id_wrap">
				<div class="user_id">아이디</div>
				<div class="id_input_box">
					<input class="id_input">
				</div>
			</div>
			
			<div class="pwd_wrap">
				<div class="user_pwd">패스워드</div>
				<div class="pwd_input_box">
					<input class="pwd_input">
				</div>
			</div>
			
			<div class="pwdck_wrap">
				<div class="user_pwdck">패스워드확인</div>
				<div class="pwdck_input_box">
					<input class="pwdck_input">
				</div>
			</div>
			
			<div class="name_wrap">
				<div class="user_name">이름</div>
				<div class="user_name_input_box">
					<input class="user_name_input">
				</div>
			</div>
			
			<div class="email_wrap">
				<div class="user_email">이메일</div>
					<div class="email_input_box">
						<input class="email_input">
					</div>
					
				<div class="emailck_wrap">
					<div class="emaick_input_box">
						<input class="emailck_input" >
					</div>
					<div class="emailck_button">
						<span>인증번호 전송</span>
					</div>
					<div class="clearfix"></div>
				</div>
				
			</div>
			<div class="address_wrap">
				<div class="user_address">주소</div>
				<div class="address_input_1_wrap">
					<div class="address_input_1_box">
						<input class="address_input_1">
					</div>
					<div class="address_button">
						<span>주소 찾기</span>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class ="address_input_2_wrap">
					<div class="address_input_2_box">
						<input class="address_input_2">
					</div>
				</div>
				<div class ="address_input_3_wrap">
					<div class="address_input_3_box">
						<input class="address_input_3">
					</div>
				</div>
			</div>
			<div class="join_button_wrap">
				<input type="button" class="join_button" value="가입하기">
				<input type="reset" class="join_button" value="취소하기">
			</div>
		</div>
	</form>
</div>


</body>
</html>
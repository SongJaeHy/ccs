<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/sb-admin-2.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테스트</h1>
	<div class="row">
       <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
       <div class="col-lg-6">
           <div class="p-5">
               <div class="text-center">
                   <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
               </div>
               <form class="user">
                   <div class="form-group">
                       <input type="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address...">
                   </div>
                   <div class="form-group">
                       <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
                   </div>
                   <div class="form-group">
                       <div class="custom-control custom-checkbox small">
                           <input type="checkbox" class="custom-control-input" id="customCheck">
                           <label class="custom-control-label" for="customCheck">Remember
                               Me</label>
                       </div>
                   </div>
                   <a href="index.html" class="btn btn-primary btn-user btn-block">
                       Login
                   </a>
                   <hr>
               </form>
               <hr>
               <div class="text-center">
                   <a class="small" href="forgot-password.html">Forgot Password?</a>
               </div>
               <div class="text-center">
                   <a class="small" href="register.html">Create an Account!</a>
               </div>
           </div>
       </div>
</div>
</body>
</html>
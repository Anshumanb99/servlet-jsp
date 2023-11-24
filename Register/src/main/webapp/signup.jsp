<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col m6 offset-m3">
<div class="card">
<div class="card-content">
<h3>Register here!!</h3>

<div class="form">
<form action="Register" method="post" id="myform">
<input name="user_name" type="text" placeholder="Enter user name">
<input name="user_password" type="password" placeholder="Enter user password">
<input name="user_email" type="email" placeholder="Enter user email">
<div class="file-field input-field">
      <div class="btn">
        <span>File</span>
        <input type="file">
      </div>
      <div class="file-path-wrapper">
        <input class="file-path validate" type="text">
      </div>
    </div>
<button type="submit" class="btn">Register</button>
</form>
</div>
<div class="loader center-align" style="display:none;">
  <div class="preloader-wrapper big active">
    <div class="spinner-layer spinner-blue-only">
      <div class="circle-clipper left">
        <div class="circle"></div>
      </div><div class="gap-patch">
        <div class="circle"></div>
      </div><div class="circle-clipper right">
        <div class="circle"></div>
      </div>
    </div>
  </div>
  <h5>Please wait</h5>

</div>
</div>

</div>
</div>
</div>

</div>

<script
  src="https://code.jquery.com/jquery-3.7.1.min.js"
  integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
  crossorigin="anonymous"></script>
  <script>
  $(document).ready(function(){
	  console.log("page is ready........");
	  
	  $("#myform").on("submit",function(event){
		  event.preventDefault();
		  var f=$(this).serialize();
		  console.log(f);
		  $(".loader").show();
		  $(".form").hide();
		  
		  $.ajax({
			  url:"Register",
			  data:f,
			  type:"POST",
			  success: function(data,textStatus,jqXHR){
				  console.log(data);
				  console.log("success....");
				  $(".loader").hide();
				  $(".form").show();
				  
			  },
			  error:function(jqXHR,textStatus,errorThrown){
				  console.log(data);
				  console.log("error....");
				  $(".loader").hide();
				  $(".form").show();
			  }
		  })
	  })

  })
  </script>
</body>
</html>
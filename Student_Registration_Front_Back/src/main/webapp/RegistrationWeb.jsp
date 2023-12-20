<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<link rel="stylesheet" href="StyleRegistrationWP.css">
</head>

<body>

	<section>
		<div class="Register-box">
			<form action="register" method="get">
				<h2>~ ~ Register ~ ~</h2>
				<div class="input-box">
					<input type="text" required minlength="1" name="id"> <label
						class="float">Student-Id</label>
				</div>
				<div class="input-box">
					<input type="text" required name="name"> <label
						class="float">Student Name</label>
				</div>
				<div class="input-box">
					<input type="email" name="email"> <label class="float">Email-Id</label>
				</div>
				<div class="input-box">
					<input type="tel" required name="phone"> <label
						class="float">Phone No.</label>
				</div>

				<div class="genderRadio">

					<label for="gender"> Gender </label> <br> <input type="radio"
						id="Male" name="gender" value="Male"> <label for="Male">Male</label>

					<input type="radio" id="Female" name="gender" value="Female">
					<label for="Female">Female</label> <input type="radio" id="Others"
						name="gender" value="Others"> <label for="Others">Others</label>
				</div>

				<button type="submit" value="register">Register</button>
		</div>
		</form>
		</div>
	</section>




</body>
</html>
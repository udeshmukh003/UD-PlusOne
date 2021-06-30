<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/colours.css">

<h1 id="t2">Registration Form</h1>

</head>

<body id="outer">

<div id="inner">
	
	<form action="reg">

		<!-- ID: <input type="number" name="id" placeholder="id"><br><br> -->
		
		Full Name: <input type="text" name="fname" placeholder="full name"><br><br> 
		
		Email Id : <input type="email" name="Email" placeholder="email"><br><br> 
		
		Mobile No: <input type="number" name="mobNo" placeholder="mobile no"><br><br> 
		
		Gender   :  <input type="radio" name="gender" value="male">male
					<input type="radio" name="gender" value="female">female
					<br><br>
	Upload Image:<input type="text" name="image" placeholder="upload"><br><br>	
		
					<p>date of birth</p>
					<select name="dob">
						<option value="" label="month" selected="selected">Select</option>
						<option>jan</option>
						<option>feb</option>
						<option>mar</option>
						<option>apr</option>
						<option>may</option>
						<option>jun</option>
						<option>jul</option>
						<option>aug</option>
						<option>sep</option>
						<option>oct</option>
						<option>nov</option>
						<option>dec</option>
					</select>
					<select name="dob">
						<option value="" label="day" selected="selected">Select</option>
						<option>1</option>       
						<option>2</option>       
						<option>3</option>       
						<option>4</option>       
						<option>5</option>       
						<option>6</option>       
						<option>7</option>       
						<option>8</option>       
						<option>9</option>       
						<option>10</option>       
						<option>11</option>       
						<option>12</option>       
						<option>13</option>       
						<option>14</option>       
						<option>15</option>       
						<option>16</option>       
						<option>17</option>       
						<option>18</option>       
						<option>19</option>       
						<option>20</option>       
						<option>21</option>       
						<option>22</option>       
						<option>23</option>       
						<option>24</option>       
						<option>25</option>       
						<option>26</option>       
						<option>27</option>       
						<option>28</option>       
						<option>29</option>       
						<option>30</option>       
						<option>31</option>       
					</select>
					<select name="dob">
						<option value="" label="year" selected="selected">Select</option>
						<option>1990</option>       
						<option>1991</option>       
						<option>1992</option>       
						<option>1993</option>       
						<option>1994</option>       
						<option>1995</option>       
						<option>1996</option>       
						<option>1997</option>       
						
					</select><br><br>
		
		Country Living in :<select name="country">
						    <option>India</option>
						    <option>Uk</option>
			                <option>China</option>
			                <option>Pakistan</option>
		                  </select> <br><br>
		
		Mother tongue :<input type="checkbox" name="lang" value="marathi">Marathi 
					   <input type="checkbox" name="lang" value="Hindi">Hindi 
		               <input type="checkbox" name="lang" value="English">English 
		               <br><br>
		
		UserName:-<input type="text" name="uname" placeholder="UserName"><br><br> 
		
		Password:-<input type="number" name="pass" placeholder="PassWord"><br><br>
		
		<div>
				<input type="submit" value="register">
		</div>

</form>
</div>

</body>
</html>
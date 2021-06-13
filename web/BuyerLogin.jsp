<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>
   <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">BUYERS LOGIN</label>
    
		<div class="login-form">
			<div class="sign-in-htm">
                            <form action="BuyersLogin" method="post">
				<div class="group">
					<label for="phn" class="label">Phone No.</label>
					<input id="uname" type="text" class="input" name="phn" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" name="pass" required>
				</div>
                              <div class="group">
                                  </br> </br> </br> </br>  <input type="submit" class="button" value="Sign In">
				</div>
                             </form>
                            <form method="post" action="index.jsp">
                                
                                   <div class="group">
                                 <input type="submit" class="button" value="BACK TO HOME PAGE">
				</div>
                                 </form>
                              
                </div>
        </div>
   </div>
</body>
</html>

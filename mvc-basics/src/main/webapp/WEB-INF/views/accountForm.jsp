<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Account</title>
</head>
<body>
<div class="container" style="margin-top: 10%; width: 30%">
    <h3>Enter account data</h3>
    <form method="post" action="/accounts">
        <div class="form-group">
            <input id="firstNameInput" name="firstName" type="text" class="form-control" placeholder="First name"/>
        </div>
        <div class="form-group">
            <input id="lastNameInput" name="lastName" type="text" class="form-control" placeholder="Last name"/>
        </div>
        <div class="form-group">
            <input id="emailInput" name="email" type="text" class="form-control" placeholder="Email"/>
        </div>
        <div class="form-group">
            <input id="birthday" name="birthday" type="date" class="form-control" placeholder="Birthday"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>

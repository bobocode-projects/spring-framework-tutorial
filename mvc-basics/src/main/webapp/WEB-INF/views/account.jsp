<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Account</title>
</head>
<body>

<div class="jumbotron">
    <h1 class="display-4">Account generator</h1>
    <p class="lead">This pages generates an account data for you.</p>
    <hr class="my-4">
    <p>${account.firstName} ${account.lastName}</p>
    <p>${account.email}</p>
    <p>${account.birthday}</p>
    <a class="btn btn-primary btn-lg" href="/accounts/generate" role="button">Generate</a>
</div>
</body>
</html>

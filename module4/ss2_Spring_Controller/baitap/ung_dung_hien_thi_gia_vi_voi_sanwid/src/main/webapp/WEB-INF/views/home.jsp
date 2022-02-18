<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/18/2022
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/save" method="post">
        <input class="form-check-input" type="checkbox" value="Lettuce" name="lettuce">
        <label>
            Lettuce
        </label>
        <input class="form-check-input" type="checkbox" value="Tomato" name="tomato">
        <label>
            Tomato
        </label>
        <input class="form-check-input" type="checkbox" value="Mustard" name="mustard">
        <label>
            Mustard
        </label>
        <input class="form-check-input" type="checkbox" value="Sprouts" name="sprouts">
        <label>
            Sprouts
        </label>
    <button type="submit">Save</button>
</form>
</body>
</html>

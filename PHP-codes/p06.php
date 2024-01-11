<html>
<head>
<title>ISSET & EMPTY</title>
</head>
<body>
<form action="p06.php" method="post">
<label>username:</label>
<input type="text" name="username"><br>
<label>password:</label>
<input type="password" name="password"><br>
<input type="submit" name="login" value="Log in"><br>
</form>
</body>
</html>

<?php

// isset()=returns TRUE if the variable is declared and not null
//         value can be true or false also

// empty()= returns TRUE if the variable is not declared and can be null
//          value can be true or false also
/*
$username="Manan";
if(isset($username))
{
    echo"this is user name";
}
else
{
    echo"this is not username";
}
*/

foreach($_POST as $key=>$value)
    {
        echo"{$key} = {$value} <br>";
    }

if(isset($_POST["login"]))
{
    $username=$_POST["username"];
    $password=$_POST["username"];

    if(empty($username))
    {
        echo"username is missing !<br>";
    }
    elseif(empty($username))
    {
        echo"password is missing!<br>";
    }
    else
    {
        echo"Hi {$username}<br>";
    }
}

?>
<?php
/* operator in php
1.Arithmetic operator
 + , - , * , / , %
2.Increment,Decrement operator
 ++,--
3.Operator precedence
 (),**,* , / , % , +, -

*/
echo"<h2>THIS IS THE POST METHOD </h2><br>";
if (isset($_POST["USERNAME"])) {
    // Sanitize the input to prevent potential XSS attacks
    $username = htmlspecialchars($_POST["USERNAME"]);
echo "{$_POST["USERNAME"]}<br>";
}

if (isset($_POST["email"])) {
    // Sanitize the input to prevent potential XSS attacks
    $username = htmlspecialchars($_POST["USERNAME"]);
echo "{$_POST["email"]}<br>";
}

?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
    </head>
    <body>
        <form action="p02.php" method="post">
        <label>USERNAME:</label><br>
        <input type="text" name="USERNAME"><br>
        <label>E-MAIL</label><br>
        <input type="email"><br>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>
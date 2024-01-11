<!DOCTYPE html>
<html>
<head>
    <title>RADIO BUTTONS IN PHP</title>
    <style>
         .red{
            background-color: #D6E8EE;
        }
        form {
            padding-left: 2cm;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            font-style: inherit;
            color: coral;
        }

        p {
            color: black;
        }
    </style>
</head>
<body >
    <div class="red">
<form action="p07.php" method="post">
    <p>CHOOSE YOUR FAVOURITE COUNTRY FROM THE BELOW</p>
    <input type="radio" name="one" value="America"> America<br>
    <input type="radio" name="one" value="England"> England<br>
    <input type="radio" name="one" value="Austria"> Austria<br>
    <input type="radio" name="one" value="Russia"> Russia<br>
    <input type="submit" name="confirm" value="confirm"><br>
</form>
    </div>
</body>
</html>

<?php
if(isset($_POST["confirm"]))
{
    $one = $_POST["one"];
    echo "You selected: $one";
}
elseif(isset($_POST["null"]))
{
    echo"you can't do this ";
}
else
{
    echo"please select a country";
}
?>



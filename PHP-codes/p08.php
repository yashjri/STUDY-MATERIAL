<html>
<head>
<title>CHECKBOX</title>
<style>
body
{
    background-image: url("pexels-moose-photos-1037992.jpg");
}

h2{
 font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
 color: chartreuse;
}
form
{
margin: auto;
}
</style>
</head>
<body>
<div class="me">
<h2>CHOOSE YOUR CAR FROM THE LIST</h2>
<form action="p08.php" method="post">
<label>CAR-NAME:</label><br>
<input type="checkbox" name="bmw" value="BMW">BMW<br>
<input type="checkbox" name="mercs" value="MERCS">MERCS<br>
<input type="checkbox" name="kazashi" value="KAZASHI">KAZASHI<br>
<input type="checkbox" name="ninja" value="NINJA">NINJA<br>
<input type="submit" name="submit">
</label>
</div>
</body>
</html>

<?php
if(isset($_POST["submit"]))
{
    if(isset($_POST["bmw"]))
    {
        echo"You got a BMW M5 hypersport<br>";
    }
    if(isset($_POST["mercs"]))
    {
        echo"You got a S600 Royale<br>";
    }
    if(isset($_POST["kazashi"]))
    {
        echo"Congrats you got a suzuki Kazashi<br>";
    }
    if(isset($_POST["ninja"]))
    {
        echo"You got a Ninja Kawasaki bike <br>";
    }
}
else
{
    if(empty($_POST["bmw"]))
    {
        echo"You got nothing else<br>";
    }
    if(empty($_POST["mercs"]))
    {
        echo"You got nothing else<br>";
    }
    if(empty($_POST["kazashi"]))
    {
        echo"You got nothing else<br>";
    }
    if(empty($_POST["ninja"]))
    {
        echo"You got nothing else<br>";
    }
}

?>
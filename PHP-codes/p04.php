<?php

$age=101;
if($age>=18)
{
    echo"you may enter the site<br>";
}
elseif($age>=50)
{
    echo"you are eligible to go through the site<br>";
}
else
{
   echo"you are not elgibile to go to site<br>";
}


$adult=false;
if($adult==true)
{
    echo"you can join the classes<br>";
}
else
{
   echo"you are not eligible to enter to classes<br>";
}

$temp=40;
if($temp>=40||$temp>=30)
{
    echo"this can be tolerate<br>";
}
else
{
    echo"this can not be tolerate<br>";
}

$grade="A";
switch($grade)
    {
        case "A": echo"YOU ARE GOOD IN MATHS<br>";
        break;
        case "B": echo"YOU ARE PERFECT IN MATHS<br>";
        break;
        default: echo"you have to be perfect in maths or atleast good<br>";
    }

$i=0;
for($i=0;$i<5;$i++)
    {
        echo"I AM FOR LOOP's STATEMENT<br>";
    }

$sec = 0;
$runtime = 10;
while ($sec < 9) 
{
    $sec++;
    echo"TIME--> ". $sec."<br>";
}

?>










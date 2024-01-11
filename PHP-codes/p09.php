<?php


function happy()
    {
        echo"WELCOME TO JURASSIC PARK<br>";
    }
happy();

$m1=100;
$m2=200;
function adds($m1,$m2)
    {
        global $m1,$m2;
        $sum=$m1+$m2;
        echo"The sum is -->$sum<br>"; 
    }
adds($m1,$m2);

$username="Manan chawla";
$phone="123-456-789";

$username=strtolower($username);
//$username=strtoupper($username);
//$username=trim($username);
//$username=str_pad($username,20,"0");
//$username=strt_replace("-","",$phone);
//$username=strrev($username);
//$username=str_shuffle($username);
$equals=strcmp($username,"MananChawla");
$count=strlen($phone);
$index=strpos($username,"-");

echo"$username<br>";
echo"$index<br>";
echo"$equals<br>";
echo"$count<br>";















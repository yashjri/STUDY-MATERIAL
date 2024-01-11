<?php
echo "<i>HYPER TEXT PREPROCESSOR REVISION (UNIT WISE)</i>"."<br>";
echo "<h3>UNIT 1 : introduction to PHP</h3>"."<br>";

// let's create variable in php as there are three types of variable in php 
// A. Local , B. Global , C. Static 

function Hi()
{
    $Var01="Hi i am local variable<br>";
    echo "$Var01";
}
Hi();

$m1=100;
$m2=200;


// we always have to remember that while using global variable we  need to declare them as global in 
// any function
function add()
{
    global $m1,$m2;
    $sum=$m1+$m2;
    echo"Sum of two variable which are declared as global are --> "."$sum"."<br>";
}

add();

static $s1=100;
$s=200;

function increase()
{
  global $s,$s1;
  $s++;
  echo"The global variable is incremented as it is not static-->"."$s"."<br>";
  echo"As static can't be increment so its value will be same --> "."$s1"."<br>";
}

increase();

print"we also use print method to display the output just like the echo method<br>";

// constant are those variable whose value can not be change again and for declaring we use this syntax:
// define("constant name","Value of constant");
define("Car", "Dodge");
echo "The value of constant Car is --> " . Car . "<br>";

/* Data type in php
 the main moto of data type is to define and handle what type of value is stored in it 
 for using any data type we use '$' sign and then data type's name in variable form 
 there are main three type of data type
 1.Pre defined data type :- Integer,String,Float,Double,String,Boolean
 2.User defined data type :- Array,Objects
 3.Special data type :-Resources,Null

 there is special inbuilt function var_dump() which is used to get to know about what type of value 
 a data type is holdingi.e data type
*/

$int=100;
$float=12.12;
$Bool="true";
$string="Manan";
$Double=123.1245;
$arr = array(12, 14, 15);

echo"Integer-->"."$int"."<br>";
echo"Float"."$float"."<br>";
echo"Boolean"."$Bool"."<br>";
echo"String"."$string"."<br>";
echo"Double"."$Double"."<br>";
echo"Array's value are as-->"."<br>";
for ($i = 0; $i < sizeof($arr); $i++) 
{
    echo $arr[$i] . "<br>";
}

?>
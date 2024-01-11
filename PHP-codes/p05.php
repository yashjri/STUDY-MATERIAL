<?php

$name=array("Manan","Mega Manan","Super Manan","Mahan Manan");
echo $name[0]."<br>";
echo $name[1]."<br>";
echo $name[2]."<br>";
echo $name[3]."<br>";
echo"------------------<br>";

/*
there are some method for adding element in the array
1. array_push(arrray_name,element name);
2. array_pop(arrayname);
3. array_shift(arrayname);
4. array_reverse(arrayname);
*/

array_push($name,"Nikita");
array_pop($name);
$name=array_reverse($name);


foreach($name as $name)
    {
        echo$name."<br>";
    }


echo"------------------<br>";

// this is an associative array
$country=array("USA"=>100,"Japan"=>200,"India"=>300,"South korea"=>400);
$country["England"] = 500;
foreach($country as $key=>$value)
    {
    echo"{$key} = {$value}<br>";
    }

echo"------------------<br>";








?>
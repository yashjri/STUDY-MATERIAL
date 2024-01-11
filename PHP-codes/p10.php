/*
cookie :-
         Information about a user stored in the 
         user's web browser targeted advertisments,
         browsing preference,and non sensitive data.
*/

<?php

setcookie("fav_car", "Mercedes", time() + (86400 * 4), "/");
setcookie("fav_person", "Nikki", time() + (86400 * 2), "/");
setcookie("fav_character", "Optimas Prime", time() + (86400 * 2), "/");

foreach($_COOKIE as $key => $value)
{
    echo"{$key} = {$value} <br>";
}
?>

<?php
// Start a session
session_start();
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session Program</title>
    <style>
        body {
            margin: 0; /* Remove default margin */
            padding: 0; /* Remove default padding */
        }
        .back {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-image: url("pexels-moose-photos-1037992.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            z-index: -1; /* Place it behind your content */
        }
        h1 {
            color: white; /* Add styles for text on top of the background */
        }
    </style>
</head>
<body>
    <div class="back"></div>
    <h1>THIS IS THE HOME PAGE</h1>
    <a href="p11.php">THIS IS THE WAY TO PHP</a>
</body>
</html>

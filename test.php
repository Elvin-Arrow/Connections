
<?php
$url = "localhost:3306\sakila";
$username = "root";
$password = "";
$conn = new mysqli($url, $username, $password);
if ($conn->connect_error)
  echo "Connection failed";
else
  echo "Connection established successfully";
?>
<html>
<body>
  <?php
  $result = $conn->query("select * from sakila.actor");
  while (($row = $result->fetch_assoc())) {
    echo $row['actor_id']." ".$row['first_name']." ".$row['last_name']." "."<br>";
  }
  ?>

</html>

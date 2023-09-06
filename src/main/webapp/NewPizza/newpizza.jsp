<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 06.09.2023
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    form {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      background-color: #f4f4f4;
      border: 1px solid #ddd;
      border-radius: 5px;
    }


    label {
      display: block;
      margin-bottom: 10px;
      font-weight: bold;
    }

    input[type="text"],
    select {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }


    select {
      appearance: none;
      -webkit-appearance: none;
      -moz-appearance: none;

      padding-right: 30px;
    }


    input[type="submit"] {
      background-color: #ff5722;
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 3px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #e64a19;
    }
    #toppings-container {
      margin-top: 10px;
    }


    #toppings-container label {
      display: block;
      margin-bottom: 5px;
    }

    #toppings-container input[type="checkbox"] {
      margin-right: 5px;
    }


    #toppings-container input[type="checkbox"]:checked + label {
      font-weight: bold;
      color: #ff5722; /* Колір для обраних топінгів */
    }
  </style>
</head>
<body>
<form action="../new-pizza" method="post">
  <label for="pizza">Назва піци:</label>
  <input type="text" name="pizza"><br>

  <div id="toppings-container">
    <label for="toppings">Виберіть топінги:</label>
    <input type="checkbox" name="toppings" value="Оливки">Оливки
    <input type="checkbox" name="toppings" value="Каперси">Каперси
    <input type="checkbox" name="toppings" value="Додатковий сир">Додатковий сир

  </div>
  <label for="name">Ім'я:</label>
  <input type="text" name="name"><br>

  <label for="phone">Телефон:</label>
  <input type="text" name="phone"><br>

  <label for="email">E-mail:</label>
  <input type="text" name="email"><br>

  <label for="address">Адреса доставки:</label>
  <select name="address">
    <option value="вул. Шевченка">вул. Шевченка</option>
    <option value="вул. Лесі Українки">вул. Лесі Українки</option>
    <option value="вул. Дружби">вул. Дружби</option>
    <option value="вул. Мира">вул. Мира</option>
  </select><br>

  <input type="submit" value="Замовити">
</form>
</body>
</html>

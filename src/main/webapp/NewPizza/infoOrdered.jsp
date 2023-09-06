<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 06.09.2023
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        h2 {
            color: #333;
        }

        p {
            color: #555;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
<div class="container">
<h2>Дякуємо за ваше замовлення!</h2>
<p>Ім'я: ${pizza.getName()}</p>
<p>Телефон: ${pizza.getPhone()}</p>
<p>Email: ${pizza.getEmail()}</p>
<p>Адреса доставки: ${street.getStreet()}</p>
<p>Піца:  ${pizzatop.getName()}</p>
<p>Топінги:  ${String.join(", ", pizzatop.getToppings())} </p>
</div>
</body>
</html>

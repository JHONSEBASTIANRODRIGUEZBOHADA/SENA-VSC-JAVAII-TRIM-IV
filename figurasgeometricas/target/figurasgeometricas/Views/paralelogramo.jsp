<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head lang="es-co">
        <title>PARALELOGRAMO</title>
        <link rel="icon" type="image/x-icon" href="_img/figurasgeometricas.png">
        <link rel="stylesheet" href="../Assets/style.css">
    </head>

    <body>
        <h1>PARALELOGRAMO</h1>
        <img src="../Assets/_img/paralelogramo.png" alt="trapezoide" width="500" height="370">
        <form>
            <div class="contenedor3">
                <h3>Área y perímetro</h3><br>
                <label for="área">a=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">b=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">h=</label>
                <input type="number" id="áreafig" pattern="[0-9]"><br><br>
                <label for="área">Àrea total=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">Perimetro total=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
            </div>
        </form>
        <br><br><br><a href="">Calcular</a> <a href="../index.jsp">Menú</a>
    </body>
</html>

<!--
    A= b*h
    P= 2(a+b)
-->
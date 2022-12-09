<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head lang="es-co">
        <title>OCTÁGONO</title>
        <link rel="icon" type="image/x-icon" href="_img/figurasgeometricas.png">
        <link rel="stylesheet" href="../Assets/style.css">
    </head>

    <body>
        <h1>OCTÁGONO</h1>
        <img src="../Assets/_img/octagono.jpg" alt="trapezoide" width="450" height="400">
        <form>
            <div class="contenedor4">
                <br><h3>Área y perímetro</h3><br>
                <label for="área">l=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">a=</label>
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
    P= 8*l
    apotema= ?
    A= p*apotema/2
-->
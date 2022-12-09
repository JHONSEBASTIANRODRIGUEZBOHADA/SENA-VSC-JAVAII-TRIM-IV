<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head lang="es-co">
        <title>TRAPECIO</title>
        <link rel="icon" type="image/x-icon" href="_img/figurasgeometricas.png">
        <link rel="stylesheet" href="../Assets/style.css">
    </head>
    
    <body>
        <h1>TRAPECIO</h1>
        <img src="../Assets/_img/trapezoide.png" alt="trapezoide" width="600" height="380">
        <form>
            <div class="contenedor2">
                <h3>Área y perímetro</h3>
                <label for="área">a=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">d=</label>
                <input type="number" id="áreafig" pattern="[0-9]"><br><br>
                <label for="área">b=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">c=</label>
                <input type="number" id="áreafig" pattern="[0-9]"><br><br>
                <label for="área">h=</label>
                <input type="number" id="áreafig" pattern="[0-9]"><br><br>
                <label for="área">Àrea total=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
                <label for="área">Perimetro total=</label>
                <input type="number" id="áreafig" pattern="[0-9]">
            </div>
        </form>
        <br><br><a href="">Calcular</a> <a href="../index.jsp">Menú</a>
    </body>
</html>

<!--
    A= (a+b)*h/2
    P= a+b+c+d
-->
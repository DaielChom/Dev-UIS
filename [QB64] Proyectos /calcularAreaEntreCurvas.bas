PRINT "Calcular el area entre f(x) = 5e^(-3x) y g(x) = (x-5)^2"
N = 100000
FOR I = 1 TO N
    X = 6 * RND REM 6 y 5 los puntos donde la funciones cortan los ejes y se empiezan a salir
    Y = 5 * RND
    IF (Y < ((5 * 2.71828) * EXP(-3 * X))) AND (Y > (X - 5) ^ 2) THEN F = F + 1
NEXT I
PRINT "Area: "; (F / N) * (5 * 6)

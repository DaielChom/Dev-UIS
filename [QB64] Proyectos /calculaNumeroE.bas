X = 1
dx = 0.0001
FOR I = 1 TO 100000
    AREA = AREA + (dx) * (1 / X)
    IF AREA > 1 THEN I = 100000
    X = X + dx
NEXT I
PRINT "El valor de e es:"; X

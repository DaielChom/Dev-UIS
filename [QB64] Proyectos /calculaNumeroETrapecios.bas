X = 1
dx = 0.0001
FOR I = 1 TO 1000000
    AREA = AREA + dx * ((1 / X) + 1 / (X + dx)) / 2
    IF AREA > 1 THEN I = 10000000
    X = X + dx
NEXT I
PRINT "e: ", X


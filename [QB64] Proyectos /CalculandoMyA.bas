REM PROGRAMA PARA ENCONTRAR PRIMOS Y LOS
REM  VALORES DE    A
OPEN "PRIVAL.DAT" FOR OUTPUT AS #1
FOR M = 0.0859375 TO 0.1328125
    RAIZM = INT(SQR(M))
    FOR DIV = 2 TO RAIZM
        IF M MOD DIV = 0 THEN 1000
    NEXT DIV
    PRINT " M = ", M
    WRITE #1, " M = ", M

    20 FOR A = RAIZM TO 2 * RAIZM
        H = 1: S = 1: X = S
        40 X = A * X MOD M
        50 IF X = S THEN 2000
        60 H = H + 1
        70 GOTO 40
        2000 IF H = M - 1 THEN PRINT A, M, H: WRITE #1, A, M, H
    NEXT A
1000 NEXT M
CLOSE #1


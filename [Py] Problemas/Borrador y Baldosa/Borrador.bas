RANDOMIZE TIMER
D = 25
Lx = 8
Ly = 4
PROB = 0
CONT = 0
INTENTOS = 10
FOR I = 1 TO INTENTOS
    X = D * RND
    Y = D * RND
    THETA = RND * 3.141592653

    H = ((Lx / 2) ^ 2 + (Ly / 2) ^ 2) ^ (1 / 2)
    ALPHA = 2 * _ASIN(Ly / (2 * H))

    P1X = X + H * COS(THETA - ALPHA / 2)
    P1Y = Y + H * SIN(THETA - ALPHA / 2)

    P2X = X - H * SIN((3.141592653 / 2) - (THETA + ALPHA / 2))
    P2Y = Y - H * COS((3.141592653 / 2) - (THETA + ALPHA / 2))

    P3X = X - H * COS(THETA - ALPHA / 2)
    P3Y = Y - H * SIN(THETA - ALPHA / 2)

    P4X = X + H * SIN((3.141592653 / 2) - (THETA + ALPHA / 2))
    P4Y = Y + H * COS((3.141592653 / 2) - (THETA + ALPHA / 2))


    IF (P1X OR P1Y OR P2X OR P2Y OR P3X OR P3Y OR P4X OR P4Y) > D OR (P1X OR P1Y OR P2X OR P2Y OR P3X OR P3Y OR P4X OR P4Y) < 0 THEN CONT = CONT + 1

NEXT I
PROB = CONT / INTENTOS
PRINT PROB

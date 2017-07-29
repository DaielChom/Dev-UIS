PI = 3.1416: D = 200: L = 120: N = 1000
FOR I = 1 TO N
    FI = RND * PI
    Y = RND*(D/2)
    IF Y < (L / 2) * SIN(FI) THEN F = F + 1
NEXT I
PROB = F / N
PRINT "La probabidad es:", PROB

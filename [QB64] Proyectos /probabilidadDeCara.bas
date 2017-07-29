
N = 10
FOR I = 1 TO N
    FOR J = 1 TO 9
        M = INT(RND * 2)
        IF M = 1 THEN J = 9
    NEXT J
    PRINT "Salio cara"
    IF J MOD 2 = 1 THEN F = F + 1
NEXT I
PRINT "Probabilidad Impar: ", F / N

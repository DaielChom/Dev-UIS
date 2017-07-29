M = 12011
X1 = 6251
X2 = 9234

FOR K = 1 TO 999
    A = (K * M + X2) / X1
    IF A = INT(A) THEN 1000
NEXT K
1000 PRINT A

function [] = ajustePotencia(X,Y,n,m)
sumXY=0;
sumX=0;
for i=1:1:n
    sumXY = sumXY + power(X(i),m)*Y(i);
    sumX = sumX+ power(X(i),2*m);
end
a = sumXY/sumX;
V=['la ecuacion de la regrasion es de la forma ',num2str(a),' x'];
disp(V);
end
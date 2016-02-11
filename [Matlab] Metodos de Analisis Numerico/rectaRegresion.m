function [] = rectaRegresion(X,Y,n)
sumX = 0;
sumXcua = 0;
sumY=0;
sumXY=0;
a=0;
b=0;
for i=1:1:n

    sumX = sumX+X(i);
    sumY = sumY + Y(i);
    sumXY = sumXY + X(i)*Y(i);
    sumXcua = sumXcua + (power(X(i),2));
    
end

A=[n,sumX;sumX,sumXcua];
B=[sumY,sumXY]';
G = inv(A)*B;
a=G(2);
b=G(1);
V=['la ecuacion de la regrasion es de la forma ',num2str(a),' x + ',num2str(b)];
disp(V);

end
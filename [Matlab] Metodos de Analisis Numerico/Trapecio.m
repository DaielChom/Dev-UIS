function [Tn] = Trapecio(b,a,M,f)
h=(b-a)/M;
suma=0;
x=0;
for i=1:1:M-1
    x= a+ i*h;
    suma = suma + feval(f,x);
    x=0;
end
Tn=(h/2)*(feval(f,a)+feval(f,b))+h*suma;
end
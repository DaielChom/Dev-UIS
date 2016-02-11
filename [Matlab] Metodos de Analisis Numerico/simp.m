function s=simp (f,a,b,M)
%datos
%  -f es el integrando, dado como una cadena de caracteres 'f'
%  -a y b son extremos inferior y superior del intervalo de integracion
%   -M es el numero de subintervalos

%Resultado
%-s es la aproximacion obtenida con la regla compuesta del trapecio
h=(b-a)/(2*M);
s1=0;
s2=0;

for k=1:M
    x=a+h*(2*k-1);
    s1=s1+feval(f,x);
end
for k=1:(M-1)
    x=a+(h*2*k);
    s2=s2+feval(f,x);
end
s=double(h*(feval(f,a)+feval(f,b)+ (4*s1)+(2*s2))/3);


end

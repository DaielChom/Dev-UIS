function [win] = metodoVectoresPropiosPageRan(B,n,m) % Metodo usando vectores y valores propios recibe 3 parametros la matriz de incidencia, el numero de nodos y el numero de iteraciones a realizar

[S,D] = eig(B);

for i = 1:1:n
V(i) = 1/n;   
end

Am=S*(D^m)*inv(S);
Vsig=Am*V';
g = (max(Vsig));
win = find(Vsig==g);

end
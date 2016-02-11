function [win] = metodoTradicionalPageRan(B,n) %Metodo tradicional recive dos parametros 
tic                                            %B es la matriz de incidenciab y n el numero de nodos
cont=0;                                        %y retorna el nodo mas referenciado.
ver=false;                                         
p=false;

for i = 1:1:n   
    V(i) = 1/n;
    for j=1:1:n
          if(ver==false)   
          for k=1:1:n
             
              if(B(k,i)==1)
                 cont = cont +1 ;  
              end
          end
          end
          ver = true;
          
       if(cont==0) cont=1; end
        r = B(j,i);
        B(j,i) =  r/cont;
                  
    end
    ver = false;
    cont = 0;
       
end
Vant=V';
Vsig = B*Vant

while(p==false)
 Vant = Vsig;
 Vsig = B*Vant;

if(Vsig-Vant<0.00001)
    p=true;
end
end
g = (max(Vsig));
win = find(Vsig==g);
toc
end

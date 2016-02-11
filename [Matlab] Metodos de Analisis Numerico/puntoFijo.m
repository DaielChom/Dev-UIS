function [p] = puntoFijo(numIter,tol,punIni)
i=1;
while(i<=numIter)
    %en este caso se usa la funcion g(x) = 1 + (2/x) puede ser cualquier
    %funcion
    p = feval (@(x) -power(x,2)+2*x+2,punIni);
    
    if(((p-punIni)/(punIni))*100<=tol)
       p;
    end  
   %en la ultima iteracion revise el porcentaje de erro si es mas grande
   %que el 50% no encontro la raiz
    if(((p-punIni)/(punIni))*100>50 && i==numIter)
       p='no';
      
       break;
    end   
 
    i=i+1;
    punIni = p;
end
end
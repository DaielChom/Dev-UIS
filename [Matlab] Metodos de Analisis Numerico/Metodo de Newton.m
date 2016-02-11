function [p] = newton(po,tol,nIte)
i=1;
while(i<=nIte)
    %f y f' se rempalzan por las funciones a analisar
    p = po - ((power(po,2)-po-3)/(2*po-1));
    X=['p',num2str(i),':',num2str(p)];
    disp(X)
    
    if((abs(p-po)/abs(po))*100<tol)
       p
        break;
    end
    if((abs(p-po)/abs(po))*100>tol && i==nIte)
       p = 'no';
       break;    
    end
    i=i+1;
    po = p;    
end
end
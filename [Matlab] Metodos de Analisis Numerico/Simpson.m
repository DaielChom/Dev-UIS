function Sn = Simpson(b,a,m,f)
h=(b-a)/2*m;
sumaUno=0;
sumaDos=0;


for i=1:(m-1)
    
    x=a+2*i*h;   
    sumaUno = sumaUno + feval(f,x);
     
end
for i=1:m
    x = a+(2*i-1)*h;
    sumaDos = sumaDos + feval(f,x); 
    
end

Sn = (h/3)*((feval(f,a)+feval(f,b))+(2*sumaUno)+(4*sumaDos));
end
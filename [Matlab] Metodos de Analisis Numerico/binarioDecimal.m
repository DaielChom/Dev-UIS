function dec = binarioDecimal(B)
dec=0;
p=0;
for i = lenght(B):1:-1
    dec = dec + (B(i)*power(2,p));
    p=p+1;     
end
end
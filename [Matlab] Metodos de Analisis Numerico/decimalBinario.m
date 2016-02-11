function BIN = decimalBinario(dec)
i=1;
m=1;
while(dec>=1)
aux2 = fix(mod(dec,2));
dec=fix(dec/2);
BINRE(i) = aux2;
i=i+1;
end

for i=length(BINRE):-1:1
BIN(m)=BINRE(i);
m=m+1;
end
end
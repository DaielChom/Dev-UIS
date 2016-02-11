function X=gauss(A,B,P,delta, max1)

N = length(B);

for k=1:max1
   for j=1:N
      Y(j)= P(j);
      X(j)=(B(j)-A(j,[1:j-1,j+1:N])*P([1:j-1,j+1:N]))/A(j,j);
      P(j) = X(j);
      end
   
   err=abs(norm(X-Y));
   
   relerr=err/(norm(X)+eps);
   P=X';
      if (relerr<delta)
          disp('converge')
      break
      end
      if(relerr*100>100)
       disp('Diverge')
      break
      end
end

X=X';
end
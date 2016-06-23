function g = sigmoid(z)
%SIGMOID Compute sigmoid functoon
%   J = SIGMOID(z) computes the sigmoid of z.

% You need to return the following variables correctly 
g = zeros(size(z));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the sigmoid of each value of z (z can be a matrix,
%               vector or scalar).
k = size(z)
dimensions = ndims(z);
if gt(dimensions,1)
   for i = 1:k(1)
       for j = 1:k(2)
            temp = z(i,j);
            temp1 = (1 / (1 + exp(-temp)))
            g(i,j) = temp1
       end
   end
else
    for i = 1:k(1)
        temp = z(i)
        temp1 = (1 / (1 + exp(-temp)))
        g(i) = temp1
    end
end

% =============================================================

end


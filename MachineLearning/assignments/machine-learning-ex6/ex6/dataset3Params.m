function [C, sigma] = dataset3Params(X, y, Xval, yval)
%EX6PARAMS returns your choice of C and sigma for Part 3 of the exercise
%where you select the optimal (C, sigma) learning parameters to use for SVM
%with RBF kernel
%   [C, sigma] = EX6PARAMS(X, y, Xval, yval) returns your choice of C and 
%   sigma. You should complete this function to return the optimal C and 
%   sigma based on a cross-validation set.
%

% You need to return the following variables correctly.
C = 1;
sigma = 0.3;

% ====================== YOUR CODE HERE ======================
% Instructions: Fill in this function to return the optimal C and sigma
%               learning parameters found using the cross validation set.
%               You can use svmPredict to predict the labels on the cross
%               validation set. For example, 
%                   predictions = svmPredict(model, Xval);
%               will return the predictions on the cross validation set.
%
%  Note: You can compute the prediction error using 
%        mean(double(predictions ~= yval))
%
steps = [ 0.01 0.03 0.1 0.3 1 3 10 30 ];
temp_c = 0;
temp_sigma = 0;
min_error = inf
best_c = 0;
best_sigma = 0;
for i = 1:length(steps)
    for j = 1:length(steps)
        temp_c = steps(i);
        temp_sigma = steps(j);
        predictions = svmPredict(svmTrain(X, y, temp_c, ...
            @(x1, x2) gaussianKernel(x1, x2, temp_sigma)),Xval);
        error = mean(double(predictions ~= yval));
        if error < min_error
            min_error = error;
            best_c = temp_c;
            best_sigma = temp_sigma;
        end
    end 
end
        
C = best_c;
sigma = best_sigma;

% =========================================================================

end

var app = angular.module('demo', []);
app.controller('patientCtrl', function($scope, $http) {
    $http.get('/patients')
        .success(function(data, status, headers, config) {
            console.log("fasdf");
			$scope.patients = data;
        })
        .error(function(data, status, headers, config) {
            console.log("fsdf");
        });
});
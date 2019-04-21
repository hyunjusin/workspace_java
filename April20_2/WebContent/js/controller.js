var myApp = angular.module('myApp', []);

//alert("test");

	function AppCtrl($scope){
		$scope.name = 'World';
	}
	
	
	app.controller('MainCtrl', function ($scope) {
		  $scope.title = 'Some title';
	});
	
	
	app.controller('MainCtrl2', function ($scope) {
		  this.title = 'Some title2';
	});
	
	

	myApp.controller('MainCtrl3', ['$scope', function ($scope) {
	    
	    $scope.name = 'Hello, Angular fanatic.';
	    
	}]);
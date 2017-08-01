var app=angular.module('myapp', []);
app.controller('cartController', ['$scope', function ($scope) {
$scope.products=[
{
product_id:1,
product_name:"iphone 6",
product_discription:"BODY Dimensions : 143.5 x 71 x 7.5 mm (5.65 x 2.80 x 0.30 in)",
product_price:60000
},
{
product_id:2,
product_name:"iphone 7",
product_discription:"BODY Dimensions : 143.5 x 71 x 7.5 mm (5.65 x 2.80 x 0.30 in)",
product_price:70000
},
{
product_id:3,
product_name:"iphone 8",
product_discription:"BODY Dimensions : 143.5 x 71 x 7.5 mm (5.65 x 2.80 x 0.30 in)",
product_price:80000
}
];
$scope.cart=[];
$scope.sendIndex=function(productIndex){
alert(productIndex);
};
}]);
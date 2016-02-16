(function(angular){
    'use strict';

    var module = angular.module('candidatesCheck',[]);


    module.controller('CandidatesListCtrl',function($scope){
        $scope.candidates = [
            {
                name:'Иван',
                surname:'Иванов'
            },
            {
                name:'Петр',
                surname:'Петров'
            },
            {
                name:'Василий',
                surname:'Васичкин'
            }
        ];
    });
})(angular);
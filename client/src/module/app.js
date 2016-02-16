(function(angular){
    'use strict';

    var module = angular.module('candidatesCheck',[]);


    module.controller('CandidatesListCtrl',function($scope, candidatesService){
        candidatesService.getAll().then(function (candidates) {
            $scope.candidates = candidates;
        });


        $scope.add = function(){
            if (angular.isDefined($scope.name) && angular.isDefined($scope.surname)){
                candidatesService.add($scope.surname,$scope.name).then(function (result) {
                    $scope.candidates.push(result);
                });
            }
        }
    });

    module.factory('candidatesService',function($q,$timeout){
        var candidates = [
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
        return {
            getAll:function(){
                var deferred = $q.defer();
                $timeout(function () {
                    deferred.resolve(candidates);
                },1000);
                return deferred.promise;
            },
            add:function(surname,name){
                var deferred = $q.defer();
                $timeout(function () {
                    deferred.resolve({
                        name:name,
                        surname:surname
                    });
                },1000);
                return deferred.promise;
            }
        }
    });
})(angular);
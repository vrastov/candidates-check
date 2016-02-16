(function(angular){
    'use strict';

    var module = angular.module('candidatesCheck',[]);


    module.controller('CandidatesListCtrl',function($scope, candidateService){
        candidateService.getAll().then(function (candidates) {
            $scope.candidates = candidates;
        });


        $scope.add = function(){
            if (angular.isDefined($scope.name) && angular.isDefined($scope.surname)){
                candidateService.add($scope.surname,$scope.name).then(function (result) {
                    $scope.candidates.push(result);
                });
            }
        }
    });

    module.factory('candidateService',function($http, $q, $timeout){
        return {
            getAll:function(){
                return $http.get('/candidate').then(function (result) {
                    return result.data;
                });
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
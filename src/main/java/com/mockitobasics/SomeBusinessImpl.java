package com.mockitobasics;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){
        int greatest = Integer.MIN_VALUE;

        int[] data = this.dataService.retrieveAllData();

        for (int value:data){
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}

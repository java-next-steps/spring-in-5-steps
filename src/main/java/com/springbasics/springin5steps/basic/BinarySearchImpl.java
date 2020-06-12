package com.springbasics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Qualifier("bubblesort")
    @Autowired
    private SortAlgorithm sortAlgorithm;

//    //Auto-wiring by constructor
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        //Binary search depends on the sort algorithm.
//        this.bubbleSortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // Implementing sorting algorithm(bubble or insertion or selection)
        int[] result = this.sortAlgorithm.sort(numbers);
        System.out.println(this.sortAlgorithm);

        // Search the array
        return 3;
    }
}

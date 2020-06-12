package com.springbasics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
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

    //After bean construction, this method is invoked.
    @PostConstruct
    public void postConstruct(){
        LOGGER.info("BinarySearchImpl PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("BinarySearchImpl preDestroy");
    }
}

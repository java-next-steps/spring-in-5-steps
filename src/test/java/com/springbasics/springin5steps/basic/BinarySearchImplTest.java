package com.springbasics.springin5steps.basic;

import com.springbasics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
@ExtendWith(SpringExtension.class)
class BinarySearchImplTest {

    //Get this from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenerio(){
        int result = this.binarySearch.binarySearch(new int[]{1,2,3,4,5},5);
        assertEquals(3,result);
    }
}
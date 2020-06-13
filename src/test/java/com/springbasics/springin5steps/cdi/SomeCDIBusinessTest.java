package com.springbasics.springin5steps.cdi;

import com.springbasics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//Using Mockito
@ExtendWith(MockitoExtension.class)
class SomeCDIBusinessTest {
    //Get this from the context
    @InjectMocks
    SomeCDIBusiness business;

    //Mock dependency
    @Mock
    SomeCDIDAO daoMock;

    @Test
    public void testBasicScenerio(){
        when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = this.business.findGreatest();
        assertEquals(4,result);
    }

    @Test
    public void testBasicScenerio_WithEqualElements(){
        when(daoMock.getData()).thenReturn(new int[]{2,2});
        int result = this.business.findGreatest();
        assertEquals(2,result);
    }
}


//Using Spring
//@ContextConfiguration(classes= SpringIn5StepsBasicApplication.class)
//@ExtendWith(SpringExtension.class)
//class SomeCDIBusinessTest {
//    //Get this from the context
//    @Autowired
//    SomeCDIBusiness business;
//
//    @Test
//    public void testBasicScenerio(){
//        int result = this.business.findGreatest();
//        assertEquals(100,result);
//    }
//}
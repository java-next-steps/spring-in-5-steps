package com.springbasics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
}

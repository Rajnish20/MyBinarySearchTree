package com.magic.datastructuretest;

import com.magic.datastructures.MyBST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class BSTTest {

    @Test
    public void given3Numbers_WhenAddedToBST_ShouldReturnSizeThree() {
        MyBST<Integer> myBST = new MyBST<>();
        myBST.addNodes(56);
        myBST.addNodes(30);
        myBST.addNodes(70);
        int size = myBST.getSize();
        Assertions.assertEquals(3, size);
    }



}

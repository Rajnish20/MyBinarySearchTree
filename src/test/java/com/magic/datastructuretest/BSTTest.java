package com.magic.datastructuretest;

import com.magic.datastructures.MyBST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @Test
    public void given13Numbers_WhenAddedToBST_ShouldReturnSizeThirteen() {
        MyBST<Integer> myBST = new MyBST<>();
        myBST.addNodes(56);
        myBST.addNodes(30);
        myBST.addNodes(70);
        myBST.addNodes(40);
        myBST.addNodes(22);
        myBST.addNodes(11);
        myBST.addNodes(3);
        myBST.addNodes(16);
        myBST.addNodes(60);
        myBST.addNodes(65);
        myBST.addNodes(95);
        myBST.addNodes(63);
        myBST.addNodes(67);
        int size = myBST.getSize();
        Assertions.assertEquals(13, size);
    }



}

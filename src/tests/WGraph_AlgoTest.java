package tests;

import ex1.WGraph_Algo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WGraph_AlgoTest {

    @Test
    public void distTest(){
        WGraph_Algo wg=new WGraph_Algo();
        if(wg.shortestPathDist(2,5)!=-1)
            fail("u cant search number that not on the graph");
        wg.getGraph().addNode(3);
        if(wg.shortestPathDist(3,3)!=0)
            fail("its not return the right number in the case we send equals values");
        wg.getGraph().addNode(5);
        wg.getGraph().addNode(1);
        wg.getGraph().addNode(2);
        wg.getGraph().addNode(18);
        wg.getGraph().addNode(4);
        wg.getGraph().addNode(10);
        wg.getGraph().addNode(9);
        wg.getGraph().connect(1,3,1);
        wg.getGraph().connect(3,2,2);
        wg.getGraph().connect(3,5,8);
        wg.getGraph().connect(3,18,2);
        wg.getGraph().connect(2,5,3);
        wg.getGraph().connect(18,5,30);
        wg.getGraph().connect(18,4,4);
        wg.getGraph().connect(18,10,2);
        wg.getGraph().connect(10,9,2);
        wg.getGraph().connect(10,4,1);
        if(wg.shortestPathDist(1,9)!=7)
            fail("shortestPathDist not work properly");
    }
}
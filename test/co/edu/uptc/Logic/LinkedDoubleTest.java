package co.edu.uptc.Logic;

import co.edu.uptc.Model.VideoBeam;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedDoubleTest {
    private LinkedDouble<VideoBeam> list;

    void setup() {
        list = new LinkedDouble<>((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));
        list.addNodeFirst(new VideoBeam(5, "Hp", "hp100", 100, false, false));
    }

    @Test
    public void isEmpty() {
        setup();
        assertEquals(1,list.getSize());
    }

    @Test
    public void addNodeFirst() {
        setup();
        assertEquals(1, list.getSize());

    }

    @Test
    public void addNodeLast() {
    }

    @Test
    public void addNodeBeforeTo() {
    }

    @Test
    public void addNodeAfterTo() {
    }

    @Test
    public void addNodeSorted() {
    }

    @Test
    public void findNode() {
    }

    @Test
    public void findInfo() {
    }

    @Test
    public void getLinkedList() {
    }

    @Test
    public void deleteNode() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void getObject() {
    }
}
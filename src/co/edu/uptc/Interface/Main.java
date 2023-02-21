package co.edu.uptc.Interface;

import co.edu.uptc.Interface.GraphicsMain;
import co.edu.uptc.Logic.LinkedDouble;
import co.edu.uptc.Logic.Node;
import co.edu.uptc.Model.VideoBeam;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        GraphicsMain gM = new GraphicsMain();

        /*LinkedDouble<VideoBeam> ld = new LinkedDouble<>((o1, o2)-> Integer.compare(o1.getId(), o2.getId()));


        ld.addNodeFirst(new VideoBeam(1, "Hp", "hp1000", 500, false, true));
        ld.addNodeLast(new VideoBeam(3, "Azus", "As500", 200, true, false));
        ld.addNodeLast(new VideoBeam(4, "lenovo", "ln5285", 300, true, true));
        ld.addNodeLast(new VideoBeam(6, "Sony", "sn254", 250, false, false));
        ld.addNodeLast(new VideoBeam(8, "Samsung", "sm253", 350, true , false));

        ld.addNodeBeforeTo(ld.findNode(new VideoBeam(3, null, null, 0, false, false)), new VideoBeam(2, "Xiaomi", "xia2", 100, true, true));
        ld.addNodeAfterTo(ld.findNode(new VideoBeam(4, null, null, 0, false, false)), new VideoBeam(5,"Challenger", "Cha111", 50, false, false));
        ld.addNodeAfterTo(ld.findNode(new VideoBeam(6, null, null , 0,false, false)), new VideoBeam(7, "Yorman", "Yor", 1000, true, true));
        System.out.println( ld.getLinkedList(false));
        System.out.println(ld.deleteNode(ld.findNode(new VideoBeam(3, null, null, 0, false, false))));
        System.out.println( ld.getLinkedList(false));
        System.out.println(ld.getObject(15));*/
    }
}
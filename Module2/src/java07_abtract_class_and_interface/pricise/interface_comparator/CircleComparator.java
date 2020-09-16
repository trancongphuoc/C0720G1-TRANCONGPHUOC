package java07_abtract_class_and_interface.pricise.interface_comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}


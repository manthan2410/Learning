package org.example;

import java.util.Comparator;

public class emailComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}

package com.nnt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainPeople {
    public static void main(String[] args) {
        List<Nguoi> nguoiList = new ArrayList<>();
        nguoiList.add(new Nguoi(1, "Nguyen Van A", 20));
        nguoiList.add(new Nguoi(2, "Do Van  B", 21));
        nguoiList.add(new Nguoi(3, "Pham Van C", 25));

        System.out.println(nguoiList);
        // Sắp xếp theo ABC...
        Collections.sort(nguoiList, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                // return 1 tương đương >
                // return 0 bằng nhau: ko sắp xếp, giữ nguyên vị trí
                // retur -1 tương đương <
                if (o1.hoTen.charAt(0) < o2.hoTen.charAt(0)) {
                    return -1;
                } else if (o1.hoTen.charAt(0) == o2.hoTen.charAt(0)) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println(nguoiList);

        // Sắp xếp tuổi....
    }
}

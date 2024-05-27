package org.burakcimtay;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        // Key Value

        Map mapList = new HashMap();
        mapList.put(null, null);
        mapList.put("İstanbul","34");
        mapList.put("Ankara","06");
        mapList.put("Çanakkale", null);
        mapList.put("İzmir","35");
        mapList.put("Konya","42");

        System.out.println("HashMap: " + mapList);

        System.out.println("--------------------------");

        Map mapList2 = new LinkedHashMap();
        mapList2.put(null, null);
        mapList2.put("İstanbul","34");
        mapList2.put("Ankara","06");
        mapList2.put("Çanakkale", null);
        mapList2.put("İzmir","35");
        mapList2.put("Konya","42");

        System.out.println("LinkedHashMap: " + mapList2);

        System.out.println("--------------------------");

        Map<String, String> mapList3 = new TreeMap();
        //mapList3.put(null, null); Key null olamaz!!!!
        mapList3.put("İstanbul","34");
        mapList3.put("Ankara","06");
        mapList3.put("Çanakkale", null);
        mapList3.put("İzmir","35");
        mapList3.put("Adana", "01");
        mapList3.put("Konya","42");

        System.out.println("TreeMap: " + mapList3);

        for (String keys : mapList3.keySet()){
            System.out.println(keys);
        }

    }
}

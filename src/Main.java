import models.TransportModel;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Double> doubleList = new ArrayList<Double>();

        doubleList.add(1.0);
        doubleList.add(1d);

        System.out.println("Double list" + doubleList);

        List<Integer> integerListTwo = new ArrayList<Integer>();

        List<Boolean> booleanList = new ArrayList<Boolean>();


        int[][] multyArray = new int[10][10];

        multyArray[0][0] = 10;
        multyArray[0][1] = 20;

        System.out.println("multy array = " + Arrays.toString(multyArray));

        ArrayList<String> oneMoreList = new ArrayList<String>();
        oneMoreList.add("Avazsho");

        if (!oneMoreList.isEmpty()) {
            System.out.println("array is not emtpy");
        } else {
            System.out.println("array is not emtpy");
        }

        ///
        ///
        ///
        //classes

        TransportModel transportModel = new TransportModel(10, 10, "green", new byte[]{1, 2, 3, 4});
        transportModel.printTransport();
        Map<String, String> map = new HashMap<>();

        map.put("speed", "1.5");
        TransportModel transportModel1 = new TransportModel(map);
        transportModel1.printTransport();
    }


    public static String personName(String name) {
        return name;
    }

    private static int doSomeThing(ArrayList<Integer> integerList, int number) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.indexOf(i) == number) {
                return number;
            }
        }
        return 0;
    }
}
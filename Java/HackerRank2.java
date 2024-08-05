/*
///TODO: Question
A warehouse manager needs to create a shipment to fill a truck.
All of the products in the warehouse are in boxes of the same size.
Each product is packed in some number of units per box.
Given number of boxes the truck can hold, determine the maximum number of units of any mix of products that can be shipped.

///TODO: Example
boxes = [1,2,3]
unitsPerBox = [3,2,1]
truckSize = 3

The maximum number of units that can be shipped is 3+2+2 = 7 units.

    Product 0
    1 box with 3 Units --> {**[3]**}

    Product 1
    2 boxes with 2 units each --> {**[2] [2]**}

    Product 2
    3 boxes with 1 unit each --> [1] [1] [1]

    The Maximum number of units that can be shipped = 3+2+2 = 7

///TODO: Function Description
Complete the Function getMaxUnits in the editor below

getMaxUnits has the following parameters:

    long boxes[n]: a long integer array where boxes[i] denotes the number of boxes product i that are available.
    long unitsPerBox[n]: a long integer array where unitsPerBox[i] denotes the number of units of product i that are packed in each box of size boxes[i]
    long truckSize: a long integer that denotes the number of boxes the truck can carry.

Returns:
    long: a long integer that denotes the maximum units that can be carried by the truck

///TODO: Constraints
    * 1 <= |boxes| <= 10^5
    * |boxes| == |unitsPerBox|
    * 1 <= boxes[i] <= 10^7
    * 1<= unitsPerBox[i] <= 10^5
    * 1<= truckSize <= 10^8
Note: |array name| denotes length of the array

///TODO: Input Format for Custom Testing
The first line contains an integer "n" the size of boxes.
Each  of the following "n" lines contains a long integer describing the number of boxes of product "i" that are available, boxes[i] (where 0<=i<n).
The next line again contains the integer "n" that denotes the size of the unitsPerBox array. Each of the following "n" lines contains a long integer that describes the number of units per box for each product "i", unitsPerBox[i].
The last line contains a long integer, truckSize, that denotes the number of boxes the truck can carry.

///TODO: Sample case 0
Sample Input

Standard Input --> 1,1,1,2,1

    1 --> boxes[] size n = 1
    1 --> boxes = [1]
    1 --> unitsPerBox[] size n = 1
    2 --> unitsPerBox = [2]
    1 --> truckSize = 1

Sample Output = 2

    Explanation

    Inputs:
    Product 0
    1 box with 2 unit --> {**[2]**}

    The maximum number of units that can be shipped = 2 units

    * There is only n = 1 product. There is 2 box available with 2 units of the product. The truck can carry 1 box, so a maximum 2 units can be shipped.


///TODO: Sample case 1
Sample Input

Standard Input --> 2,1,1,2,9,6,1

    2 --> boxes[] size n = 2
    1 --> boxes = [1,1]
    1
    2 --> unitsPerBox[] size n = 2
    9 --> unitsPerBox = [9,6]
    6
    1 --> truckSize = 1

Sample Output = 9

    Explanation
    Inputs:
    Product 0
    1 box with 9 unit --> {**[9]**}

    Product 1
    1 box with 6 unit --> [6]

    The maximum number of units that can be shipped = 9 units

    * There are n=2 products. Only 1 box will fit on the truck, so the box with 9 units is shipped.

///TODO: Sample case 2
Sample Input

Standard Input --> 3,3,1,6,3,2,7,4,6

    3 --> boxes[] size n = 3
    3 --> boxes = [3,1,6]
    1
    6
    3 --> unitsPerBox[] size n = 3
    2 --> unitsPerBox = [2,7,4]
    7
    4
    6 --> truckSize = 6

Sample Output = 27

    Explanation
    Inputs:
    Product 0
    3 box with 2 unit each --> [2] [2] [2]

    Product 1
    1 box with 7 unit --> {**[7]**}

    Product 2
    6 box with 4 unit each --> {**[4] [4] [4] [4] [4]**} [4]

    The maximum number of units that can be shipped = 7 + (5*4) = 27 units

    * Take 1 box of 7 units and 5 boxes of 4 units per box: 7+ (5*4) = 27.

* */

import java.io.*;
import java.util.*;



class Result2 {

    /*
     * Complete the 'getMaxUnits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY boxes
     *  2. LONG_INTEGER_ARRAY unitsPerBox
     *  3. LONG_INTEGER truckSize
     */

    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        List<long[]> boxUnitPairs = new ArrayList<>();
        for (int i = 0; i < boxes.size(); i++) {
            boxUnitPairs.add(new long[] {unitsPerBox.get(i), boxes.get(i)});
        }

        long unitCount = 0;
        int boxCount = 0;

        for (int i = 0; i < boxes.size(); i++) {
            long[] pair = boxUnitPairs.get(i);

            for (int j = 0; j < pair[1]; j++) {
                if(boxCount<truckSize) {
                    unitCount = unitCount + pair[j];
                    boxCount++;
                }
            }
        }

        return unitCount;

    }

}

public class HackerRank2 {
    public static void main(String[] args) throws IOException {
        List<Integer> boxes = new ArrayList<>();
        boxes.add(1);
        boxes.add(2);
        boxes.add(3);
        List<Long> boxesList = new ArrayList<>();

        List<Integer> unitsPerBox = new ArrayList<>();
        unitsPerBox.add(3);
        unitsPerBox.add(2);
        unitsPerBox.add(1);
        List<Long> unitsPerBoxList = new ArrayList<>();

        long truckSize = 3;

        //Converting List<Integer> to List<Long>
        for (Integer i : boxes) {
            boxesList.add(i.longValue());
        }
        
        //Converting List<Integer> to List<Long>
        for (Integer i : unitsPerBox) {
            unitsPerBoxList.add(i.longValue());
        }

        long result = Result2.getMaxUnits(boxesList, unitsPerBoxList, truckSize);

        System.out.println("Result is : "+ result);
    }
}

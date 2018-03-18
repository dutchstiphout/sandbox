package net.stiphout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {

    ArrayList<ArrayList> argArrays = new ArrayList<>();
    ArrayList<Object> resArray = new ArrayList<>();
    ArrayList<Object> anArgList;

    // TODO Really need to figure out how PROPERLY do testing. This crap is kluged...

    // Custom code for passing an array of integers and getting back a boolean
    anArgList = new ArrayList<>();
    anArgList.add(new ArrayList<>(Arrays.asList(1,2,7,1)));
    resArray.add(true);
    argArrays.add(anArgList);

    // Custom code for passing two strings and getting back a boolean
    /*
    anArgList = new ArrayList<>();
    anArgList.add("abcabc");
    anArgList.add("xyzxyz");
    resArray.add(true);
    argArray.add(anArgList);
     */

    Iterator<ArrayList> argCallsIter = argArrays.iterator();
    Iterator retValsIter = resArray.iterator();

    while (argCallsIter.hasNext() && retValsIter.hasNext()) {
      ArrayList oneArgArray = argCallsIter.next();
      Object expectedResult = retValsIter.next();
      Object result = worker(oneArgArray );
      if (result.equals(expectedResult )) {
        // Passed the test!
        System.out.println("Check!");
      } else {
        // Something's wrong...
        System.out.println("Uh-oh... Wanted " + expectedResult.toString() + " but got "
            + result.toString() + " for input " + oneArgArray .toString());
      }
    }
  }
  private static Object worker(ArrayList args) {
    Iterator argIter = args.iterator();

    // Custom code for passing in an int[] in "nums"
    ArrayList arg1 = (ArrayList)argIter.next();
    Iterator arg1Iter = arg1.iterator();
    int[] nums = new int[arg1.size()];
    int arg1Counter=0;
    while(arg1Iter.hasNext()) {
      nums[arg1Counter++]=(int)arg1Iter.next();
    }

    // Custom code for passing in two Strings in "a" and "b"
    /*
    String a = (String)argIter.next();
    String b = (String)argIter.next();
     */

    /*
    The actual code starts below...
     */

    // Warmup-2 > has271
    boolean has271 = false;
    for (int i=0;i<nums.length-2;i++) {
      if (nums[i+1]==nums[i]+5 && ( nums[i+2]>=nums[i]-3 && nums[i+2]<=nums[i]+1 ) ) {
        has271=true;
      }
    }
    return has271;
  }


}

package net.stiphout;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {

    ArrayList<ArrayList> argArray = new ArrayList<>();
    ArrayList<Object> resArray = new ArrayList<>();
    ArrayList<Object> anArgList;

    anArgList = new ArrayList<>();
    int[] a = {1,2,7,1};
    anArgList.add(a);
    resArray.add(true);
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    int[] b = {1,2,8,1};
    anArgList.add(b);
    resArray.add(false);
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    int[] c = {2,7,1};
    anArgList.add(c);
    resArray.add(true);
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    int[] d = {2,7,4};
    anArgList.add(d);
    resArray.add(false);
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    int[] e = {2,7,-2};
    anArgList.add(e);
    resArray.add(false);
    argArray.add(anArgList);

    Iterator<ArrayList> ait = argArray.iterator();
    Iterator rit = resArray.iterator();

    while (ait.hasNext() && rit.hasNext()) {
      Object result = worker(ait.next());
      if (result.equals(rit.next())) {
        System.out.println("Check!");
      } else {
        System.out.println("Uh-oh...");
      }
    }
  }
  private static Object worker(ArrayList args) {
    Iterator ai = args.iterator();
    int[] nums = (int[])ai.next();

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

package net.stiphout;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {

    ArrayList<ArrayList> argArray = new ArrayList<>();
    ArrayList<Object> resArray = new ArrayList<>();
    ArrayList<Object> anArgList;

    anArgList = new ArrayList<>();
    anArgList.add("kitten");
    resArray.add("kien");
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    anArgList.add("Chocolate");
    resArray.add("Chole");
    argArray.add(anArgList);

    anArgList = new ArrayList<>();
    anArgList.add("ThisThatTheOther");
    resArray.add("ThThThth");
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
    String str = (String)ai.next();

    StringBuilder retVal = new StringBuilder();
    for (int i=0;i<str.length();i+=(i%2==0)?1:3) {
      retVal.append(str.charAt(i));
    }
    return retVal.toString();
  }


}

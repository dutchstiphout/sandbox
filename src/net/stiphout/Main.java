package net.stiphout;

public class Main {
  public static void main(String[] args) {

    if (worker("Chocolate",2).equals("ChoCho")) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }
    if (worker("Chocolate",3).equals("ChoChoCho")) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }
    if (worker("abc",3).equals("abcabcabc")) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }
    if (worker("",3).equals("")) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }

  }
  private static String worker(String str, int n) {
    String retVal = "";
    for (int i=0;i<n;i++) retVal = retVal.concat(str.substring(0, Math.min(3, str.length())));
    return retVal;
  }


}

package net.stiphout;

public class Main {
  public static void main(String[] args) {

    if (worker("abcxx")==1) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }
    if (worker("xxx")==2) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }
    if (worker("xxxx")==3) { System.out.println("Check!"); } else { System.out.println("Fuck!"); }

  }
  private static int worker(String str) {
    int occurences = 0;
    char[] ca = str.toCharArray();
    for (int i = 0; i<ca.length-1;i++) {
      if (ca[i]=='x' && ca[i+1]=='x') {
        occurences++;
      }
    }
    return  occurences;
  }


}

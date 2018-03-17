package net.stiphout;

public class Main {
  public static void main(String[] args) {

    assert mixStart("mix snacks");
    assert mixStart("pix snacks");
    assert !mixStart("piz snacks");

  }
  private static boolean mixStart(String str) {
    return (str.substring(0,2).matches(".ix"));
  }


}

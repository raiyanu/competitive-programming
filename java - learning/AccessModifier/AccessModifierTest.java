package AccessModifier;

import AccessModifier2.AccessModifierInherit;

public class AccessModifierTest extends AccessModifierInherit{
  public static void main(String[] args) {
    // AccessModifierInherit inherit = new AccessModifierInherit();
  AccessModifierTest This = new AccessModifierTest();
    System.out.println(This.noModifierMessage);
    try {
      int i =0;
      int y =2;
      @SuppressWarnings("unused")
      int z = y/i;
    } catch (ArithmeticException  e) {
      System.out.println("Very bad Error !!!!");
    }

  }
}

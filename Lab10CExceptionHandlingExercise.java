class Lab10CExceptionHandlingExercise {
  public static void main(String[] args) {
    String[] s = {"abc", "123", null, "xyz"};
    for (int i = 0; i < 6; i++) {
      try {
        int a = s[i].length() + Integer.parseInt(s[i]);
        System.out.println(a);
      // } catch(NumberFormatException ex) {
      //   ex.printStackTrace();
      // } catch (ArrayIndexOutOfBoundsException ex) {
      //   System.out.println(":///");
      //   System.out.println(ex.toString());
      // } catch (NullPointerException ex) {
      //   ex.printStackTrace();

      // } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException exc) {
      //   System.out.println("all exceptions caught! for now it is: " + exc);

      } catch (Exception exc) {
        System.out.println("all exceptions caught! for now it is: " + exc);
      }
      // finally {
      //   System.out.println("finally executed \n");
      // }
    }
	}
}

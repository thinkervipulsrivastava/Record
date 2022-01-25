public class abc {
    public static void main (String [] args) throws abcException {
    try {
        /*if ((1/ 0) == 0) {
            throw new abcException();
          // System.out.print("sds");
        }*/


    }catch (ArithmeticException e) {
        throw  new abcException("Arithmetic");
    }
    catch (Exception e) {
        throw new abcException(e.getMessage());
    }
    }
}

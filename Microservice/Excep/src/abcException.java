public class abcException extends Exception {
    private String abcd;
    public abcException() {
        super ();
    }

    public String getAbcd (String abcd) {
        return abcd;
    }
    public abcException (String abcd) {
        super(abcd);
        this.abcd = abcd;
    }
}

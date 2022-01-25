public class Loop {
    public static void main (String [] args) {
    long startTime = System.currentTimeMillis();
    long endTime = 0;

    for(int i=0; i < 1000000; i++) {
    int a = 5;
    a ++;
        //Something

    }

    endTime = System.currentTimeMillis();

    long timeneeded =  ((startTime - endTime) /1000);
    System.out.print(timeneeded);
}
}


// Java Program to Open Input URL in 
// System Default Browser in Windows

import java.awt.Desktop;
import java.io.*;
import java.net.URI;

class GFG {
    public static void main(String[] args)
            throws Exception
    {
        Desktop desk = Desktop.getDesktop();

        // now we enter our URL that we want to open in our
        // default browser
        char a = 'a';
        char b = 'b';
        char c = 'a';
        char d = 'a';
        char e = 'a';
        char f = 'c';
        for (int i = 0; i < 24; i++) {
             desk.browse(new URI("http://ibb.co/" + a + b + c + d + e + f ));
            ++a;
            ++b;
            ++c;
            ++d;
            ++e;
            ++ f;
            System.out.println ("http://ibb.co/" + a + b + c + d + e);
        }




    }
}
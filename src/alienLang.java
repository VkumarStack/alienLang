//******************************************************************************
//  Generates an alien language, consisting of random words in the form of
//  "blurbs".
//******************************************************************************
public class alienLang
{
    //-----------------------------------------------------
    //  Prints out a single blurb.
    //-----------------------------------------------------
    public static void main(String[] args)
    {
        blurb();
    } // end method main

    //-----------------------------------------------------
    //  Prints out a blurb, which consists of a single
    //  whoozit and a random number of whatzits.
    //-----------------------------------------------------
    public static void blurb()
    {
        whoozit();
        whatzit((int)((Math.random() * 10) + 1));
    } // end method blurb

    //-----------------------------------------------------
    //  Prints out a single whoozit, consisting of the
    //  letter 'x' followed by a random amount of the
    //  letter 'y'.
    //-----------------------------------------------------
    public static void whoozit()
    {
        System.out.print("x");
        for (int i = 0; i < (int)(Math.random() * 10); i++)
        {
            System.out.print("y");
        } // end for
    } // end method whoozit

    //-----------------------------------------------------
    //  Prints out a specified number of whatzits,
    //  consisting of the letter 'q' followed by either
    //  'z' or 'd' and a singular whoozit.
    //-----------------------------------------------------
    public static void whatzit(int numWhatzits)
    {
        if (numWhatzits > 0)
        {
            System.out.print("q");
            if ((int) (Math.random() * 2) == 0)
            {
                System.out.print("z");
            } // end inner if
            else
            {
                System.out.print("d");
            } // end else
            whoozit();
            whatzit(numWhatzits - 1); // recursive call
        } // end outer if
    } // end method whatzit
} // end class alienLang

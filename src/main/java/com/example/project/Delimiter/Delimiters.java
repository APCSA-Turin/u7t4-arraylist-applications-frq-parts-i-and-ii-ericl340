package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> res = new ArrayList<String>();
        for (String s : tokens) {
            if (openDel.equals(s)) {
                res.add(openDel);
            }else if (closeDel.equals(s)) {
                res.add(closeDel);
            }
        }
        return res;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int c = 0;
        for (String s : delimiters) {
            if (openDel.equals(s)) {
                c++;
            }else if (closeDel.equals(s)) {
                c--;
            }
            if (c < 0) {
                return false;
            }
        }
        return true;
    }
}

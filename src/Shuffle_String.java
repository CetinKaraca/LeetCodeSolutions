/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
 */

public class Shuffle_String {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] c = new char[n];

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            c[indices[i]]=ch;
        }

        return new String(c);
    }
}

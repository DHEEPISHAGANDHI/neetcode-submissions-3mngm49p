class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int c=0;
        // int[] arr=new int[30];
        // for(int i=0;i<s.length();i++)
        // {
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }
        // for(int c: arr)
        // {
        //     if(c!=0)
        //     return false;
        // }
        // return true;
        char[] arr= s.toCharArray();
        char[] arr1=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr1[i])
            c++;
        }
        if(c==arr.length) 
        return true;
        else 
        return false;
    }
}

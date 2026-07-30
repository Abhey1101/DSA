class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                cnt++;
            }
        }
        if((cnt==word.length())||(cnt==0)||(cnt==1&&Character.isUpperCase(word.charAt(0)))) return true;

        return false;
    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder ans = new StringBuilder("");
        StringBuilder ans2 = new StringBuilder("");
        for(int i = 0; i < my_string.length(); i++){
            char tmp = my_string.charAt(i);
            if(tmp >= 'A' && tmp <= 'Z'){
                tmp += 'a' - 'A';
                ans.append(tmp);
                continue;
            }
            ans.append(tmp);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            char tmp = ans.charAt(i);
            for(int j = i; j < my_string.length(); j++){
                if(tmp > ans.charAt(j)){
                    tmp = ans.charAt(j);
                    ans.deleteCharAt(j);
                    ans.insert(i,tmp);
                }
            }
            ans2.append(tmp);
        }
        answer = ans2.toString();
        return answer;
    }
}
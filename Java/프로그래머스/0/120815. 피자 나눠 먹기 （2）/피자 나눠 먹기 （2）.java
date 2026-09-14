class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        for(int i = 1; i < n; i++){
            if((pizza * 6) % n == 0) break;
            pizza++;
        }
        answer = pizza;
        return answer;
    }
}
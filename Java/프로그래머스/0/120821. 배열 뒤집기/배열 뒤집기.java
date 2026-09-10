class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        for(int i = 0; i <= num_list.length / 2; i++){
            int tmp;
            
            tmp = num_list[i];
            num_list[i] = num_list[num_list.length - i - 1];
            num_list[num_list.length - i - 1] = tmp;
            
        }
        answer = num_list;
        return answer;
    }
}
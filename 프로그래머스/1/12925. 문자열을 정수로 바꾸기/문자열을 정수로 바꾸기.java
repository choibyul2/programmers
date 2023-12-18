class Solution {
    public int solution(String s) {

        int answer = 0;
        
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
            answer = num;
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
            
        return answer;
    }
}
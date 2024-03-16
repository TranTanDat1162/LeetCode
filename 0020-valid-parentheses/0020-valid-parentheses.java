class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
        {
            if (c == '(' || c =='[' || c =='{')
            {
                stack.add(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{'))
                {
                    return false;
                }
            }
        }
        
        // Chỗ này nghĩa là nếu stack còn ký tự nào là sai luôn
        // Bởi vì nếu còn thì chuỗi ban đầu vẫn còn đang trạng thái mở
        return stack.isEmpty();
        // if (stack.isEmpty())
        //     return true;
        // return false;
    }
}
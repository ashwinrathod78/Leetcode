class Solution {

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] inputArray = s.trim().split(" ");
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if(inputArray[i].equals(""))
                continue;
            if (i == 0)
                sb.append(inputArray[i]);
            else
                sb.append(inputArray[i] + " ");
        }
        return sb.toString();
    }
}

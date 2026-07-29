class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        if (strs.size() == 0) {
            return "";
        }
        for (int i = 0; i < strs.size(); i++) {
            int n = strs.get(i).length();
            sb.append(n);
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }
    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+len));
            i = j + 1 + len;
        }
        return list;
    }
}
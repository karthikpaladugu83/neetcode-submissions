class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return "";
        }
        String str = "";
        for (int i = 0; i < strs.size(); i++) {
            int n = strs.get(i).length();
            str += n + "#" + strs.get(i);
        }
        return str;
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
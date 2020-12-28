class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            StringBuilder sb = new StringBuilder("");
            int[] count = new int[26];
            Arrays.fill(count,0);
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                sb.append((char)count[i]);
            }
            String res = sb.toString();
            List<String> ls;
            if(hm.containsKey(res))
                ls = hm.get(res);
            else
                ls = new ArrayList<>();
            ls.add(s);
            hm.put(res, ls);
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(Map.Entry m:hm.entrySet()){
            res.add((List<String>)m.getValue());
        }
        return res;
    }
}

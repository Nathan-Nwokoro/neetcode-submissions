class MyHashMap {
    ArrayList<Integer> keys = new ArrayList<>();
    ArrayList<Integer> values = new ArrayList<>();
 
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if (!keys.contains(key)){
            keys.add(key);
            values.add(value);
        } else {
            int index = keys.indexOf(key);
            values.set(index, value);
        }
    }
    
    public int get(int key) {
        if (keys.contains(key)){
            int index = keys.indexOf(key);
            return values.get(index);
        } else return -1;
    }
    
    public void remove(int key) {
        if(keys.contains(key)){
            int index = keys.indexOf(key);
            keys.remove(Integer.valueOf(key));
            int val = values.get(index);
            values.remove(Integer.valueOf(val));
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
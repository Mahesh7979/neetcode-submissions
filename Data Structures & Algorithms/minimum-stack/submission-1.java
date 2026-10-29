class MinStack {
       public ArrayList<Integer> ls;

    public MinStack() {
        ls = new ArrayList<>();
    }
    
    public void push(int val) {
        ls.add(val);
    }
    
    public void pop() {
        ls.remove(ls.size()-1);
    }
    
    public int top() {
        return ls.get(ls.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int a : ls){
            min = min < a ? min : a;
        }
        return min;
        
    }
}

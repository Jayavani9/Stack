//https://www.geeksforgeeks.org/problems/sort-a-stack/1


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        //Tc: O(n^2) Sc: O(n)
        int[] arr = new int[100000];
        
        while(!s.isEmpty())
        {
            arr[s.pop()]++;
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                for(int j = 0; j < arr[i]; j++)
                {
                    s.push(i);
                }
            }
        }
        return s;
    }
}

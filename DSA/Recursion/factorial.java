import java.util.Arrays;

public class factorial {


    public static int pairingProb(int n){
        int totalways = 0;
        if(n == 1){
            return n;
        }
        if(n == 2){
            return n;
        }

        //single
        totalways = pairingProb(n-1) + ((n-1) * pairingProb(n-2));
        return totalways;

    }

    public static void removeDup(String str, int idx, StringBuilder newstr, boolean map[])
    {
        if(idx == str.length()){
            System.out.print(newstr);
            return;
        }
        char currchar = str.charAt(idx);

        if(map[str.charAt(idx) - 'a'] == true){
            removeDup(str, idx+1, newstr, map);
        }
        else{
            map[currchar -'a'] = true;
            removeDup(str, idx+1, newstr.append(currchar), map);

        }
    }

    public static int tiling(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        int fnm1 =  tiling(n-1);
        int fnm2 = tiling(n-2);

        int ways = fnm1 + fnm2;
        return ways;
    }

    public static int power(int x, int n)
    {
        int pwr = 1;
        if(n == 0)
        {
            return 1;
        }
        pwr = x * power(x, n-1);
        return pwr;
    }

    public static int findrev(int arr[], int key, int i)
    {
        if (arr[i] == key)
        {
            return i;
        }

        if(i == 0)
        {
            return -1;
        }
        return findrev(arr, key, i-1);
    }



    public static int find(int arr[], int key, int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if (arr[i] == key)
        {
            return i;
        }
        return find(arr, key, i+1);
    }

    static boolean sorted(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return sorted(arr, i+1);
    }

    static int fibo(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        int fib = fibo(n-1) + fibo (n-2);
        return fib;
    }

    static int sumn(int n)
    {
        int sum = 0;
        if(n == 0 )
        { 
            return 0;
        }
        sum = n + sumn(n-1);
        return sum;
    }

    static int facto(int  n)
    {
        int fac = 1;
        if(n == 1)
        {
            return fac;
        }
        fac = n * facto(n-1);
        return fac;
    }

    public static void que1(int arr[], int key, int n, StringBuilder str){
        if(n == arr.length-1){
            System.out.print(str);
            return;
        }
        if(arr[n] == key){
            que1(arr, key, n+1, str.append(n + " "));
        }
        else{
            que1(arr, key, n+1, str);
        }
    }

    public static void que2(int no){
        String words[] = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"}; 
        if(no == 0)
        {
            return;
        }
        int lastdigit = no%10;
        que2(no/10);
        System.out.print(words[lastdigit] + " ");
    }

    public static void mergesort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si +(ei - si)/2;
        //left
        mergesort(arr, si, mid);
        //right
        mergesort(arr, mid+1, ei);
        //sort
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while( i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                j++; k++;
            }
        }

        //for left over elements in first half
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for left over elements in second half
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; k < temp.length ; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx-1);      //left part
        quicksort(arr, pidx+1, ei);    //right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
    
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
    
        return i;
    }

    public static int search(int arr[],int tar, int si, int ei) {
        int mid = si + (ei - si)/2;
        if (si > ei) {
            return -1;
        }

        if (arr[mid] == tar) {
            return mid;
        }

        //mid lies on L1
        if (arr[si] <= arr[mid]) {
            //target on left side
            if(tar < arr[mid] && tar > arr[si]) {
                return search(arr, tar, si, mid-1);
            }
            //target on right side
            else {
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid lies on L2
        else {
            if(tar > arr[mid] && tar < arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }

            //
            else {
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void mrgsort(String ary[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;

        mrgsort(ary, si, mid); //left

        mrgsort(ary, mid+1, ei); //right

        mrg(ary, si, ei, mid);
    }

    public static void mrg(String ary[], int si, int ei, int mid) {
        String[] tempo = new String[ei - si + 1];
    
        int i = si;
        int j = mid + 1;
        int k = 0;
    
        while (i <= mid && j <= ei) {
            String str1 = ary[i];
            String str2 = ary[j];
            if (str1.charAt(0) < str2.charAt(0)) {
                tempo[k] = str1;
                i++;
            } else {
                tempo[k] = str2;
                j++;
            }
            k++;
        }
    
        // Copy the remaining elements from the first half
        while (i <= mid) {
            tempo[k] = ary[i];
            i++;
            k++;
        }
    
        // Copy the remaining elements from the second half
        while (j <= ei) {
            tempo[k] = ary[j];
            j++;
            k++;
        }
    
        // Copy elements from tempo back to ary
        for (k = 0, i = si; k < tempo.length; k++, i++) {
            ary[i] = tempo[k];
        }
    }

    public static void majnum(int arr[], int si, int ei) {

        int[] majtrack = new int [219];
        for(int i = 0; i < arr.length; i++) {
            majtrack[110 + arr[i]]++;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 3, 6, 9, 8, 1};
        String[] ary = new String[]{"mars" , "moon", "sun", "earth", "anus", "zebra"};
        //System.out.print(facto(5));
        //System.out.print(sumn(5));
        //System.out.print(fibo(25));
        //System.out.print(sorted(arr, 0));
        //System.out.print(find(arr, 7, 0));
        //System.out.print(findrev(arr, 3, 0));
        // System.out.print(power(2, 10));
        //System.out.print(tiling(5));
        String stri = "appnnacollege";
        //removeDup(stri, 0, new StringBuilder(""), new boolean[26]);
        //System.out.print(pairingProb(4));
         StringBuilder str = new StringBuilder();
        //que1(arr, 3, 0, str);
        //que2(2019);
        //mergesort(arr, 0 , arr.length-1);
        //quicksort(arr, 0, arr.length-1);
        backarr(arr, 0);
        for(int i=0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // int arridx = search(arr, 10, 0, arr.length-1);;
        // System.out.println(arridx);

        // mrgsort(ary, 0 , ary.length-1);
        // for (int i = 0; i < ary.length; i++) {
        //     System.out.print(ary[i] + " ");
            // majnum(arr, 0, arr.length-1);
            // for(int i = 0; i < majtrack.length; i++) {
            //     System.out.println(majtrack[i] + " ");
            // }

    }
}

public class Binary {
    int binarySearch(int[] a, int ele, int lb, int ub)
    {
        int mid=(lb+ub)/2;
        if(lb>ub)
           return mid;
         if(ele==a[mid])
            return mid;
        else if(ele<a[mid])
            return binarySearch(a, ele, mid-1, ub);
        else
            return binarySearch(a, ele, lb, mid+1);
    }

    public static void main(String[] args) {
        Binary ob=new Binary();
        int a[]={1,2,3,4,5,6,7,8,9,10,14,77,100,101,122,1,444};
        int n=a.length;
        int ele=14;
        int result= ob.binarySearch(a,0,n-1,ele);
        if(result==-1)
            System.out.println("not found");
        else
            System.out.println("found at="+result);

    }
}

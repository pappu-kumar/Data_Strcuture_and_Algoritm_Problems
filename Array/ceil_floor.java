public class ceil_floor {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};

        int low=0;
        int high=arr.length-1;
        int ceil=0,floor=0;
        int data = 25;

        while(low <= high){
            int mid = (low+high)/2;
            if(data < arr[mid]){
                high = mid-1; ceil = arr[mid];
            }
            else if(data > arr[mid]){
                low = mid+1; floor = arr[mid];
            }else{
                ceil = floor = arr[mid];
                break;
            }
        }
        System.out.println("floor & ceil value of "+data + ": "+floor+" "+ceil);

    }
    
}

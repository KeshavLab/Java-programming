//sortings techniques
//bubble sort
//insertion sort
//selection sort

public class sortings {

    public static void pritArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        // Bubble Sort  78312  hame assending order me sort karana hai
        // bubble sort me sabase bada element ko  arr me sabase piche shift karate hai

        // defining the array
//        int arr[]={7 , 8 , 3 , 1 , 2};
//
//        //bubble sort
//        for(int i=0; i< arr.length-1;i++){

        // elements ko compare karane ke liye
//            for(int j=0; j< arr.length-i-1;j++){
//                // If the left element is greater, we swap it with the right element.
                  // This makes the larger values "bubble" to the right.
//                if(arr[j]>arr[j+1]){
//
//                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//           pritArray(arr);  // agar apako stepwise answer  chahiye to bas yaha per function ko call karo
//
//        }
//        pritArray(arr);


        // selection sort
        // arr me sabase small element nikalate haiaur  usko sabase age dal dete hai
        // one swap for one iteration

        // defining the array
//        int arr[]= {7,8,3,1,2};
//
//        //selection sort
//        for(int i=0; i< arr.length-1;i++){
//
//            int smallest=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//
//                }
//            }
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//
//            // pritArray(arr); step wise answer cahiye to yaha function likho
//        }
//        pritArray(arr); // direct sorted array cahiye to yaha function likho



        //  insertion sort 78312
        // ham array ko two parts me divide karate hai "sorted" and "Unsorted"
        //ham unsorted array me se 1 element uthate hai aur usako usake sahi jagah sorted array me shift kar dete hai
        // isliye jo sorted array bada hota jata hai and unsorted array size small hota jata hai
        // to hum 7 ko sorted array manenge and 8312 ko unsorted array manenge

        //defining  the array
        int arr[]={7,8,3,1,2};

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;

        }
        pritArray(arr);




    }
}

import java.util.*;
public class Array_DSA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] arr=new int[5];
//        int sum=0;
//        for(int i=0; i<5;i++ ){
//            arr[i]=sc.nextInt();
//            sum+=arr[i];
//        }
//        if (sum%2==0){
//            System.out.println("Even NO");
//        }
//        else {
//            System.out.println("Odd NO");
//        }
//    }

//    public static void main(String[] args) {
//        int [] arr = {16,17,4,8,5,1,2};
//        int[] ans = new int[7];
//        int j=0;
//        int curr_max=arr[arr.length-1];
//        for (int i=arr.length-1;i>=0;i--){
//           if (arr[i]>=curr_max){
//               curr_max=arr[i];
//               ans[j]=curr_max;
//               j++;
//           }
//        }
//        for(int k=0;k<j;k++)
//            System.out.print(ans[k]+ "  ");



    //}

//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,7,10};
//        int flag=0;
//        int t=15;
//        int l=0,r=arr.length-1;
//        while (l<r){
//            int sum=arr[l]+arr[r];
//            if (sum==t){
//                flag=1;
//                break ;
//            }
//            if(sum<t) l++;
//            else r--;
//        }
//        if(flag==1) System.out.println("Pair exist");
//        else System.out.println("pair Not exist");
//    }

//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,7,10};
//        int k=4;
//        int sum=0;
//        for(int i=0;i<k;i++){
//            sum+=arr[i];
//        }
//        int max=sum;
//        for (int i =k; i<arr.length;i++){
//            sum+=arr[i];
//            sum-=arr[i-k];
//            if (sum>max) max=sum;
//        }
//        System.out.println("maximum sum is "+max);
//
//    }

//     public static void main(String[] args) {
//         int[] arr = {1, 7, 3, 6, 5, 6};
//         int[] left = new int[6];
//         int[] right = new int[6];
//         int curr_sum = 0, ans = -1;
//         for (int i = 0; i < arr.length; i++) {
//             curr_sum += arr[i];
//             left[i] = curr_sum;
//         }
//         curr_sum = 0;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             curr_sum += arr[i];
//             right[i] = curr_sum;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (left[i] == right[i]) {
//                 ans = i;
//                 break;
//             }
//         }
//         System.out.println(ans);
//     }



  public static void main(String[] args) {
        int [] arr={2,1,0,1,2,0,0,1,1};
        int l =0,m=0,h=arr.length-1;
        while(m <= h){
            if (arr[m]==0){
                arr[m]=arr[l];
                arr[l]=0;
                m+=1;
                l+=1;
            }
            else if (arr[m]==2){
                arr[m]=arr[h];
                arr[h]=2;
                h-=1;
            }
            else{
                m+=1;
            }
        }
    }
    

 }



package code;



//Recursively
//fast algorithm

public class MergeSort {


    public static void main(String[] args)
    {
        int[] arr={100,9,9,9,0,2,0,38,27,43,82,10};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for (int i : arr) {
            System.out.println(i);
            
        }


    }

    static void mergeSort(int arr[],int s,int e){

        if(s>=e){
            return;
        }

        int mid=(s+e)/2;

        //left part sort karna hai
        mergeSort(arr, s, mid);
        //right part sort karna hai
        mergeSort(arr, mid+1, e);

        //merge

        merge(arr,s,e);
    }

    static void merge(int[] arr,int s,int e){


        int mid= (s+e)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int first[]=new int[len1];
        int[] second=new int[len2];

        int mainArrayIndex=s;
        for(int i=0;i<len1;i++){
            first[i]=arr[mainArrayIndex++];

        }
        
        mainArrayIndex=mid+1;
        for(int i=0;i<len2;i++){
            second[i]=arr[mainArrayIndex++];

        }
        //merge

        int index1=0;
        int index2=0;

        //merge two sorted arrays
        mainArrayIndex=s;
        while(index1< len1 && index2<len2)
        {

            if(first[index1]<second[index2])
            {

                arr[mainArrayIndex++]=first[index1++];
            }
            else{
                arr[mainArrayIndex++]=second[index2++];
            }
        }

        while(index1<len1){
            
            arr[mainArrayIndex++]=first[index1++];
        }

        while(index2<len2){
            
            arr[mainArrayIndex++]=second[index2++];
        }







    }
    
}

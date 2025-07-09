import java.util.*;
// merge sort
public static void devide(int arr[],int si,int ei){
if (si>=ei){
    return;
}
int mid=si(si-ei)/2
devide (arr,si,mid);
devide (arr,mid+1,ei);
devide (arr,si,mid,ei);
}
public static void conquer(int arr[],int si,int mid,int ei){
    int merged= int[ei-si+1];
    int idx1 =si;
    int idx2 =mid +1;
    int x =0; 
    while (idx1 <= mid && idx2 <= ei){
        if (arr[idx1]<= arr[idx2]){
            merged[x++]=arr [idx1++]
            else(merged[x++]=arr[idx2++]){

            }
        }
    }
    while (idx1<= mid ){
        merged[x++]=arr [idx1++]
    }
    while(idx2<=ei){
        merged[x++]=arr[idx2++]
    }
    for (i=0;j=si;i,merged.length;i++;j++){
        arr[j]=merged[i];
    }
public static void main(String[]args){
    int n = arr.length;
    int arr[] ={5,2,73,9,1};
    devide (arr,0,n-1);
    for (i=0;i<n;i++){
        System.out.println(arr[i]+" ");
        System.out.println();
    }
}}
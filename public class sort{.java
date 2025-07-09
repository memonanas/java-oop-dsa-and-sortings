public class sort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
    }
    public static void main (String[]args){
        //selection sort
int arr[]={2,4,75,3,9};
for(int i=0;i<arr.length;i++){
    int smallest= i;
for(int j=i+1;j<arr.length;j++){
    if ( arr[j]<arr[smallest]){
        arr[smallest]= j ;
    }
}

int temp = arr[smallest];
arr[smallest]=arr[i];
arr[i]=temp;
}
printArray(arr);   
}
}
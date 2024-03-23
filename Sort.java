public class Sort{
    public static void main(String[] args) {
        int a[]={1,2,3,10,4,89,23,15};
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<a.length;i++) System.out.println(a[i]);
        
    }
}


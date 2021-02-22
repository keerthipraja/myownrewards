import org.omg.Messaging.SyncScopeHelper;

public class ForLoop {
    public static void main(String[] args) {
        int i;
        for ( i = 0;i<=100;i++)
        {
            System.out.println(i);
        }
        for(i=0;i<=100;i++)
        {
            if (i%5==0)
         {
             System.out.println("divisible by 5"+" "+i);
         }
        }
    }
}


class Computer
{
    public void PlayMusic()

    {
        System.out.println("Music Playing");
    }


    public String getMeApen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";    
    }



}

public class classs 
{
     public static void main (String a[])
     {
        

        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMeApen(2);
        System.out.println(str);


     }
}
    


public class record
{
    @Override
    public String toString(){
    String s= String.format("[%s] %s: %d\n",time,login,score);
    return s;

}
    public String login;
    public int score;
    public String time;


}

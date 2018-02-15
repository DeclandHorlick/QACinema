public class Tickets
{
    public int StandardTicketAmount(int amount)
    {
       int standardTickPrice = amount * 8;
       return standardTickPrice;
    }
    public int OAPTicketAmount(int amount)
    {
        int oAPTickPrice = amount * 6;
        return oAPTickPrice;
    }
    public int StudentTicketAmount(int amount)
    {
        int studentTickPrice = amount * 6;
        return studentTickPrice;
    }
    public int ChildTicketAmount(int amount)
    {
        int childTickPrice = amount * 4;
        return childTickPrice;
    }
}


public class Youtube{
    public static void main(String[] args) {
        Channel youtubechannel=new Channel();
        Subscriber s1=new Subscriber("Pradip Chapagain");
        Subscriber s2= new Subscriber("Sunita Adhikari");


        youtubechannel.Subscribe(s1);
        youtubechannel.Subscribe(s2);

        s1.SubscribeChannel(youtubechannel);
        s2.SubscribeChannel(youtubechannel);



        youtubechannel.upload("Title of the youtube Video");
    }
}
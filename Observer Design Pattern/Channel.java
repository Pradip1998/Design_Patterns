import java.util.List;
import java.util.ArrayList;

public class Channel{
    private  List<Subscriber> subs =new ArrayList<>();
    private String title;

    public void Subscribe(Subscriber sub){
        subs.add(sub);

    }

    public void Unsubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void noticetoSubscriber(){
        for(Subscriber sub :subs){
            sub.update();

        }
    }


    public void upload(String title){
        this.title=title;
        noticetoSubscriber();
    }

}
package proje;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject
{
    private List<IObserver> subs = new ArrayList<>();

    @Override
    public void attach(IObserver sub) {
        subs.add(sub);
    }

    @Override
    public void detach(IObserver sub) {
        subs.remove(sub);
    }

    @Override
    public void notify(String s) {
        for(IObserver sub : subs){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sub.update(s);
        }
    }
}

public class ConcreteObserver extends Observer{

    private ConcreteSubject cs;
    private boolean receber;

    public ConcreteObserver(ConcreteSubject cs, boolean receber){
        this.cs=cs;
        this.receber = receber;
        cs.attach(this);
    }
    @Override
    public void update() {
        if(receber==true){
        System.out.println("Observer notificado estado = "+cs.getState()
        );
    }}
}

package templates.mediator;

public class ConcreteColleagueA extends Colleague{
    private ConcreteColleagueA mediator;

    public ConcreteColleagueA(IMediator mediator) {
        super(mediator);
    }

    /*public ConcreteColleagueA(IMediator mediator){
        super(mediator);
    }

    public void send(String msg){
        this.mediator.send(msg,this);
    }*/
}

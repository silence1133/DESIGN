package cn.zxy.compound;

import cn.zxy.compound.factory.AbstractDuckFactory;
import cn.zxy.compound.factory.CountingDuckFactory;
import cn.zxy.compound.oberver.Quackologist;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.simulate();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);

//        Quackologist quackologist = new Quackologist();
//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.registerObserver(quackologist);
//        mallardDuck.quack();
    }

    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = duckFactory.createGoose();

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(goose);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());

        flock.add(flockOfMallards);

        simulate(flock);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

/*    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = duckFactory.createGoose();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }*/

    void simulate() {
/*        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());*/

        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }


    private void simulate(Quackable mallardDuck) {
        mallardDuck.quack();
    }
}

import java.io.*;
public class Waitress implements State{
    //MenuComponent allMenus;
    public static ArrayList<MenuItem> options = new ArrayList<MenuItem>();
    Iterator hamburguersIt;
    Iterator pizzasIt;
    Iterator burritosIt;
    private State transitionState;
    //private AttendingState a = new AttendingState(this);
    //private SuspendedState b = new SuspendedState(this);
    //private CookingState c = new CookingState(this);
    //private WalkingState d = new WalkingState(this);

    public Waitress(Iterator hamburguersIt, Iterator pizzasIt, Iterator burritosIt){
        this.hamburguersIt = hamburguersIt; 
        this.pizzasIt = pizzasIt; 
        this.burritosIt = burritosIt; 
    }
    //Default constructor 
    public Waitress(){
        SuspendedState suspended = new SuspendedState(this);
        transitionState = suspended;
    }

    public State getState(){
        return this.transitionState;
    }

    public void setState(State state){
        transitionState = state;
    }

    public void doAction(){
        transitionState.doAction();
    }

    public void printMenu(){
        for (int counter = 0; counter < options.size(); counter++) { 		      
            System.out.println("ID:" + counter + (options.get(counter)).print()); 		
        }   
    }

    public void addToMenu(Iterator i){        
        while(i.hasNext()){
            MenuItem menuItem = (MenuItem) i.next();    
            options.add(menuItem);
        }
    }
}


package ModuloEstados;
import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoSuspendido implements ModuloEstados{

    public Robot robot;
    public int ida_regreso;
    public int tipoCasa;

    public EstadoSuspendido(Robot robot, int num, int casa){
        this.robot = robot;
        this.ida_regreso = num;
        this.tipoCasa = casa;
    }

    public EstadoSuspendido(Robot robot, int num){
        this.robot = robot;
        this.ida_regreso = num;
    }
    public EstadoSuspendido(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El robot esta suspendido en la estacion de descanso esperando a ser activado...");

        System.out.println("Desea iniciar al robot constructor? y/n");
        //String a = sc.nextLine();
        //a = a.toLowerCase();
        if(sc.next().equals("y")){
            //poner a correr el robot en el estado activado
            EstadoActivado activado = new EstadoActivado(robot, ida_regreso, tipoCasa);
            robot.setState(activado);
            robot.doAction();
        }else if(sc.next().equals("n")){
            //El usuario no quiere correr el robot
            System.out.println("Cerrando el programa...");
        }else{
            System.out.println("Selecciona \"y\" para iniciar al robot o \"n\" para salir del programa");
            robot.doAction();
        }
    }
}

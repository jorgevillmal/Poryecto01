package ModuloEstados;
import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoSuspendido implements ModuloEstados{

    public Robot robot;

    public EstadoSuspendido(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El robot esta durmiendo esperando a un cliente......");

        System.out.println("Desea usted entrar a la tienda? esto encendera el robor mesero de enseguida! y/n?");
        String a = sc.nextLine();
        a = a.toLowerCase();
        if(a.equals("y")){
            //poner a correr el robot en el estado activado
            EstadoRecibiendoOrden cajero = new EstadoRecibiendoOrden(robot);
            robot.setEstado(cajero);
            robot.doAction();
        }else if(a.equals("n")){
            //El usuario no quiere correr el robot
            System.out.println("Vuelva en otro momento al restaurante!");
        }else{
            System.out.println("Selecciona \"y\" para iniciar al robot o \"n\" para salir del programa");
            robot.doAction();
        }
    }
}

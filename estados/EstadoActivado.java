package ModuloEstados;

import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoActivado implements ModuloEstados{
    public Robot robot;
    public int ida_regreso;
    public int tipoCasa;

    public EstadoActivado(Robot robot, int num, int casa){
        this.robot = robot;
        this.ida_regreso = num;
        this.tipoCasa = casa;
    }

    public EstadoActivado(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
        System.out.println("Iniciando al robot....");
        if(ida_regreso == 0){
            //poner a correr el robot en el estado para recibir ordenes
            EstadoRecibiendoOrden orden = new EstadoRecibiendoOrden(robot,ida_regreso);
            robot.setState(orden);
            robot.doAction();
        }else if(ida_regreso == 1 || ida_regreso == 2){
            //poner a correr el robot en el estado  pero ya con info del usuario
            EstadoCaminando caminando = new EstadoCaminando(robot, ida_regreso, tipoCasa);
            robot.setState(caminando);
            robot.doAction();
        }
    }
}

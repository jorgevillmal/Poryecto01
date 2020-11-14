package ModuloEstados;

import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoCaminando implements ModuloEstados{

    public Robot robot;
    static int num;
    boolean way;


    public EstadoCaminando(Robot robot, int num, boolean way){
        this.robot = robot;
        this.num = num;
        this.way = way;
    }

    public EstadoCaminando(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
      Scanner s = new Scanner(System.in);
      if(way){
        System.out.println("El robot va caminando de la caja a la cocina...");
        EstadoCocinando cocinando = new EstadoCocinando(robot, num);
        robot.setEstado(cocinando);
        robot.doAction();
      }else{
        System.out.println("El robot va caminando de la caja a la cocina...");
        EstadoRecibiendoOrden entregando = new EstadoRecibiendoOrden(robot, 666);
        robot.setEstado(entregando);
        robot.doAction();
      }
    }
}

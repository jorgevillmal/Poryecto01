package ModuloEstados;

import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoRecibiendoOrden implements ModuloEstados{

    public Robot robot;
    public int num;

    public EstadoRecibiendoOrden(Robot robot, int num){
        this.robot = robot;
        this.ida_regreso = num;
    }

    public void doAction(){
      if(!(num==666)){
        Scanner sc = new Scanner(System.in);
        System.out.println("El robot esta depertando ... ");
        System.out.println("Robot: Gusta que le tomen la orden?");
        System.out.println("Cliente: Por su puesto me muestra el menu?");
        //se despliega todo el menu de opciones
        robot.printMenu();
        recibeOrden();
        //poner a correr el robot en el estado caminando
        EstadoCaminando caminando = new EstadoCaminando(robot, 1, i);
        robot.setEstado(caminando);
        robot.doAction();
      }else{
          System.out.println("Aqui tiene su comida!!");
      }

    }


    private static void recibeOrden(){
      System.out.println("Que opcion le gusto? porfavor escriba el numero de id de su comida! ");
      Scanner sc = new Scanner(System.in);
      //cota superior e inferior
      if(!(num < 0 || num > 15)){
        //pasamos falso para que el robot imprima que va en el camino de vuelta con el pedido
        EstadoCaminando caminando = new EstadoCaminando(robot, num, false);
        robot.setEstado(caminando);
        robot.doAction();
      }else{
        System.out.println("La id tiene que ser de algun producto! cheque el numero nuevamente!");
        recibeOrden();
      }
    }
}

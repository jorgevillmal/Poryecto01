package ModuloEstados;

import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoCaminando implements ModuloEstados{

    public Robot robot;
    public int ida_regreso;
    public int tipoCasa;

    public EstadoCaminando(Robot robot, int num, int casa){
        this.robot = robot;
        this.ida_regreso = num;
        this.tipoCasa = casa;
    }

    public EstadoCaminando(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
        Scanner s = new Scanner(System.in);
        if(ida_regreso == 1){
            System.out.println("Caminando del area de descanso a al area de materiales...");
            System.out.println("Desea usted parar al robot? y/n");
            String a = s.nextLine();
            if(a.equals("y")){
                //el usuario quiere parar al robot
                EstadoSuspendido para = new EstadoSuspendido(robot, ida_regreso,tipoCasa);
                robot.setState(para);
                robot.doAction();
            }else if(a.equals("n")){
                //El usuario no quiere parar el robot
                System.out.println("El robot seguira caminando hasta el area de materiales...");
                EstadoRebasteciendo rebasteciendo = new EstadoRebasteciendo(robot,ida_regreso,tipoCasa);
                robot.setState(rebasteciendo);
                robot.doAction();
            }else{
                System.out.println("Selecciona \"y\" para frenar al robot o \"n\" para que siga caminando");
                robot.doAction();
            }

        }else if(ida_regreso == 2){
            System.out.println("Caminando del area de materiales a el area de trabajo...");
            System.out.println("Desea usted parar al robot? y/n");
            String a = s.nextLine();
            if(a.equals("y")){
                //el usuario quiere parar al robot
                EstadoSuspendido alto = new EstadoSuspendido(robot, ida_regreso, tipoCasa);
                robot.setState(alto);
                robot.doAction();
            }else if(a.equals("n")){
                //El usuario no quiere parar el robot
                System.out.println("El robot seguira caminando hasta el area de materiales...");
                EstadoTrabajar chamba = new EstadoTrabajar(robot, ida_regreso, tipoCasa);
                robot.setState(chamba);
                robot.doAction();
            }else{
                System.out.println("Selecciona \"y\" para frenar al robot o \"n\" para que siga caminando");
                robot.doAction();
            }
        }else if(ida_regreso == 3){
            System.out.println("Caminando del area de trabajo a el area de descanso...");
        }
    }
}

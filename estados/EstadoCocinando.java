package ModuloEstados;

import ModuloPrincipal.*;
import java.util.Scanner

public class EstadoCocinando implements ModuloEstados{
    public Robot robot;
    public int num;

    public EstadoCocinando(Robot robot, int num){
        this.robot = robot;
        this.num = num;

    }

    public void doAction(){
for(int i =0;i<robot.arreglo.size();i++){

        }
        EstadoCaminando caminando = new EstadoCaminando(robot, 3, false);
        robot.setEstado(caminando);
        robot.doAction();

    }
}

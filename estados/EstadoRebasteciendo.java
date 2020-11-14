package ModuloEstados;

import ModuloPrincipal.*;

public class EstadoRebasteciendo implements ModuloEstados{
    public Robot robot;
    public int ida_regreso;
    public int tipoCasa;

    public EstadoRebasteciendo(Robot robot, int num, int tipoCasa){
        this.robot = robot;
        this.ida_regreso = num;
        this.tipoCasa = tipoCasa;
    }

    public EstadoRebasteciendo(Robot robot){
        this.robot = robot;
    }

    public void doAction(){
        System.out.println("Rebasteciendo al robot de materiales para la construccion...");
        //poner a correr el robot en el estado caminando
        EstadoCaminando caminando = new EstadoCaminando(robot, 2, tipoCasa);
        robot.setState(caminando);
        robot.doAction();
    }
}

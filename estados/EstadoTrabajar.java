package ModuloEstados;

import ModuloPrincipal.*;
import ModuloCasa.*;

public class EstadoTrabajar implements ModuloEstados{

    public Robot robot;
    public int ida_regreso;
    public int tipoCasa;

    public EstadoTrabajar(Robot robot, int ida_regreso, int tipoCasa){
        this.robot = robot;
        this.ida_regreso = ida_regreso;
        this.tipoCasa = tipoCasa;
    }

    public EstadoTrabajar(Robot robot){
        this.robot = robot;

    }
    public void doAction(){
        System.out.println("Construyendo casa...");

        switch (tipoCasa) {
            case 11:
                CasaA1 casaA1 = new CasaA1();
                casaA1.iniciar();
                break;
            case 12:
                CasaA2 casaA2 = new CasaA2();
                casaA2.iniciar();
                break;
            case 13:
                CasaA3 casaA3 = new CasaA3();
                casaA3.iniciar();
                break;
            case 14:
                CasaA4 casaA4 = new CasaA4();
                casaA4.iniciar();
                break;
            case 21:
                CasaB1 casaB1 = new CasaB1();
                casaB1.iniciar();
                break;
            case 22:
                CasaB2 casaB2 = new CasaB2();
                casaB2.iniciar();
                break;
            case 23:
                CasaB3 casaB3 = new CasaB3();
                casaB3.iniciar();
                break;
            case 24:
                CasaB4 casaB4 = new CasaB4();
                casaB4.iniciar();
                break;
        }

        //poner a correr el robot en el estado  pero ya para dormir
        EstadoCaminando caminando = new EstadoCaminando(robot, 3, tipoCasa);
        robot.setState(caminando);
        robot.doAction();

    }
}

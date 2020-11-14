package ModuloEstados;

import java.util.Scanner;
import ModuloPrincipal.*;

public class EstadoRecibiendoOrden implements ModuloEstados{

    public Robot robot;
    public int ida_regreso;

    public EstadoRecibiendoOrden(Robot robot, int num){
        this.robot = robot;
        this.ida_regreso = num;
    }

    public EstadoRecibiendoOrden(Robot robot){
        this.robot = robot;
    }

    private void menu_aux(){
        System.out.println("Eliga una de las siguientes opciones ");
        System.out.println("para el esqueleto de la casa:  1. Esqueleto de concreto - $500,000");
        System.out.println("2. Esqueleto reforzado - $1,000,000 ");
    }

    public void doAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliga una de las siguientes opciones para el esqueleto de la casa: ");
        System.out.println("1. Esqueleto de concreto - $500,000");
        System.out.println("2. Esqueleto reforzado - $1,000,000 ");
        System.out.println("Porfavor escriba un numero para seleccionar: ");
        String a = scanner.nextLine();
        System.out.println("Eliga una de las siguientes opciones para el aislamiento de la casa:");
        System.out.println("1. Aislamiento de concreto - $2,000,000 ");
        System.out.println("2. Aislamiento de vidrio - $2,500,000 ");
        System.out.println("3. Aislamiento de madera - $1,000,000 ");
        System.out.println("4. Aislamiento reforzado - $3,000,000 ");
        System.out.println("Porfavor escriba un numero para seleccionar: ");
        String b = scanner.nextLine();

        //La suma de lo recibido por el usuario determinara el estado correcto a implementar.
        String sum = a + b;
        int i = Integer.parseInt(sum);

        if(i < 11 || i > 24){
            System.out.println("Solamente puedes escribir los numeros mostrados en la pantalla Porfavor elige nuevamente!");
            this.doAction();
        }
        //poner a correr el robot en el estado caminando
        EstadoCaminando caminando = new EstadoCaminando(robot, 1, i);
        robot.setState(caminando);
        robot.doAction();
    }
}

package robot;

import menu.MenuComponent;

public class Robot implements ModuloEstados{
    MenuComponent allMenus;
    private ModuloEstados estadoEnTransicion;


    public Robot(MenuComponent allMenus){
        this.allMenus = allMenus;
        EstadoSuspendido suspendido EstadoSuspendido(this);
        estadoEnTransicion = suspendido;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void doAction(){
      estadoEnTransicion.doAction();
    }

    public ModuloEstados getEstado(){
      return this.estadoEnTrancision.doAction();
    }

    public ModuloEstados setEstado(ModuloEstados estado){
      return this.estadoEnTrancision = estado;
    }
}

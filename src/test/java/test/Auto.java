package test;
public class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
      int a=0;
      for (int i=0;i<asientos.length;i++){
        if (asientos[i] instanceof Asiento)
          a++;
      }
      return a;
    }
    String verificarIntegridad(){
      int b=0;
      for (int i=0;i<asientos.length;i++){
        if(asientos[i] instanceof Asiento)
          if (asientos[i].registro!=motor.registro)
            b++;
          else if (asientos[i].registro!=this.registro)
            b++;
          else if (motor.registro!=this.registro)
            b++;
        }
      if (b>0)
        return("Las piezas no son originales");
      else
        return("Auto original");
    }
}

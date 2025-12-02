import javax.swing.*;
import java.util.List;

public class PruebaRegistroFemsa {
    public static void main(String[] args) {
        RegistroFemsa[] registros = new RegistroFemsa[100];
        PruebaRegistroFemsa pruebaRegistroFemsa = new PruebaRegistroFemsa();
        int incremento = 0;
        int opcion = 0;
       do {
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa: "
                   +"\n 1.- capturar"
                   + "\n 2.-Imprimir"
                   + "\n 3.-Envios por tierra"
                   + "\n 4.-Envios por aire"
                   + "\n 5.- total de piezas"
                   + "\n 6.- Buscar por numeor de envio"
           ));

           switch (opcion){
               case 1:
                   incremento = pruebaRegistroFemsa.capturar(registros, incremento);
                   break;
               case 2:
                   pruebaRegistroFemsa.imprimir(registros, incremento);
                   break;
               case 3:
                   pruebaRegistroFemsa.imprimirTerrestre(registros, incremento);
                   break;
               case 4:
                   pruebaRegistroFemsa.imprimirAereo(registros, incremento);
                   break;
               case 5:
                   pruebaRegistroFemsa.imprimirTotalPiezas(registros, incremento);
                   break;
               case 6:
                   pruebaRegistroFemsa.buscarPaquete(registros, incremento);
                   break;
           }
       }while (opcion != 6);
    }

    public int capturar(RegistroFemsa[] registroFemsas, int incremento){
        int numeroPaquete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del paquete"));
        String nombreDelEmisor = JOptionPane.showInputDialog(null, "Ingrese el nombre del emisor");
        String lugarOrigen = JOptionPane.showInputDialog(null, "Ingrese el lugar de origen");
        String lugarDestino = JOptionPane.showInputDialog(null, "Ingrese el lugar de destino");
        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha");
        int numeroDePiezas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de piezas"));
        float pesoDelProdcuto = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el peso del prodcuto"));

        int tipoProducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el producto \n1.-agua \n2.-refresco \n3.-jugo"));
        int tipoEnvio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de evio \n1.-aereo \n2.-terrestre "));

        switch (tipoEnvio){
            case 1:
                registroFemsas[incremento] = new RegistroFemsa(numeroPaquete, nombreDelEmisor, lugarOrigen,lugarDestino, fecha, numeroDePiezas,pesoDelProdcuto,tipoProducto,"");
                break;
            case 2:
                registroFemsas[incremento] = new RegistroFemsa(numeroPaquete, nombreDelEmisor, lugarOrigen,lugarDestino, fecha, numeroDePiezas,pesoDelProdcuto,tipoProducto,2);
                break;
        }
        return ++incremento;
    }

    public void imprimir(RegistroFemsa[] registroFemsa, int incremento){
        for (int i = 0; i < incremento; i++) {
            JOptionPane.showMessageDialog(null, "Titulo: "
                    +"\n Numero de paquete: "+ registroFemsa[i].getNumeroPaquete()
                    +"\n Nombre del emisor : "+ registroFemsa[i].getNombreEmisor()
                    +"\n Lugar origen : "+ registroFemsa[i].getLugarOrigen()
                    +"\n Lugar destino : "+ registroFemsa[i].getLugarDestino()
                    +"\n fecha : "+ registroFemsa[i].getFecha()
                    +"\n Numero de piezas : "+ registroFemsa[i].getNumeroPiezas()
                    +"\n peso: "+ registroFemsa[i].getPeso()
                    +"\n tipo envio: "+ registroFemsa[i].getTipoEnvio()
                    +"\n precio envio: "+ registroFemsa[i].getPrecioEnvio()
                    +"\n producto: "+ registroFemsa[i].getProducto()
                    +"\n precio producto: "+ registroFemsa[i].getPrecioProducto()
                    +"\n cargo: "+ registroFemsa[i].getCargo()
                    +"\n precio final del producto: "+ registroFemsa[i].getPrecioFinal()
            );
        }
    }

    public void imprimirUno(RegistroFemsa empresa){
        JOptionPane.showMessageDialog(null, "Titulo: "
                +"\n Numero de paquete: "+ empresa.getNumeroPaquete()
                +"\n Nombre del emisor : "+ empresa.getNombreEmisor()
                +"\n Lugar origen : "+ empresa.getLugarOrigen()
                +"\n Lugar destino : "+ empresa.getLugarDestino()
                +"\n fecha : "+ empresa.getFecha()
                +"\n Numero de piezas : "+ empresa.getNumeroPiezas()
                +"\n peso: "+ empresa.getPeso()
                +"\n tipo envio: "+ empresa.getTipoEnvio()
                +"\n precio envio: "+ empresa.getPrecioEnvio()
                +"\n producto: "+ empresa.getProducto()
                +"\n precio producto: "+ empresa.getPrecioProducto()
                +"\n cargo: "+ empresa.getCargo()
                +"\n precio final del producto: "+ empresa.getPrecioFinal()
        );
    }

    private void imprimirTerrestre(RegistroFemsa[] registros, int incremento) {
        int totalTerrestre = 0;
        for (int i = 0; i < incremento; i++) {
            if (registros[i].getTipoEnvio().equals("terrestre")){
                totalTerrestre++;
            }
        }

        JOptionPane.showMessageDialog(null, "El total de envios terrestres son: " + totalTerrestre);
    }

    private void imprimirAereo(RegistroFemsa[] registros, int incremento) {
        int totalTerrestre = 0;
        for (int i = 0; i < incremento; i++) {
            if (registros[i].getTipoEnvio().equals("aereo")){
                totalTerrestre++;
            }
        }

        JOptionPane.showMessageDialog(null, "El total de envios aereo son: " + totalTerrestre);
    }

    private void imprimirTotalPiezas(RegistroFemsa[] registros, int incremento) {
        int totalPiezasTerrestre = 0;
        int totalPiezasAereo = 0;
        for (int i = 0; i < incremento; i++) {
            if (registros[i].getTipoEnvio().equals("aereo")){
                totalPiezasAereo += registros[i].getNumeroPiezas();
            }
            else if (registros[i].getTipoEnvio().equals("terrestre")){
                totalPiezasAereo += registros[i].getNumeroPiezas();
            }
        }

        JOptionPane.showMessageDialog(null, "El total de piezas aereas son: " + totalPiezasAereo
            + "\n El total de piezas aereas son: "+ totalPiezasTerrestre
        );
    }

    private void buscarPaquete(RegistroFemsa[] registros, int incremento) {
        int numPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de paquete"));
        for (int i = 0; i < incremento; i++) {
            if (registros[i].getNumeroPaquete() == numPedido){
                imprimirUno(registros[i]);
                break;
            }
        }
    }

}

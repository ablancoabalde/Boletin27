package boletin27;

import static boletin27.Main.*;

public class Logica {

    static int num=0;
    static int resultado=0;
    String factor=null;

    public void introducir(String nombre) {

        switch (nombre) {
            case "+":
                condicion();
                factor="+";
                Pantalla.setText("");
                break;
            case "-":
                condicion();
                factor="-";
                Pantalla.setText("");
                break;
            case "/":
                condicion();
                factor="/";
                Pantalla.setText("");
                break;
            case "*":
                condicion();
                factor="*";
                Pantalla.setText("");
                break;
            case "=":
                calculo();
                factor=null;
                break;
            case "AC":
                Pantalla.setText("");
                break;
            default:
                Pantalla.setText(Pantalla.getText()+nombre);
                break;
        }

    }

    private void calculo() {
        if (resultado==0) {
            switch (factor) {
                case "+":
                    num+=Integer.valueOf(Pantalla.getText());

                    break;
                case "-":
                    num-=Integer.valueOf(Pantalla.getText());

                    break;
                case "/":
                    num/=Integer.valueOf(Pantalla.getText());

                    break;
                case "*":
                    num*=Integer.valueOf(Pantalla.getText());

                    break;
            }
            resultado=num;
        } else {
            switch (factor) {
                case "+":
                    resultado+=Integer.valueOf(Pantalla.getText());

                    break;
                case "-":
                    resultado-=Integer.valueOf(Pantalla.getText());

                    break;
                case "/":
                    resultado/=Integer.valueOf(Pantalla.getText());

                    break;
                case "*":
                    resultado*=Integer.valueOf(Pantalla.getText());

                    break;
            }
        }
        Pantalla.setText(Integer.toString(resultado));

    }

    private void condicion() {
        if (factor!=null) {
            calculo();
        } else {
            num=Integer.valueOf(Pantalla.getText());
        }
    }
}

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import singletonjuego.Datos;

public class TestDatos {
    @Test
    @DisplayName ("Comprobar igualdad de objetos")
    public void testObjetos(){
        Datos a = Datos.getInstance();
        Datos b = Datos.getInstance();
        Assertions.assertEquals(a,b);
    }
}

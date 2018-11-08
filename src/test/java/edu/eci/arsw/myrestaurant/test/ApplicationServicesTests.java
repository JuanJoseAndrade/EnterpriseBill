package edu.eci.arsw.myrestaurant.test;


import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class ApplicationServicesTests {
    

  
    //Suponiendo que se usará el calculador de factores con impuestos y calculador tributario de 2016 de Colombia
    //El siguiente test mira si efectivamente se están calculando los impuestos teniendo en cuenta si es bebida o no
    @Test
    public void valoresFrontera() {

    }
    
}

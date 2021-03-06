package cl.curso.java.login_app;

import java.io.IOException;
import java.util.Date;
import java.io.File;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
//        webcam.setViewSize(new Dimension(1024, 768));
        webcam.open();
        ImageIO.write(webcam.getImage(), "PNG", new File("/Users/Joseph/"+new Date().getTime()+".png"));
    }
}

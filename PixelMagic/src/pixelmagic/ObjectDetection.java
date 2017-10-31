/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pixelmagic;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Range;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.rectangle;
import org.opencv.objdetect.CascadeClassifier;
/**
 *
 * @author mahe
 */
public class ObjectDetection {
    public static BufferedImage boxing(BufferedImage image)
    {
         Mat imageMat = Utility.bufferedToMat(image);
        Imgproc.cvtColor(imageMat, imageMat, Imgproc.COLOR_RGB2BGR);
        CascadeClassifier eyeDetector = new CascadeClassifier("classifierWallClock.xml");//for wall clock
        MatOfRect eyeDetections = new MatOfRect();
        eyeDetector.detectMultiScale(imageMat, eyeDetections);
        for(Rect rect : eyeDetections.toArray())
        {
            Imgproc.rectangle(imageMat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0,255,0,255), 5);    
        }
        CascadeClassifier eyeDetector1 = new CascadeClassifier("parojosG.xml");//for eye
        MatOfRect eyeDetections1 = new MatOfRect();
        eyeDetector1.detectMultiScale(imageMat, eyeDetections1);
        for(Rect rect : eyeDetections1.toArray())
        {
            Imgproc.rectangle(imageMat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0,255,0,255), 5);
        }
        /*CascadeClassifier eyeDetector2 = new CascadeClassifier("haarcascade.xml");//for pen
        MatOfRect eyeDetections2 = new MatOfRect();
        eyeDetector2.detectMultiScale(imageMat, eyeDetections2);
        for(Rect rect : eyeDetections2.toArray())
        {
            Imgproc.rectangle(imageMat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0,255,0,255), 5);
        }
        CascadeClassifier eyeDetector3 = new CascadeClassifier("haarcascade_frontalface_default.xml");//for face
        MatOfRect eyeDetections3 = new MatOfRect();
        eyeDetector3.detectMultiScale(imageMat, eyeDetections3);
        for(Rect rect : eyeDetections3.toArray())
        {
            Imgproc.rectangle(imageMat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0,255,0,255), 5);
        }*/
      return  Utility.matToBuffered(imageMat);
    }
}

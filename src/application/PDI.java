package application;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

public class PDI {



	



	//redimensionar imagem

	static Image processarImagem(Image img) {

	
		imageInserida.
		cinza();
		//gaussian1();
		//gaussian2();/*fazer a diferenca de gaussian1 de gaussian2 (subtração)
		//convolucao bidimensional
		return null;

	}


	public static void cinza() {
		String filename = "C:\\Users\\filip\\eclipse-workspace\\TesteOpenCV\\src\\java.png";

		Mat img = Imgcodecs.imread(filename);
		Mat gray = new Mat();

		Imgproc.cvtColor(img, gray, Imgproc.COLOR_BGR2GRAY);

	}
	public static void gaussian1() {
		String filename = "C:\\Users\\filip\\eclipse-workspace\\TesteOpenCV\\src\\java.png";

		Mat img = Imgcodecs.imread(filename);
		
		Size sz = new Size(21,21);
		Imgproc.GaussianBlur(img, img, sz, 15);

	}
	public static void gaussian2() {
		String filename = "C:\\Users\\filip\\eclipse-workspace\\TesteOpenCV\\src\\java.png";

		Mat img = Imgcodecs.imread(filename);
		
		Size sz = new Size(21,21);
		Imgproc.GaussianBlur(img, img, sz, 20);

	}
	public static void subtracao() {
		String filename = "C:\\Users\\filip\\eclipse-workspace\\TesteOpenCV\\src\\java.png";

		Mat img = Imgcodecs.imread(filename);
		
		Size sz = new Size(21,21);
		Imgproc.sub

	}
	

	
	
}
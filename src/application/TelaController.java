package application;


import java.io.File;

import org.opencv.core.Mat;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class TelaController {
	
@FXML private ImageView imageInserida;
	
	private Image img;
	
	//ETAPA 1
	@FXML

	public void abreImagem() {
		img = PDI.abreImagem(imageInserida,img);
		Mat imagemMat = new Mat();
		imagemMat = ConvertBuff_to_Mat.Convert(img);
		PDI.processarImagem(img);
	}
	
	static Image abreImagem(ImageView imageInserida, Image img) {


		File f = selecionaImagem();


		if(f != null) {

			img = new Image(f.toURI().toString());

			imageInserida.setImage(img);
			imageInserida.setFitHeight(img.getHeight());//colocando a a=largura para expandir
			imageInserida.setFitWidth(img.getWidth());//colocando altura


			return img;
		}
		return null;
	}

	private static File selecionaImagem() {// selecionar uma imagem no diretorio e retornar
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add(new 
				FileChooser.ExtensionFilter(// tipos de imagens
						"Imagens", "*.jpg", "*.JPG", 
						"*.png", "*.PNG", "*.gif", "*.GIF", 
						"*.bmp", "*.BMP")); 	
		fileChooser.setInitialDirectory(new File(
				"C:\\Users\\filip\\Desktop\\Filipe\\Faculdade\\Processamento digital de Imagem\\Imagens"));
		File imgSelec = fileChooser.showOpenDialog(null);
		try {
			if (imgSelec != null) {
				return imgSelec;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}

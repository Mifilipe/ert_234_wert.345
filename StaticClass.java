class StaticClass {
	
	static void  Colors (Color inicial){
		
		Color ert = new Color (inicial.getR()+23, inicial.getG()+23, inicial.getB()+23);
		
		inicial = ert;
		return;
	}
	
	//static ColorImage paint (ColorImage objecto, Colors(int r, int g, int b)){

	
	//Função teste
	
	
		static Color teste () {
		
			Color inicial = new Color (223,220,45);
			int r = 23;
			int g = 46;
			int b = 235;
		
			Colors (inicial );
			
			return inicial;
		}
			
		
	
	static	Color average_block (ColorImage img, int xi, int yi, int factor_escala) {
		
		int px, py, f;
		
		f= factor_escala*factor_escala;
		
		Color c, cm;
		
		cm = new Color (0,0,0);
		
		for (int y = 0; y< factor_escala; y++) {
			for (int x = 0; x< factor_escala; x++) {
		
				px = xi + x;
				py = yi+ y;
				
				c= img.getColor(px,py);
				
				cm.inc_color (c);
				
			}
		}
		
		return new Color (cm.getR()/f,cm.getG()/f, cm.getB()/f);
		
	}
		
	static ColorImage reduzir (ColorImage img, int factor_escala ) {
		
		int width = img.getWidth()/factor_escala;
		int height = img.getHeight()/factor_escala;
		
		int px, py;
		
		Color c;
		
		ColorImage img2 = new ColorImage (width,height);
		
		
		for (int y = 0; y< img2.getHeight(); y++) {
			for (int x = 0; x< img2.getWidth(); x++) {
				
				px = x*factor_escala;
				py= y*factor_escala;
				c = average_block (img, px, py,factor_escala);
		
				img2.setColor(x,y,c);
				
			}
		}
		
		return img2;
		
	}
	
	static ColorImage aumentar (ColorImage img, int factor_aumento) {
		
		int width = img.getWidth()*factor_aumento;
		int height = img.getHeight()*factor_aumento;
		
		int xi, yi;
		
		Color c;
	
		ColorImage img2 = new ColorImage (width,height);
		
		for (int x = 0; x < img.getWidth(); x++) {
			for (int y = 0; y < img.getHeight(); y++) {
		
				c = img.getColor (x,y);
				
				xi = x * factor_aumento;
				yi = y * factor_aumento;
				
				for (int px = 0; px <factor_aumento; px++) 
					
					for (int py=0; py < factor_aumento; py++) 
						
						img2.setColor(xi+px, yi+py, c);
						
			}
		}
		
		return img2;

	}
	
	 static ColorImage pixelizar (ColorImage img, int factor_escala) {
		 
	/*Color[][] Cor_inicial = new Color [3][3];
	
	int vermelho_medio = 0;
	int verde_medio = 0;
	int azul_medio = 0;
	
	for (int linha = 0; linha< c.getHeight(); linha +=3) {
		for (int coluna = 0; coluna< c.getWidth(); coluna +=3) {
			
			
			
			
			for (int i = 0; i< Cor_inicial.length; i++) {
				for (int j = 0; j<Cor_inicial[0].length; j++) {
					
					Cor_inicial [linha][coluna] = c.getColor(linha + i,coluna + j);
					
		
			
			vermelho_medio += Cor_inicial [i][j]. getR();
			verde_medio += Cor_inicial [i][j]. getG();
			azul_medio += Cor_inicial [i][j]. getB();
		
				}
			}
			
		*/
		 
		 Color c = new Color (0,0,0);
		 ColorImage img2 = new ColorImage (img.getWidth(),img.getHeight());
		 
		 for (int y = 0; y < img.getHeight(); y +=factor_escala) {
			 for (int x = 0; x< img.getWidth(); x +=factor_escala) {

				 
				 c = average_block (img, x, y,factor_escala);
				 
				 img.getColor(x,y);
				 
				 
				 for (int yi = 0; yi < img2.getHeight() & y*factor_escala < img2.getHeight(); yi++) {
					 for (int xi = 0; xi< img2.getWidth() & x*factor_escala < img2.getWidth(); xi++) {
						 
						img2.setColor (y*factor_escala,x*factor_escala,c);
					 }
				 }
			 } 
		 }
		 		
					return img2;
					
	 }
	 
	 
	 //Função teste
	 
	 static ColorImage teste2 (){
		 
		 ColorImage img = new ColorImage ("objc1.png");
		 
		 int factor_escala = 4;		
		 
		 return pixelizar (img, factor_escala);
		 
	 }
	 
	
	

	
	
	// Função teste
	
/*	ColorIm
	
	
		
	static void paint_Image_accordingly (ColorImage img, ColorImage img2, double factor_escala) {
		
		
		int k = 0;
		int l = 0;
		
		for (int i=0; i< img.getWidth() && i<img2.getWidth()-1 && k<img2.getWidth(); i++) {
			
			for (int j=0; j< img.getHeight() && j<img2.getHeight()-1 && l<img2.getHeight(); j++) {
				
				Color reduced_size = new Color (getR()/(factor_escala*factor_escala), (upper_left.getG()+upper_right.getG()+lower_left.getG()+lower_right.getG())/(factor_escala*factor_escala), (upper_left.getB()+upper_right.getB()+lower_left.getB()+lower_right.getB())/(factor_escala*factor_escala));
					
				img2.setColor (i,j,reduced_size);
				
					}
				}
			
				
				
				
	}
	
	*/
		
	
	//Função teste
	
	
	static ColorImage teste1 () {
		
		int factor_escala = 2;
		
		ColorImage img = new ColorImage ("objc1.png");
		
		//return reduzir (img, factor_escala);
		return aumentar (img, factor_escala);
		
	}
		
		
			
		
	
		
		//Color c = new Color (r,g,b);
		//paint_Image (img, c);
		
		
	

	
	
	//static ColorImage Aumentar (ColorImage a, int factor) {
		
		
	
		
	//}
	
}
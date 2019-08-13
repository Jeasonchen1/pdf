//将pdf装图片 并且自定义图片得格式大小
		File file = new File("E:\\阿里巴巴-码出高效@xinguo123456.pdf");
		try {
			PDDocument doc = PDDocument.load(file);
			PDFRenderer renderer = new PDFRenderer(doc);
			int pageCount = doc.getNumberOfPages();
			File dictory=new File("E:\\123456");
			if(!dictory.exists()){//如果文件夹不存在
				dictory.mkdir();//创建文件夹
			}
			for(int i=0;i<pageCount;i++){
				BufferedImage image = renderer.renderImageWithDPI(i,200); // Windows native DPI
				//BufferedImage srcImage = resize(image, 240, 240);//产生缩略图
				ImageIO.write(image,"PNG", new File("E:\\123456\\"+i+".png"));
			}

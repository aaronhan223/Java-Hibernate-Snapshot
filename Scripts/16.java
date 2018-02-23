public class App {
	public static void main(String[] args) throws IOException, WriteException
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		String fileName = "/Users/hanxing/Desktop/GnEpochs.xls";
		WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
		WritableSheet sheet = workbook.createSheet("GnEpochs", 0);
		

		/** Exporting Excel **/
		List<Timeseries> list = session
				.createQuery("from Timeseries where " + "stream_major = 1" + "and stream_minor=6")
				.list(); // here
		// timeseries
		Label label1 = new Label(0,0,"id");
		sheet.addCell(label1);
		Label label2 = new Label(1,0,"batch");
		sheet.addCell(label2);
		Label label3 = new Label(2,0,"timestamp");
		sheet.addCell(label3);
		Label label4 = new Label(3,0,"extent");
		sheet.addCell(label4);
		Label label5 = new Label(4,0,"snapshot_id");
		sheet.addCell(label5);
		Label label6 = new Label(5,0,"stream_major");
		sheet.addCell(label6);
		Label label7 = new Label(6,0,"stream_minor");
		sheet.addCell(label7);
		
		//json
		Label label8 = new Label(7,0,"startTimeInSeconds");
		sheet.addCell(label8);
		Label label9 = new Label(8,0,"activeTimeInSeconds");
		sheet.addCell(label9);
		Label label10 = new Label(9,0,"activeKilocalories");
		sheet.addCell(label10);
		Label label11 = new Label(10,0,"distanceInMeters");
		sheet.addCell(label11);
		Label label12 = new Label(11,0,"activityType");
		sheet.addCell(label12);
		Label label13 = new Label(12,0,"startTimeOffsetInSeconds");
		sheet.addCell(label13);
		Label label14 = new Label(13,0,"durationInSeconds");
		sheet.addCell(label14);
		Label label15 = new Label(14,0,"met");
		sheet.addCell(label15);
		Label label16 = new Label(15,0,"intensity");
		sheet.addCell(label16);
		Label label17 = new Label(16,0,"steps");
		sheet.addCell(label17);
		Label label18 = new Label(17,0,"maxMotionIntensity");
		sheet.addCell(label18);
		Label label19 = new Label(18,0,"meanMotionIntensity");
		sheet.addCell(label19);
		
		
		for (int i = 1; i < list.size(); i++) {
			BigInteger id = list.get(i).getId();
			writeExcelBigInt(0,i,id,sheet);
			BigInteger batch = list.get(i).getBatch();
			writeExcelBigInt(1,i,batch,sheet);
			Date timestamp = list.get(i).getTimestamp();
			writeExcelDate(2,i,timestamp,sheet);
			int extent = list.get(i).getExtent();
			writeExcel(3,i,extent,sheet);
			BigInteger snapshot_id = list.get(i).getSnapshot_id();
			writeExcelBigInt(4,i,snapshot_id,sheet);
			int stream_major = list.get(i).getStream_major();
			writeExcel(5,i,stream_major,sheet);
			int stream_minor = list.get(i).getStream_minor();
			writeExcel(6,i,stream_minor,sheet);
			
			//json
			String json = list.get(i).getBlob();
			GnEpochs object = new Gson().fromJson(json, GnEpochs.class);
			writeExcelLong(7,i,object.getStartTimeInSeconds(),sheet);
			writeExcelLong(8,i,object.getActiveTimeInSeconds(),sheet);
			writeExcelFloat(9,i,object.getActiveKilocalories(),sheet);
			writeExcelFloat(10,i,object.getDistanceInMeters(),sheet);
			writeExcelString(11,i,object.getActivityType(),sheet);
			writeExcelLong(12,i,object.getStartTimeOffsetInSeconds(),sheet);
			writeExcel(13,i,object.getDurationInSeconds(),sheet);
			writeExcelFloat(14,i,object.getMet(),sheet);
			writeExcelString(15,i,object.getIntensity(),sheet);
			writeExcelLong(16,i,object.getSteps(),sheet);
			writeExcel(17,i,object.getMaxMotionIntensity(),sheet);
			writeExcelFloat(18,i,object.getMeanMotionIntensity(),sheet);
	    }

		
		workbook.write();
		workbook.close();

		session.getTransaction().commit();
		session.close();
		
	}
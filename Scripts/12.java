public class App {
	public static void main(String[] args) throws IOException, WriteException
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		String fileName = "/Users/hanxing/Desktop/DailyDigests.xls";
		WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
		WritableSheet sheet = workbook.createSheet("DailyDigests", 0);
		

		/** Exporting Excel **/
		List<Timeseries> list = session
				.createQuery("from Timeseries where " + "stream_major = 1" + "and stream_minor=2")
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
		Label label8 = new Label(7,0,"activeKilocalories");
		sheet.addCell(label8);
		Label label9 = new Label(8,0,"distanceInMeters");
		sheet.addCell(label9);
		Label label10 = new Label(9,0,"activityType");
		sheet.addCell(label10);
		Label label11 = new Label(10,0,"maxStressLevel");
		sheet.addCell(label11);
		Label label12 = new Label(11,0,"averageHeartRateInBeatsPerMinute");
		sheet.addCell(label12);
		Label label13 = new Label(12,0,"restStressDurationInSeconds");
		sheet.addCell(label13);
		Label label14 = new Label(13,0,"restingHeartRateInBeatsPerMinute");
		sheet.addCell(label14);
		Label label15 = new Label(14,0,"mediumStressDurationInSeconds");
		sheet.addCell(label15);
		Label label16 = new Label(15,0,"startTimeInSeconds");
		sheet.addCell(label16);
		Label label17 = new Label(16,0,"stressQualifier");
		sheet.addCell(label17);
		Label label18 = new Label(17,0,"stepsGoal");
		sheet.addCell(label18);
		Label label19 = new Label(18,0,"lowStressDurationInSeconds");
		sheet.addCell(label19);
		Label label20 = new Label(19,0,"intensityDurationGoalInSeconds");
		sheet.addCell(label20);
		Label label21 = new Label(20,0,"stressDurationInSeconds");
		sheet.addCell(label21);
		Label label22 = new Label(21,0,"activeTimeInSeconds");
		sheet.addCell(label22);
		Label label23 = new Label(22,0,"activityStressDurationInSeconds");
		sheet.addCell(label23);
		Label label24 = new Label(23,0,"floorsClimbedGoal");
		sheet.addCell(label24);
		Label label25 = new Label(24,0,"minHeartRateInBeatsPerMinute");
		sheet.addCell(label25);
		Label label26 = new Label(25,0,"highStressDurationInSeconds");
		sheet.addCell(label26);
		Label label27 = new Label(26,0,"startTimeOffsetInSeconds");
		sheet.addCell(label27);
		Label label28 = new Label(27,0,"steps");
		sheet.addCell(label28);
		Label label29 = new Label(28,0,"durationInSeconds");
		sheet.addCell(label29);
		Label label30 = new Label(29,0,"averageStressLevel");
		sheet.addCell(label30);
		Label label31 = new Label(30,0,"maxHeartRateInBeatsPerMinute");
		sheet.addCell(label31);
		Label label32 = new Label(31,0,"heartAverage");
		sheet.addCell(label32);
		
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
			DailyDigests object = new Gson().fromJson(json, DailyDigests.class);
			writeExcel(7,i,object.getActiveKilocalories(),sheet);
			writeExcel(8,i,object.getDistanceInMeters(),sheet);
			writeExcelString(9,i,object.getActivityType(),sheet);
			writeExcel(10,i,object.getMaxStressLevel(),sheet);
			writeExcel(11,i,object.getAverageHeartRateInBeatsPerMinute(),sheet);
			writeExcel(12,i,object.getRestStressDurationInSeconds(),sheet);
			writeExcel(13,i,object.getRestingHeartRateInBeatsPerMinute(),sheet);
			writeExcel(14,i,object.getMediumStressDurationInSeconds(),sheet);
			writeExcelLong(15,i,object.getStartTimeInSeconds(),sheet);
			writeExcelString(16,i,object.getStressQualifier(),sheet);
			writeExcel(17,i,object.getStepsGoal(),sheet);
			writeExcel(18,i,object.getLowStressDurationInSeconds(),sheet);
			writeExcel(19,i,object.getIntensityDurationGoalInSeconds(),sheet);
			writeExcel(20,i,object.getStressDurationInSeconds(),sheet);
			writeExcel(21,i,object.getActiveTimeInSeconds(),sheet);
			writeExcel(22,i,object.getActivityStressDurationInSeconds(),sheet);
			writeExcel(23,i,object.getFloorsClimbedGoal(),sheet);
			writeExcel(24,i,object.getMinHeartRateInBeatsPerMinute(),sheet);
			writeExcel(25,i,object.getHighStressDurationInSeconds(),sheet);
			writeExcel(26,i,object.getStartTimeOffsetInSeconds(),sheet);
			writeExcel(27,i,object.getSteps(),sheet);
			writeExcel(28,i,object.getDurationInSeconds(),sheet);
			writeExcel(29,i,object.getAverageStressLevel(),sheet);
			writeExcel(30,i,object.getMaxHeartRateInBeatsPerMinute(),sheet);
			writeExcelDouble(31,i,object.getHeartAverage(),sheet);
	    }
				
		
		workbook.write();
		workbook.close();

		session.getTransaction().commit();
		session.close();
		
	}
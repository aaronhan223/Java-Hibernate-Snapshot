package ut.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */

import org.hibernate.Session;

import com.google.gson.Gson;

import ut.config.HibernateUtil;
import ut.entity.Timeseries;
import ut.entity.source.garmin.BodyComps;
import ut.entity.source.garmin.GnSleepRecords;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		/** test case 1 **/

		// // Check database version
		// String sql = "select count(*) from Timeseries;";
		// BigInteger result = (BigInteger)
		// session.createNativeQuery(sql).getSingleResult();
		// System.out.println(result);

		// /** test case 2 **/
//		List<Timeseries> list = session
//				.createQuery("from Timeseries where " + "stream_major = 1" + "and stream_minor=3").setMaxResults(1)
//				.list(); // here
//		// should
//		System.out.println(list.get(0));
//		String json = list.get(0).getBlob();
//		System.out.println(json);
//
//		GnSleepRecords sleepRecords = new Gson().fromJson(json, GnSleepRecords.class);
//		System.out.println(sleepRecords.getDeepSleepDurationInSeconds());
//		System.out.println(sleepRecords.getLightSleepDurationInSeconds());
//
//		System.out.println(sleepRecords.getSleepLevelsMap().getDeep().size());
//		System.out.println(sleepRecords.getSleepLevelsMap().getLight().size());
//		System.out.println(sleepRecords.getSleepLevelsMap().getAwake().size());
//
//		System.out.println(sleepRecords);
		// /** test case 3 **/
		// List<Timeseries> list = session.createQuery("from
		// Person").setMaxResults(1).list();
		// System.out.println(list.get(0));
		
		//test case 4
		List<Timeseries> list = session
				.createQuery("from Timeseries where " + "stream_major = 1" + "and stream_minor=5")
				.list();
//		System.out.println(list.size());
//		System.out.println(list.get(1));
		ArrayList<Long> original;
		for (int i = 0; i < list.size(); i++) {
			String json = list.get(0).getBlob();
			BodyComps bodyComps = new Gson().fromJson(json, BodyComps.class);			
			original.add(bodyComps.getMeasurementTimeInSeconds());
		}
		Set<Long> unique_num = new HashSet<Long>(original);
		System.out.println(unique_num.size());
//		BodyComps bodyComps = new Gson().fromJson(json, BodyComps.class);
//		System.out.println(bodyComps.getMeasurementTimeOffsetInSeconds());
//		System.out.println(bodyComps);

		session.getTransaction().commit();
		session.close();
	}
}

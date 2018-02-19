package ut.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import org.hibernate.Session;
import ut.config.HibernateUtil;

public class DataStats {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		ClassLoader classLoader = new DataStats().getClass().getClassLoader();
		String fileName = "resources/mappings";
		
		String line = null;
		try {
			FileReader fileReader = new FileReader(classLoader.getResource(fileName).getFile());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				String[] values = line.trim().split("\\s+");
				assert (values.length == 3);
				String key = values[0];
				int major = Integer.valueOf(values[1]);
				int minor = Integer.valueOf(values[2]);

				// // Check database version
				String sql = String.format(
						"select count(*) from Timeseries where stream_major = %d and stream_minor = %d;", major, minor);
				BigInteger result = (BigInteger) session.createNativeQuery(sql).getSingleResult();
				System.out.println(String.format("key: %s, major: %d, minor: %d, count: %d", key, major, minor,
						result.intValue()));
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}

		session.getTransaction().commit();
		session.close();
	}

}
